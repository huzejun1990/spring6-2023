package com.dream.spring6.iocxml.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author : huzejun
 * @Date: 2023/2/6-0:35
 */
public class MyBeanPost implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean,
                                                  String beanName) throws BeansException {
        System.out.println("3 bean后置处理器，初始化之前执行");
        System.out.println(beanName+"::"+bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean,
                                                 String beanName) throws BeansException {
        System.out.println("5 bean后置处理器，初始化之后执行");
        System.out.println(beanName+"::"+bean);
        return bean;
    }
}
