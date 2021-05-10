package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //服务端启动类
public class SpringcloudEruka7002Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEruka7002Application.class, args);
    }

}
