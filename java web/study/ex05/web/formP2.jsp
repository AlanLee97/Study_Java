<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/3/21
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>5.4 隐藏表单2</title>
</head>
<body>
<%
    String str = request.getParameter("num");
    int num = Integer.parseInt(str);
%>
<p>该数的立方为：<%=num * num * num%></p>
</body>
</html>
