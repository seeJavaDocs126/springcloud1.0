package com.joyin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class ModuleProviderHystrix8001_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(ModuleProviderHystrix8001_App.class, args);
	}
}
