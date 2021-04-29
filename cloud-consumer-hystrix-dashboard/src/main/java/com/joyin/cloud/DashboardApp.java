package com.joyin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author wd
 * @Classname DashboardApp
 * @Description TODO
 * @Date 2021-04-27 7:41
 * @Version V1.0
 */
@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
public class DashboardApp {
    public static void main(String[] args) {
        SpringApplication.run(DashboardApp.class,args);
    }
}
