<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/3/7
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>jsp练习</title>
  </head>
  <body>
    <h2>4.4程序段</h2>
    <%
      for(int i = 0; i < 10; i++){
        out.println("for循环 :" + i);
    %>

    <%
      }
    %>


  <h2>4.5jsp声明</h2>
    <%
      String str1 = "Hello Horld";
      out.println(str1);

    %>


    <%
      out.println(str2);
    %>

    <%!
      //加了!  变成全局变量
      String str2 = "Hello World!";
    %>

    <h2>4.6 URL传值</h2>
    <%
      String stringNum = "10";
      int num = Integer.parseInt(stringNum);
    %>
    <p>该数字的平方为：<%= num * num %></p>
    <a href="test.jsp?num=<%= num %>">链接跳转</a>
  </body>
</html>
