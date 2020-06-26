package com.demo.test;


import com.demo.mybatis.io.Resources;
import com.demo.mybatis.sqlsession.SqlSession;
import com.demo.mybatis.sqlsession.SqlSessionFactory;
import com.demo.mybatis.sqlsession.SqlSessionFactoryBuilder;
import com.demo.test.dao.IUserDao;
import com.demo.test.pojo.User;

import java.io.InputStream;
import java.util.List;


public class Test   {


    public static void main(String[] args) throws Exception {
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        SqlSessionFactory factory = builder.build(in);

        SqlSession session = factory.openSession();

        IUserDao userDao = session.getMapper(IUserDao.class);
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
        session.close();
        in.close();
    }
}
