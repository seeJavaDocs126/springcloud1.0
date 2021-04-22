package com.joyin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import com.joyin.myrule.RuleConfigure;

@SpringBootApplication
@EnableEurekaClient
//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
//放在其他配置类上，没效果
@RibbonClient(name="CLOUD-MODULE",configuration = RuleConfigure.class)
public class ModuleConsumer80_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(ModuleConsumer80_App.class, args);
	}
}
