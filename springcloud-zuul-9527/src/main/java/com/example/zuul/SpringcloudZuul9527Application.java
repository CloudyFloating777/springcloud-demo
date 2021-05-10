package com.example.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class SpringcloudZuul9527Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudZuul9527Application.class, args);
    }

}
