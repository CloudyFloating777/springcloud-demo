package com.example.springcloud.mapper;

import com.example.springcloudapi.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptMapper {

    public List<Dept> queryAll();
}

