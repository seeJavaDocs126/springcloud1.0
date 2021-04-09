package com.joyin.cloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//boot -->spring   applicationContext.xml --- @Configuration配置   ConfigBean = applicationContext.xml
@Configuration
public class ConfigBean
{
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}