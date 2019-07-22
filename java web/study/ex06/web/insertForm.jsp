<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/25
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="insert2.jsp" method="post">
    输入学号：<input type="text" name="stuno" ><br>
    输入姓名：<input type="text" name="stuname" ><br>
    选择性别：
    <select name="stusex">
    <option value="男">男</option>
    <option value="女">女</option>
</select>
    <input type="submit" value="提交">
</form>

</body>
</html>
