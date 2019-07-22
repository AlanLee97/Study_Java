<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/20
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="beans.Student" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Student student = new Student();
    student.setStuno("0001");
    student.setStuname("AlanLee");

    session.setAttribute("student",student);



%>
<p>学号：${student.stuno}</p>
<p>姓名：${session.student.stuname}</p>
<a href="test.jsp?m=3&n=4">到达test.jsp</a>
</body>
</html>
