package com.dream.spring6.iocxml.auto.dao;

/**
 * @Author : huzejun
 * @Date: 2023/2/6-1:00
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void addUserDao() {
        System.out.println("userDao方法执行了...");
    }
}
