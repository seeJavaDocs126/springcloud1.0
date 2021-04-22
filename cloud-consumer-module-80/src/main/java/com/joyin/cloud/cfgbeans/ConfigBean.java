package com.joyin.cloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//boot -->spring   applicationContext.xml --- @Configuration配置   ConfigBean = applicationContext.xml
@Configuration
public class ConfigBean
{
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

//	@Bean
//	public IRule testRule(){
//		return new RandomRule();
//	}

}