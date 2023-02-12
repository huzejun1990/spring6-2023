package com.dream.spring6.aop.example;

/**
 * @Author : huzejun
 * @Date: 2023/2/12-22:32
 */
public class TestCal {

    public static void main(String[] args) {
        //创建代理对象（动态）
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
//        proxy.add(1,2);

        proxy.mul(2,4);
    }
}
