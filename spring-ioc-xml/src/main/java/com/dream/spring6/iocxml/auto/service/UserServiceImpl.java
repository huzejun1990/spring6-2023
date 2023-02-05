package com.dream.spring6.iocxml.auto.service;

import com.dream.spring6.iocxml.auto.dao.UserDao;
import com.dream.spring6.iocxml.auto.dao.UserDaoImpl;

/**
 * @Author : huzejun
 * @Date: 2023/2/6-0:59
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUserService() {
        System.out.println("UserService方法执行了...");
        userDao.addUserDao();
//        UserDao userDao = new UserDaoImpl();
//        userDao.addUserDao();
    }
}
