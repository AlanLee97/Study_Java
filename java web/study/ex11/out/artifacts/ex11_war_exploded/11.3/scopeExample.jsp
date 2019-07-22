<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/20
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    application.setAttribute("applicationMsg", "welcome application");
    session.setAttribute("sessionMsg", "welcome, session");
%>
<p>application内的内容为：${applicationScope.applicationMsg}</p>
<p>application内的内容为：${applicationMsg}</p>
<p>session内的内容为：${sessionScope.sessionMsg}</p>
<p>session内的内容为：${sessionMsg}</p>
</body>
</html>
