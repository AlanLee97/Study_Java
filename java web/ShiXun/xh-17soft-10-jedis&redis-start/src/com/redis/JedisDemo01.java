package com.redis;


import redis.clients.jedis.Jedis;

/**
 * Redis客户端
 */
public class JedisDemo01 {
    public static void main(String[] args) {
        //创建Jedis对象
        Jedis jedis = new Jedis("localhost",6379);

        //向数据库中添加数据
        jedis.set("USERNAME", "AlanLee");

        //获取数据
        String username = jedis.get("USERNAME");
        System.out.println(username);

        //关闭连接
        jedis.close();


    }

}
