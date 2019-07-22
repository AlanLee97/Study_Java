/**
 * 数据库连接池工具类
 */

package com.it;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.util.Properties;

public class DataSourceUtil {

    //03 测试是否可用
//    public static void main(String[] args) {
//        DataSource dataSource = DataSourceUtil.getDataSource();
//        System.out.println(dataSource);
//    }

    private static DataSource dataSource;
    //01 加载配置文件,此过程只生成一次且加载该类时就生成，所以把该代码放在静态块里
    static {
        try{
            Properties props = new Properties();
            props.load(DataSourceUtil.class.getClassLoader().getResourceAsStream("druid.properties"));
            dataSource = DruidDataSourceFactory.createDataSource(props);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //02 定义获取数据库连接池的方法
    public static DataSource getDataSource() {
        return dataSource;
    }
}
