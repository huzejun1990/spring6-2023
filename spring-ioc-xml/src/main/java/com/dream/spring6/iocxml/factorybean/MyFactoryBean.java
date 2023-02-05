package com.dream.spring6.iocxml.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author : huzejun
 * @Date: 2023/2/6-0:47
 */
public class MyFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
