<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/20
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="c10_1.Student" %>
<%@page import="c10_4.StudentDAO" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    StudentDAO studentDAO = new StudentDAO();
    studentDAO.testConnect();
%>
</body>
</html>
