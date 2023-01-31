package com.dream.spring6;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : huzejun
 * @Date: 2023/1/31-23:12
 */
public class TestUser {

    //创建Logger对象
    private Logger logger = LoggerFactory.getLogger(TestUser.class);

    @Test
    public void testUserObject() {
        //加载spring的配置文件，对象创建
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");

        //获取创建的对象
        User user = (User) context.getBean("user");
        System.out.println("1:"+user);

        //使用对象调用方法进行测试
        System.out.print("2:");
        user.add();

        //手动写日志
        logger.info("### 执行调用成功了。。。");

    }

    //反射创建对象
    @Test
    public void testUserObject01() throws Exception {
        // 获取类的Class对象
        Class clazz = Class.forName("com.dream.spring6.User");
        //调用方法创建对象
//        Object o = clazz.newInstance();
        User user = (User) clazz.getDeclaredConstructor().newInstance();
        System.out.println(user);
    }

}
