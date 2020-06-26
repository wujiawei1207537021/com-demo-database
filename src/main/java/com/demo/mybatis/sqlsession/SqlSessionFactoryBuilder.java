package com.demo.mybatis.sqlsession;

import com.demo.mybatis.cfg.Configuration;
import com.demo.mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import com.demo.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;


public class SqlSessionFactoryBuilder {

    /**
     * 根据参数的字节输入流来构建一个SqlSessionFactory工厂
     * @param config
     * @return
     */
    public SqlSessionFactory build(InputStream config){
        Configuration cfg = XMLConfigBuilder.loadConfiguration(config);
        return  new DefaultSqlSessionFactory(cfg);
    }
}
