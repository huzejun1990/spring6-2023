package com.dream.spring6;

/**
 * @Author : huzejun
 * @Date: 2023/1/31-23:00
 */
public class User {

    // 无参数构造


    public User() {
        System.out.println("0: 无参数构造执行了。。");
    }

    public void add(){
        System.out.println("add...");
    }

    public static void main(String[] args) {
        User user = new User();
        user.add();
    }
}
