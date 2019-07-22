package com.it;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JdbcDemo {
    public static void main(String[] args) throws Exception {

        //01 通过反射找到驱动类
        Class.forName("com.mysql.jdbc.Driver");
        //02 配置连接参数：url、数据库用户名、数据库密码
        String url = "jdbc:mysql://localhost:3307/train";
        String db_name = "root";
        String db_pwd = "123456";

        //03 连接数据库
        Connection conn = DriverManager.getConnection(url,db_name,db_pwd);

        //04 编写sql语句
        String sql = "insert into user values(null,?,?,?)";

        //05 获取执行sql语句的对象
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,"Lee");
        pstmt.setString(2,"123");
//        pstmt.setDate(3,new java.sql.Date(new Date().getTime()));

        /**
         * 获取指定日期的方式
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String birthday = "2019-7-7";
        Date date = sdf.parse(birthday);
        pstmt.setDate(3,new java.sql.Date(date.getTime()));

        //06 执行sql语句
        int count = pstmt.executeUpdate();

        //07 关闭资源
        pstmt.close();
        conn.close();

        System.out.println(count > 0 ? "注册成功" : "注册失败");
    }
}
