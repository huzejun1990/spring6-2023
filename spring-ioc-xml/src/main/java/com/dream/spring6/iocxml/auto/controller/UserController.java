package com.dream.spring6.iocxml.auto.controller;

import com.dream.spring6.iocxml.auto.service.UserService;
import com.dream.spring6.iocxml.auto.service.UserServiceImpl;

/**
 * @Author : huzejun
 * @Date: 2023/2/6-0:58
 */
public class UserController {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser() {
        System.out.println("controller方法执行了...");
        //调用service方法
        userService.addUserService();
//        UserService userService = new UserServiceImpl();
    }
}
