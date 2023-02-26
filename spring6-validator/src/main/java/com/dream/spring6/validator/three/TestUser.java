package com.dream.spring6.validator.three;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author : huzejun
 * @Date: 2023/2/27-0:36
 */
public class TestUser {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyService service = context.getBean(MyService.class);
        User user = new User();
        user.setName("lucy");
        user.setPhone("13800138000");
        user.setMessage("1");
        service.testMethod(user);
    }
}
