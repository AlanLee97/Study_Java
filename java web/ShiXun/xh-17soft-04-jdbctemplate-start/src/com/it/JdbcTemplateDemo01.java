/**
 * JdbcTemplate快速入门
 * 实现添加用户的功能
 */

package com.it;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Date;

public class JdbcTemplateDemo01 {
    public static void main(String[] args) {
        //01 创建JdbcTemplate类的对象，在构造方法中传入数据库连接池
        //JdbcTemplate字段去数据库连接池中获取一个可用的连接
        JdbcTemplate jt = new JdbcTemplate(DataSourceUtil.getDataSource());

        //02 编写sql语句，支持？占位符
        String sql = "insert into user values(null,?,?,?)";

        //03 根据占位符的个数，创建一个数组，为占位符一一设值
        Object[] params = {"Lee", "123456", new Date()};

        //04 执行sql语句，并闯入占位符对应的值
        int count = jt.update(sql, params);

        //05 输出结果
        System.out.println(count > 0 ? "注册成功" : "注册失败");

        //06 关闭资源
        //只要使用JdbcTemplate工具类，不需要关闭资源，因为这个类帮你关闭资源了
    }
}
