<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/18
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>applicatioonTest1</title>
</head>
<body>
<%
    Integer count = (Integer)application.getAttribute("count");
    if (count == null){
        count = new Integer(0);

    }
    count++;
    application.setAttribute("count", count);
%>
<p>你是第<%=count%>个访问者</p>
</body>
</html>
