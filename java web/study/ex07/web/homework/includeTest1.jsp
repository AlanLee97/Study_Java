<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/4
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>includeTest1</title>
</head>
<body>
<%
    out.print("欢迎来到本系统");
%>
<br>
<hr>
<%@include file="info.jsp"%>
</body>
</html>
