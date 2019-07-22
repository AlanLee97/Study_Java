<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/3/14
  Time: 23:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>JSP练习</title>
  </head>

  <body>
  <h2>4.7.1 JSP指令</h2>
  <h3>1.导入包</h3>
  <%@page import="java.util.Date" language="java"%>
  <p>当前时间是：</p>
  <%
    out.print(new Date());

  %>
  <hr>

  <h3>2.设定字符集</h3>
  <%@page pageEncoding="UTF-8" %>
  <p>测试设定字符集</p>
  <hr>

  <h3>3.设定错误页面</h3>
  <%@page errorPage="errorPage.jsp" %>
  <form action="" method="get" name="myform">
    <input type="text" name="i1">
    <label> + </label>
    <input type="text" name="i2">
    <label> = </label>
    <input type="text" name="sum">
    <br>
    <input type="submit" value="计算">
  </form>
  <%--<%--%>
    <%--int i1 = Integer.parseInt(request.getParameter("i1"));--%>
    <%--int i2 = Integer.parseInt(request.getParameter("i2"));--%>
    <%--int sum = i2 / i1;--%>
    <%--out.print(sum);--%>

  <%--%>--%>

  <h3>4.设定MIME类型和字符编码</h3>
  <%--<%@page contentType="text/html; charset=UTF-8" %>--%>
  <hr>

  <h3>5.include指令</h3>
<%@include file="info.jsp"%>

  <hr>
  <hr>

  <h2>4.7.2 jsp动作</h2>
  <h3>include包含</h3>
  <jsp:include page="info.jsp"></jsp:include>

  <h3>forward 跳转</h3>
  <jsp:forward page="info.jsp"></jsp:forward>
  </body>
</html>
