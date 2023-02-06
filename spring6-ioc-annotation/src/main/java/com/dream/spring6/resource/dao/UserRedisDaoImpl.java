package com.dream.spring6.resource.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author : huzejun
 * @Date: 2023/2/7-0:34
 */

@Repository("myUserRedisDao")
public class UserRedisDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao redis.....");
    }
}
