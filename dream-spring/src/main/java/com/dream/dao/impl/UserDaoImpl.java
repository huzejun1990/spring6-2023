package com.dream.dao.impl;

import com.dream.anno.Bean;
import com.dream.dao.UserDao;

/**
 * @Author : huzejun
 * @Date: 2023/2/8-3:11
 */
@Bean
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao........");
    }
}
