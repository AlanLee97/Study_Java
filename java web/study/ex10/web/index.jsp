<%@ page import="c10_1.Student" %><%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/19
  Time: 12:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%--<%--%>
    <%--Student student = new Student();--%>
    <%--student.setStuname("AlanLee");--%>
    <%--String name = student.getStuname();--%>
    <%--out.print(name);--%>
  <%--%>--%>

  <jsp:useBean id="student" class="c10_1.Student"></jsp:useBean>

  <%
    student.setStuname("AlanLee");
    String name = student.getStuname();
    out.print(name);
  %>
  </body>
</html>
