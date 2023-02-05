package com.dream.spring6.iocxml.life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : huzejun
 * @Date: 2023/2/5-21:26
 */
public class TestUser {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean-life.xml");
        User user = context.getBean("user", User.class);
        System.out.println("6 bean对象创建完成了，可以使用了");
        System.out.println(user);
        context.close();    //销毁
    }
}
