package com.dream.spring6.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Author : huzejun
 * @Date: 2023/2/17-2:13
 */
@SpringJUnitConfig(locations = "classpath:beans.xml")
public class JdbcTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 添加 修改 删除操作
    @Test
    public void testUpdate() {
/*        //1、添加操作
        //第一步 编写sql语句
        String sql = "INSERT INTO t_emp VALUES(NULL,?,?,?)";
        //第二步 调用jdbcTemplate的方法，传入相关操作
//        Object[] params = {"东方不败", 20, "未知"};
//        int rows = jdbcTemplate.update(sql, params);

        int rows = jdbcTemplate.update(sql, "林平之", 20, "未知");
        System.out.println(rows);*/

/*        //修改操作
        String sql = "update t_emp set name = ? where id = ?";
        int rows = jdbcTemplate.update(sql, "林平之-辟邪剑谱",3);
        System.out.println(rows);*/

        //3 删除操作
        String sql = "delete from t_emp where id = ?";
        int rows = jdbcTemplate.update(sql, 3);
        System.out.println(rows);
    }
}
