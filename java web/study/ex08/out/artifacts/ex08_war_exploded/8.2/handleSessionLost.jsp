<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/18
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="" method="post">
    <label 请输入书本：></label>
    <input type="text" name="book" >
    <input type="submit" name="" value="添加到购物车">

</form>
<hr>
<%
    ArrayList books = (ArrayList) session.getAttribute("booksSet");
    if (books == null){
        books = new ArrayList();
        session.setAttribute("booksSet", books);

    }

    String book = request.getParameter("book");
    if (book != null){
        book = new String(book.getBytes("ISO-8859-1"));
        books.add(book);
    }

%>
<h2>购物车中的内容为：</h2>
<%
    for (Object o: books) {
        out.println(o + "<br>");
    }
%>
</body>
</html>
