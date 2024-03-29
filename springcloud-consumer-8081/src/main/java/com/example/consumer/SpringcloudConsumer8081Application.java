package com.example.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringcloudConsumer8081Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsumer8081Application.class, args);
    }

}
