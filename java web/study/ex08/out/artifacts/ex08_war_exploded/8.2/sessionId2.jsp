<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/18
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>sessionId1</title>
</head>
<body>
<%
    String id = session.getId();
    out.print("当前id为：" + id);
%>
<hr>


</body>
</html>
