package com.dream.spring6.iocxml.ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : huzejun
 * @Date: 2023/2/4-19:45
 */
public class TestDept {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-dilist.xml");

        //员工对象
        Dept dept = context.getBean("dept", Dept.class);
        dept.info();
    }
}
