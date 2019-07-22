<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/4
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>request对象</title>
</head>
<body>
提交方式：<%= request.getMethod() %>  <br>
请求URL的地址：<%= request.getRequestURI() %>  <br>
协议名称：<%= request.getProtocol() %>  <br>
客户端请求服务器文件的路径：<%= request.getServletPath() %>  <br>
URL查询部分：<%= request.getQueryString() %>  <br>
服务器的名称：<%= request.getServerName() %>  <br>
服务器的端口：<%= request.getServerPort() %>  <br>
远程客户端的IP地址：<%= request.getRemoteAddr() %>  <br>
</body>
</html>
