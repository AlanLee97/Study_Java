<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/5/28
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .box{
            width: 400px;
            height: 300px;
            border: mediumseagreen 2px solid;
        }
    </style>
</head>
<body>
<center>
    <div class="box">
    <form action="login.action" method="post">
        account: <input type="text" name="username"><br><br>
        password: <input type="password" name="password"><br><br>
        <input type="submit" name="submit" value="登录">
    </form>
    </div>
</center>
</body>
</html>
