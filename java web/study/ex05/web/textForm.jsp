<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/3/15
  Time: 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>5.2.1 单一表单元素的获取</title>
</head>
<body>
<h2>获取文本框中的数据</h2>
<form action="" method="get">
    <p>请输入学生姓名：</p>
    <input type="text" name="stuName">
    <input type="submit" value="查询">
</form>
<%
    String stuName = request.getParameter("stuName");
    out.print("你输入的名字是：" + stuName);
%>
</body>
</html>
