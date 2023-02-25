package com.dream.spring6.springi18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;

/**
 * @Author : huzejun
 * @Date: 2023/2/25-22:19
 */
public class ResourceI18n {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        Object[] objs = new Object[]{"baidu",new Date().toString()};
        String value = context.getMessage("www.baidu.com", objs, Locale.CHINA);
        System.out.println(value);
    }
}
