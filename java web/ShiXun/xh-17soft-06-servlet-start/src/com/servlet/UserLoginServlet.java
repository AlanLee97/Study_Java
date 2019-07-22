package com.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;

@WebServlet("/userLogin")
public class UserLoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        this.doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //设置网页编码
        response.setContentType("text/html;charset=utf-8");

        if ("admin".equalsIgnoreCase(username) && "123".equals(password)){
            //在浏览器中输出
            response.getWriter().write("<h2 style='color:green'>登录成功</h2>");

            //在控制台中输出
            System.out.println("登录成功");
        }else {
            response.getWriter().write("<h2 style='color:red'>登录失败</h2>");
            System.out.println("登录失败");
        }
    }
}
