<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/18
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>sessionLost</title>
</head>
<body>
<form action="" method="post">
    <label 请输入书本：></label>
    <input type="text" name="book" >
    <input type="submit" name="" value="添加到购物车">

</form>
<hr>
<%
    ArrayList books = new ArrayList();
    session.setAttribute("booksSet", books);
    String book = request.getParameter("book");
    if (book != null){
        book = new String(book.getBytes("ISO-8859-1"));
        books.add(book);
    }
%>

<h2>购物车中的内容是：</h2>
<%
    for (int i = 0; i < books.size(); i++) {
        out.println(books.get(i) + "<br>");
    }
%>
</body>
</html>
