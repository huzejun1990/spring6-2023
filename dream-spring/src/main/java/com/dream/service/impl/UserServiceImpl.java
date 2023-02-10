package com.dream.service.impl;

import com.dream.anno.Bean;
import com.dream.anno.Di;
import com.dream.dao.UserDao;
import com.dream.service.UserService;

/**
 * @Author : huzejun
 * @Date: 2023/2/8-3:10
 */
@Bean
public class UserServiceImpl implements UserService {

    @Di
    private UserDao userDao;


    public void add() {
        System.out.println("service........");
        //调用dao的方法
        userDao.add();

    }
}
