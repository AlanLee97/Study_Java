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
    String str = null;
    Cookie[] cookies = request.getCookies();
    for (int i = 0; i < cookies.length; i++){
        if (cookies[i].getName().equals("number")){
            str = cookies[i].getValue();
            break;
        }
    }
    int number = Integer.parseInt(str);
    
%>
<p>该数的立方为：<%= number * number * number%></p>
<hr>
</body>
</html>
