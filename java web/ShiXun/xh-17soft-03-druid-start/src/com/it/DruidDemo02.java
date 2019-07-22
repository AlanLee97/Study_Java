/**
 * 使用自己定义的数据库连接池工具类来向数据库中添加用户
 */

package com.it;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DruidDemo02 {
    public static void main(String[] args) throws Exception {
        //01 使用工具类获取连接池
        DataSource dataSource = DataSourceUtil.getDataSource();

        //02 从连接池中获取连接
        Connection conn = dataSource.getConnection();

        //03 编写sql语句
        String sql = "INSERT INTO `train`.`user`(`id`, `username`, `password`, `birthday`) VALUES (NULL, ?, ?, ?)";

        //04 获取执行sql的对象
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, "Alan");
        pstmt.setString(2, "123456");
        pstmt.setDate(3, new java.sql.Date(new Date().getTime()));

        //05 执行sql语句
        int count = pstmt.executeUpdate();

        //06 测试是否用户添加成功
        System.out.println(count>0 ? "注册成功" : "注册失败");

        //07 关闭资源
        pstmt.close();
        conn.close();
    }
}
