<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/11
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>setHeader</title>
</head>
<body>
<%
    response.setHeader("Pragma","No-cache");
    response.setHeader("Cache-Control","no-cache");
    response.setDateHeader("Expires", 0);
    response.setHeader("Refresh","2");  //每2秒刷新一次网页
%>
</body>
</html>
