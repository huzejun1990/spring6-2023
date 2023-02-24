package com.dream.spring6.prefix;

import com.dream.spring6.di.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 * @Author : huzejun
 * @Date: 2023/2/24-22:37
 */
public class TestDemo {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:bean*.xml");
/*
        Resource resource = context.getResource("dream.txt");
        System.out.println(resource.getDescription());
*/
        User user = context.getBean(User.class);
        System.out.println(user);
    }
}
