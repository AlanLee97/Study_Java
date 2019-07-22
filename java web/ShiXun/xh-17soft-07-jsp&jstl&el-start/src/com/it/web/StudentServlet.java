package com.it.web;

import com.it.entity.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@javax.servlet.annotation.WebServlet("/student")
public class StudentServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        this.doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //01 创建集合，专用于Student对象
        List<Student> studentList = new ArrayList<>();

        //02 创建三个Student对象
        Student s1 = new Student(001,"Alan", "123456","男", 99);
        Student s2 = new Student(002,"Lee", "222","女", 96);
        Student s3 = new Student(003,"Tom", "321","男", 98);

        //03 将Student对象添加到集合中
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        //04 将studentList集合添加到request对象域中
        request.setAttribute("STUDENT_LIST", studentList);

        //05 将对象域转发到jsp中
        request.getRequestDispatcher("/list.jsp").forward(request, response);

    }
}
