package com.demo.mybatis.cfg;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;


@Data
public class Configuration {

    private String driver;
    private String url;
    private String username;
    private String password;
    private Map<String, Mapper> mappers = new HashMap<String, Mapper>();


    public void setMappers(Map<String, Mapper> mappers) {
        this.mappers.putAll(mappers);//追加方式
    }


}
