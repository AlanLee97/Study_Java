<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/3/15
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>5.2.4 获取单选按钮的数据</title>
</head>
<body>
<form action="" method="post">
    <input type="radio" name="sex" value="male" checked="checked">男
    <input type="radio" name="sex" value="female">女
    <input type="submit" value="提交">
</form>
<%
    String sex = request.getParameter("sex");

    out.print("你的性别是：" + sex);

%>

</body>
</html>
