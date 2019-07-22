/**
 * Druid连接池快速入门01
 * 数据库连接池在企业中常以工具类的形式出现
 */

package com.it;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Properties;

public class DruidDemo01 {
    public static void main(String[] args) throws Exception {
        //01 加载配置文件
        Properties props = new Properties();
        props.load(DruidDemo01.class.getClassLoader().getResourceAsStream("druid.properties"));

        //02 获取数据库连接池
        DataSource dataSource = DruidDataSourceFactory.createDataSource(props);

        //03 获取连接
        Connection conn = dataSource.getConnection();

        //04 测试是否获取到了连接
        System.out.println(conn);

        //05 将连接归还给数据库连接池
        conn.close();

    }
}
