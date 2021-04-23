package com.joyin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.joyin.cloud")
public class ModuleConsumerFeign8080_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(ModuleConsumerFeign8080_App.class, args);
	}
}
