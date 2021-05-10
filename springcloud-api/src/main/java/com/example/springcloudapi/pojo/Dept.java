package com.example.springcloudapi.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
public class Dept implements Serializable {

    public int deptno;
    public String dname;
    public String source;
}
