<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/28
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>欢迎登录本系统！</h2>
<form action="/servlets/ValidateServlet" method="get" name="loginForm">
    <label>帐号：</label><input type="text" ><br>
    <label>密码：</label><input type="password" ><br>
    <label>验证码：</label><input type="text" name="validateCode" size="10">
    <img src="validate.jsp" alt="验证码" border="0" onclick="refresh()" name="validateImg">
    <br>

    <input type="submit" value="登录">


</form>
<script>
    function refresh() {
        loginForm.validateImg.src = "validate.jsp?id=" + Math.random();
    }
</script>
</body>
</html>
