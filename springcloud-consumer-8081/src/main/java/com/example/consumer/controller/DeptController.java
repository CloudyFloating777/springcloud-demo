package com.example.consumer.controller;

import com.example.springcloudapi.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private RestTemplate restTemplate;

    //由于用了Ribbon.不应该具体指定具体地址(localhost:8001)，而是应该指定一个服务名
    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

    @RequestMapping("/test")
    public List<Dept> queryAll(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept", List.class);
    }

}
