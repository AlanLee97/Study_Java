<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/11
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    out.print("输入的学生的姓名是：" + request.getParameter("stuname"));
%>
</body>
</html>
