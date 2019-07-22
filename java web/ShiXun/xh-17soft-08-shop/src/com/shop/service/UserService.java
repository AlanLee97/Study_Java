package com.shop.service;

import com.shop.dao.UserDao;
import com.shop.entity.User;
import com.shop.exception.NameExistsException;
import com.shop.util.Md5Util;

/**
 * 用户模块--service层
 */
public class UserService {
    //01 创建并调用Dao层对象的方法
    private UserDao userDao = new UserDao();

    /**
     * 用ajax查询用户名是否存在
     */
    public boolean checkUsername(String username) throws NameExistsException {


        //根据用户名检查该用户是否存在，存在则返回true，否则返回false
        boolean flag = false;

        flag = userDao.exists(username);

        // 判断用户名是否存在，存在则提示帐号正确，不存在则提示帐号不存在，请先注册
        if (flag){
            System.out.println("帐号正确2");
            throw new NameExistsException();

        }else {
            System.out.println("帐号不存在，请先注册2");
            return false;
        }




//        return userDao.exists(username) ? true : false;
    }

    //UserService.java
    /**
     * service层的用户注册方法
     * 在这里进行业务操作
     * 如：对用户名是否存在进行判断
     */
    public void register(User user) throws Exception {

        //02 获取用户名
        String username = user.getUsername();

        //03 根据用户名检查该用户是否存在，存在则返回true，否则返回false
        boolean flag = userDao.exists(username);

        //04 判断
        if (flag){
            System.out.println("该用户名已存在，请更换用户名");

            throw new NameExistsException();
        }else {
            //获取明文密码
            String password = user.getPassword();
            //将明文密码进行加密
            String passwordMd5 = Md5Util.encodeByMd5(password);
            //将加密后的密码再次封装到User对象中
            user.setPassword(passwordMd5);
            //调用Dao层中的注册方法对数据库进行访问
            userDao.register(user);
        }
    }


    /**
     * service层的用户登录方法
     * 在这里进行业务操作
     * 对明文密码进行加密，再传到Dao层
     */
    public User login(String username, String password) throws Exception {

        //将明文密码加密
        String passwordMd5 = Md5Util.encodeByMd5(password);

        //模拟系统出错的情况
//        int i = 1 / 0;

        //调用UserDao对象的方法
        return userDao.login(username, passwordMd5);
    }
}
