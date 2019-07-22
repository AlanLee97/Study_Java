<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/5/16
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=gb2312" language="java" %>
<%@ page pageEncoding="GB2312" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%

    String data = request.getParameter("data");
    byte[] deCodeData = data.getBytes("ISO-8859-1");
    data = new String(deCodeData);
%>
<p>数据：<%=data%></p>
<br><hr>
<%
    String btnName = request.getParameter("submit");
    byte[] tmp = btnName.getBytes("ISO-8859-1");
    btnName = new String(tmp);
%>
<p>按钮名字：<%=btnName%></p>
</body>
</html>
