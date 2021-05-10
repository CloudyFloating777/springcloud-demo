package com.example.springcloudconsumerdeptfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients(basePackages = {"com.example.springcloudapi"})
@EnableEurekaClient
@SpringBootApplication
public class SpringcloudConsumerDeptFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsumerDeptFeignApplication.class, args);
    }

}
