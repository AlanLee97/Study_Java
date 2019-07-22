package com.it;

import org.junit.Test;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * 使用JdbcTemplate进行修改，查询，删除操作
 */
public class JdbcTemplateDemo02 {

    private JdbcTemplate jt = new JdbcTemplate(DataSourceUtil.getDataSource());

    /**
     * 需求1：修改id=1的用户的密码
     *
     */
    @Test
    public void update(){
        String sql = "update user set password=? where id=?";
        Object[] params = {"111111",1};
        int count = jt.update(sql,params);
        System.out.println(count > 0 ? "修改成功" : "修改失败");
    }


    /**
     * 需求2：查询所有用户
     */
    @Test
    public void findAllUser(){
        String sql = "select id,username,password,birthday from user";
//        String sql = "select * from user";
        List<User> userList = jt.query(sql, new BeanPropertyRowMapper<User>(User.class));

        //打印结果
        for (User user : userList) {
            System.out.println(user);
        }

    }

    /**
     * 需求3：根据用户名，密码查询某个用户
     */
    @Test
    public void findByNameAndPwd(){
        String sql = "select * from user where username=? and password=?";
        Object[] params = {"Alan","123456"};
        //查询所有用户用query()
        //查询单个用户用queryForObject()
        User user = null;
        try {
            user = jt.queryForObject(sql,params,new BeanPropertyRowMapper<User>(User.class));
        } catch (DataAccessException e) {
            e.printStackTrace();
        }

        if (user != null){
            System.out.println("查询成功");
        }else {
            System.out.println("查询失败");
        }

    }

    /**
     * 需求4：删除id=1的用户
     */
    @Test
    public void delete(){
        String sql = "delete from user where id = ?";
        Object[] params = {1};
        int count = jt.update(sql,params);
        System.out.println(count > 0 ? "删除成功" : "删除失败");
    }
}
