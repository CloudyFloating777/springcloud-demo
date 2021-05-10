package com.example.springcloud.service.Impl;

import com.example.springcloud.mapper.DeptMapper;
import com.example.springcloud.service.DeptService;
import com.example.springcloudapi.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("DeptService")
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> queryAll() {
        return deptMapper.queryAll();
    }
}
