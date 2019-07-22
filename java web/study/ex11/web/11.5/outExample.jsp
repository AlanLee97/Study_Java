<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/25
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    session.setAttribute("msg","这是<c:out>示例");
%>
<c:out value="${msg}"></c:out>
</body>
</html>
