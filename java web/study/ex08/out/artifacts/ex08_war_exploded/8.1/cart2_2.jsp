<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/12
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    ArrayList books = new ArrayList();

%>
<p>购物车中内容为：</p>
<hr>
<%
    for (int i = 0; i < books.size(); i++){
        String book = (String)books.get(i);
        out.println(book + "<br>");
    }
%>
</body>
</html>
