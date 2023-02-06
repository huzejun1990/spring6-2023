package com.dream.spring6.autowired.dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @Author : huzejun
 * @Date: 2023/2/6-18:24
 */

@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("dao.......");
    }
}
