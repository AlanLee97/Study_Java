package com.shop.web;

import com.shop.entity.User;
import com.shop.exception.NameExistsException;
import com.shop.service.UserService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

/**
 * 用户注册模块
 * --用户注册----register()
 * --用户登录----login()
 * --用户退出----logout()
 */

/**
 * 用户注册模块--表示(web)层
 */
@javax.servlet.annotation.WebServlet("/user")
public class UserServlet extends HttpServlet {

    private UserService userService = new UserService();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String method = request.getParameter("method");
        switch(method){
            case "register":
                this.register(request, response);
                break;

            case "login":
                this.login(request, response);
                break;

            case "logout":
                this.logout(request, response);
                break;

            case "loginCheck":
                this.checkUsernameExists(request, response);
                break;

            case "registerCheck":
                this.registerCheck(request, response);
                break;

            default:
                response.sendRedirect(request.getContextPath() + "/default.jsp");
                break;
        }
    }



    /**
     * 用户注册功能
     */
    private void register(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        try {
            //01 一次性获取请求数据(表单中提交的全部数据)
            Map<String, String[]> map = request.getParameterMap();

            //02 创建User对象，用来封装
            User user = new User();

            //03 使用工具类BeanUtil将Map的值一一封装到User对象中去
            BeanUtils.populate(user,map);

            //04 调用业务层对象的方法
//            UserService userService = new UserService();
            userService.register(user);

            //05 重定向到register_ok.jsp页面
            response.sendRedirect(request.getContextPath() + "/register_ok.jsp");


        } catch (NameExistsException e) {
            e.printStackTrace();
            request.setAttribute("MESSAGE", "用户名存在，请更换用户名");
            request.getRequestDispatcher("WEB-INF/message.jsp").forward(request,response);
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("系统错误，请联系管理员");
            request.setAttribute("MESSAGE", "系统错误，请联系管理员");
            request.getRequestDispatcher("WEB-INF/message.jsp").forward(request,response);
        }
    }


    /**
     * 用户登录功能
     */
    private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");


        try {


            //根据结果跳转到不同的页面
            User user = userService.login(username, password);
            if (user != null){
                //登录成功情况
                //将user对象放到HttpSession对象中
                request.getSession().setAttribute("USER", user);

                //重定向到default.jsp页面中
                response.sendRedirect(request.getContextPath() + "/default.jsp");
            }else{
                //登录失败情况
                request.setAttribute("MESSAGE", "帐号或密码错误");
                request.getRequestDispatcher("WEB-INF/message.jsp").forward(request,response);
            }


        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("MESSAGE", "系统出错，请联系管理员");
            request.getRequestDispatcher("WEB-INF/message.jsp").forward(request,response);
        }
    }


    /**
     * 用户退出功能
     */
    private void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //01 获取HttpSession对象
        HttpSession session = request.getSession();

        //02 销毁HttpSession对象
        session.invalidate();

        //03 重定向到default.jsp对象
        response.sendRedirect(request.getContextPath() + "/default.jsp");
    }


    /**
     * 用ajax检查用户名是否存在
     */
    private void checkUsernameExists(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        try {
            //获取用户名
            String username = request.getParameter("username");
            //调用service层的方法查询用户名
            boolean exists = userService.checkUsername(username);

            //根据返回值判断结果，如果为true，表示用户名存在
            if (!exists){
                response.getWriter().write("帐号不存在，请先注册");
            }

        } catch (NameExistsException e) {
            //如果为false，表示用户名不存在
            e.printStackTrace();

            response.getWriter().write("帐号正确");

        }




    }

    /**
     * 使用ajax验证注册时用户名是否存在
     */
    private void registerCheck(HttpServletRequest request, HttpServletResponse response) throws IOException {

        try {
            String username = request.getParameter("username");

            boolean exists = userService.checkUsername(username);

            if (!exists){
                response.getWriter().write("用户名可用");
            }

        } catch (NameExistsException e) {
            e.printStackTrace();

            response.getWriter().write("帐号存在，请更换帐号");

        }
    }

}
