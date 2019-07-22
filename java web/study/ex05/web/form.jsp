<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/3/15
  Time: 8:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>5.1.2 定义表单</title>
</head>
<body>
<form action="" method="get">
    <label>帐号：</label><input type="text" name="account">
    <label>密码：</label><input type="password" name="password">
    <input type="submit" value="提交">
</form>
<p>你提交的信息是：</p>
<%
    String account = request.getParameter("account");
    String password = request.getParameter("password");

%>
<p>帐号：<%= account%></p>
<p>密码：<%= password%></p>
</body>
</html>
