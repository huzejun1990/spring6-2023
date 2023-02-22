package com.dream.spring6.xmltx.dao;

/**
 * @Author : huzejun
 * @Date: 2023/2/21-21:53
 */
public interface BookDao {
    //根据图书id查询图书价格
    Integer getBookPriceByBookId(Integer bookId);

    //更新图书表库存量 -1
    void updateStock(Integer bookId);

    //更新用户表用户余额 - 图书价格
    void updateUserBalance(Integer userId, Integer price);
}
