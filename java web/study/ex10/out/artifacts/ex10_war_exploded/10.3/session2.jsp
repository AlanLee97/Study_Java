<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/20
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="student" class="c10_1.Student" scope="session">
</jsp:useBean>
<p>当前页面：session2.jsp</p>
<p>学生姓名：<jsp:getProperty name="student" property="stuname"></jsp:getProperty></p>
</body>
</html>
