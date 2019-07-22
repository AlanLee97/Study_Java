<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/11
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String str = "12";
    int number = Integer.parseInt(str);
    
%>
<p>该数的平方为：<%= number * number%></p>
<%
    Cookie cookie = new Cookie("number",str);
    cookie.setMaxAge(600);
    response.addCookie(cookie);
%>
<br>
<a href="cookieP2.jsp">到达p2</a>
</body>
</html>
