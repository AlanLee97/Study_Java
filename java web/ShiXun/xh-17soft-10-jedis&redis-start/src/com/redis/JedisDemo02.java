package com.redis;


import redis.clients.jedis.Jedis;

/**
 * Redis客户端
 */
public class JedisDemo02 {
    public static void main(String[] args) {
        //获取连接池
        Jedis jedis = JedisUtil.getJedis();

        jedis.set("USERNAME","AlanLee");
        String username = jedis.get("USERNAME");
        System.out.println(username);


        //关闭连接
        jedis.close();


    }

}
