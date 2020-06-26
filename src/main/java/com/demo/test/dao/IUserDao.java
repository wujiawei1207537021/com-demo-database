package com.demo.test.dao;

import com.demo.test.pojo.User;

import java.util.List;


public interface IUserDao {
    //@Select("select * from user")
    List<User> findAll();
}
