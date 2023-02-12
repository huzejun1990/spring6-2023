package com.dream.spring6.aop.annoaop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author : huzejun
 * @Date: 2023/2/13-1:49
 */
//切面类
@Aspect //切面类
@Component    //ioc容器
public class LogAspect {

    //设置切入点和通知类型
    //切入点火表达式：execution(访问修饰符 增强方法返回类型 增强方法所在类全路径 方法名称（方法参数）)
    //通知类型：
    // 前置 @Before(value="切入点表达式配置切入点")
//    @Before(value = "execution(* com.dream.spring6.aop.annoaop.CalculatorImpl.*(..))")
    @Before(value = "execution(public int com.dream.spring6.aop.annoaop.CalculatorImpl.*(..))")
    public void beforeMethod() {
        System.out.println("Logger-->前置通知");
    }

    // 返回 @AfterReturning
    // 异常 @AfterThrowing
    // 后置 @After()
    // 环绕 @Around()
}
