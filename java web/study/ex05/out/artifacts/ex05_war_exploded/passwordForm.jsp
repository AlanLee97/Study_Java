<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/3/15
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>5.2.2 获取密码框中的数据</title>
</head>
<body>
<h3>注册帐号</h3>
<form action="" method="post">
    <label >帐号：</label><input type="text" name="username"><br>
    <label >密码：</label><input type="password" name="password"><br>
    <input type="submit" value="注册">
</form>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    out.println("<h3 style='color:green'>注册成功</h3>");
    out.println("<h2>" + "您的帐号为：" + username + "</h2>");
    out.println("您的密码为：" + password);

%>
</body>
</html>
