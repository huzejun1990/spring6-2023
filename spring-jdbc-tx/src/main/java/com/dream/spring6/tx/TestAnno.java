package com.dream.spring6.tx;

import com.dream.spring6.tx.config.SpringConfig;
import com.dream.spring6.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author : huzejun
 * @Date: 2023/2/22-22:42
 */
public class TestAnno {

    @Test
    public void testTxAnnotation() {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        BookController accountService = applicationContext.getBean("bookController",BookController.class);
        Integer[] bookIds = {1,2};
        accountService.checkout(bookIds,1);

    }

}
