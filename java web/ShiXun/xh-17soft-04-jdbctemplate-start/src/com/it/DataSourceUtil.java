package com.it;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.util.Properties;

public class DataSourceUtil {

    public static DataSource getDataSource() {
        return dataSource;
    }

    private static DataSource dataSource;

    static {
        Properties props = new Properties();
        try {
            props.load(DataSourceUtil.class.getClassLoader().getResourceAsStream("druid.properties"));
            dataSource = DruidDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
