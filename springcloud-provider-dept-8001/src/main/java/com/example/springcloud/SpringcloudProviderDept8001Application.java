package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringcloudProviderDept8001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProviderDept8001Application.class, args);
    }

}
