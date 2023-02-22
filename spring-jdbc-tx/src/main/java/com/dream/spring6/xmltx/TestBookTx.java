package com.dream.spring6.xmltx;

import com.dream.spring6.xmltx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Author : huzejun
 * @Date: 2023/2/21-22:17
 */
@SpringJUnitConfig(locations = "classpath:beans-xml.xml")
public class TestBookTx {

    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook() {
        bookController.buyBook(1,1);
    }
}
