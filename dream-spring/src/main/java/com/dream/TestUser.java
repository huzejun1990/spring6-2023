package com.dream;

import com.dream.bean.AnnotationApplicationContext;
import com.dream.bean.ApplicationContext;
import com.dream.service.UserService;


/**
 * @Author : huzejun
 * @Date: 2023/2/10-22:22
 */
public class TestUser {

    public static void main(String[] args) {
//        ApplicationContext context =
//                new AnnotationApplicationContext("com.dream");

        ApplicationContext context =
                new AnnotationApplicationContext("com.dream");
//        new com.dream.bean.AnnotationApplicationContext("com.dream");
        UserService userService = (UserService) context.getBean(UserService.class);
        System.out.println(userService);
        userService.add();

    }
}
