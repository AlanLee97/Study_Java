package com.shop.dao;

import com.shop.entity.User;
import com.shop.util.DataSourceUtil;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 用户模块--Dao层
 */
//UserDao.java
public class UserDao {
    //获取数据库连接池
    JdbcTemplate jt = new JdbcTemplate(DataSourceUtil.getDataSource());


    /**
     * Dao层的用户注册方法
     */
    public void register(User user){
        String sql = "insert into tab_user values(null,?,?,?,?,?,?,?)";
        Object[] params = {
                user.getUsername(),
                user.getPassword(),
                user.getName(),
                user.getEmail(),
                user.getTelephone(),
                user.getBirthday(),
                user.getSex()
        };
        jt.update(sql, params);
    }

    //检查用户名是否存在的方法

    /**
     * 根据用户名判断该用户是否存在
     * 若存在，则返回true，否则返回false
     *
     */
    public boolean exists(String username) {
        try {
            //如果找到，表示数据库中存在该用户，返回true
            String sql = "select * from tab_user where username=?";
            Object[] params = {username};
            User user = jt.queryForObject(sql, params, new BeanPropertyRowMapper<User>(User.class));

            return true;
        } catch (DataAccessException e) {
            e.printStackTrace();

            //如果找不到，则表示数据库中没有这个用户，返回false
            return false;
        }
    }

    /**
     * 登录方法
     * @param username 用户名
     * @param passwordMd5 密文密码
     */
    public User login(String username, String passwordMd5) {
        try {
            //查询用户名和密码
            String sql = "select * from tab_user where username=? and password=?";
            Object[] params = {
                    username,
                    passwordMd5
            };

            return jt.queryForObject(sql, params, new BeanPropertyRowMapper<User>(User.class));
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }

    }
}
