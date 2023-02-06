package com.dream.spring6.autowired.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author : huzejun
 * @Date: 2023/2/7-0:34
 */

@Repository
public class UserRedisDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao redis.....");
    }
}
