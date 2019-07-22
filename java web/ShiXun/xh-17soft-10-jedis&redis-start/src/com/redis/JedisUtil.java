package com.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisUtil {
    private static JedisPool pool = new JedisPool();

    static {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(10);
        config.setMaxWaitMillis(3000);

        pool = new JedisPool(config, "localhost", 6379);

    }

    public static Jedis getJedis(){
        return pool.getResource();
    }
}
