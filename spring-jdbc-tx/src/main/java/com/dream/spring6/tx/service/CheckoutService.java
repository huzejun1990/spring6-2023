package com.dream.spring6.tx.service;

/**
 * @Author : huzejun
 * @Date: 2023/2/22-21:24
 */
public interface CheckoutService {

    //买多本书的方法
    void checkout(Integer[] bookIds,Integer userId);
}
