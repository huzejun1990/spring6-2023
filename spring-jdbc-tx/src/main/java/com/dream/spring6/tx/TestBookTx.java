package com.dream.spring6.tx;

import com.dream.spring6.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Author : huzejun
 * @Date: 2023/2/21-22:17
 */
@SpringJUnitConfig(locations = "classpath:beans.xml")
public class TestBookTx {

    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook() {
        bookController.buyBook(1,1);
    }
}
