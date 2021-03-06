package com.springcloud.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//开启eureka客户端功能
@EnableEurekaClient
public class MicroOrderApplication8084 {
    public static void main(String[] args) {
        SpringApplication.run(MicroOrderApplication8084.class,args);
    }
}
