package com.dream.spring6;

/**
 * @Author : huzejun
 * @Date: 2023/1/31-23:00
 */
public class User {

    public void add(){
        System.out.println("add...");
    }

    public static void main(String[] args) {
        User user = new User();
        user.add();
    }
}
