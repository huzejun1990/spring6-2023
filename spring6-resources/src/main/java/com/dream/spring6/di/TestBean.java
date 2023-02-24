package com.dream.spring6.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : huzejun
 * @Date: 2023/2/24-22:33
 */
public class TestBean {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        ResourceBean resourceBean = context.getBean(ResourceBean.class);
        resourceBean.parse();

    }
}
