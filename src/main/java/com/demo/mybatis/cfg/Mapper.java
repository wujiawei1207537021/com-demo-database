package com.demo.mybatis.cfg;

import lombok.Data;


@Data
public class Mapper {
    private String queryString;//sql
    private String resultType;//实体类的全限定类名
}
