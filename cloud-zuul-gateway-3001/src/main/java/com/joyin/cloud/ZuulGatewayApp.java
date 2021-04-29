package com.joyin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author wd
 * @Classname ZuulGatewayApp
 * @Description TODO
 * @Date 2021-04-29 8:53
 * @Version V1.0
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulGatewayApp {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGatewayApp.class,args);
    }
}
