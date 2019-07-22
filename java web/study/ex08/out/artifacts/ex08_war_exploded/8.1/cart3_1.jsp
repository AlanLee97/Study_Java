<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/18
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>以下书本被加到购物车中</h2>
<%
    ArrayList books = new ArrayList();
    books.add("三国演义");
    books.add("水浒传");
    books.add("西游记");
    books.add("红楼梦");

    for (Object s : books) {
        out.println(s + "<br>");
    }

    session.setAttribute("booksSet",books);

%>

<a href="cart3_2.jsp">查看购物车</a>

</body>
</html>
