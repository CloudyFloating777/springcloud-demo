package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer //服务端启动类
@SpringBootApplication
public class SpringcloudEruka7001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEruka7001Application.class, args);
    }

}
