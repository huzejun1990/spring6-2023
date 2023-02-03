package com.dream.spring6.iocxml.bean;

/**
 * @Author : huzejun
 * @Date: 2023/2/2-21:04
 */
public class PersonDaoImpl implements UserDao{
    @Override
    public void run() {
        System.out.println("person run....");
    }
}
