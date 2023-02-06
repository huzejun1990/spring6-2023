package com.dream.spring6.resource.service;

import com.dream.spring6.resource.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Author : huzejun
 * @Date: 2023/2/6-18:23
 */

@Service("myUserService")
public class UserServiceImpl implements UserService {

    //不指定名称，根据属性名称进行注入
    @Resource
    private UserDao myUserDao;

    @Override
    public void add() {
        System.out.println("service.....");
        myUserDao.add();
    }
}