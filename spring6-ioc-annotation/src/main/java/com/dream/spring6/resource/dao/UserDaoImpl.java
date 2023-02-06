package com.dream.spring6.resource.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author : huzejun
 * @Date: 2023/2/6-18:24
 */

@Repository("myUserDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao.......");
    }
}
