package com.example.provider.controller;


import com.example.provider.service.DeptService;
import com.example.springcloudapi.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/dept")
    public List<Dept> queryAll() {
        return deptService.queryAll();
    }
}
