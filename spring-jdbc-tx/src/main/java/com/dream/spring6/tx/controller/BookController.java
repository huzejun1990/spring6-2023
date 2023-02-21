package com.dream.spring6.tx.controller;

import com.dream.spring6.tx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author : huzejun
 * @Date: 2023/2/21-21:52
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    //买书的方法：图书id和用户id
    public void buyBook(Integer bookId,Integer userId) {
        //调用service的方法
        bookService.buyBook(bookId,userId);
    }
}
