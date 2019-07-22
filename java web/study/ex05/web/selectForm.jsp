<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/3/15
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>5.2.4 获取下拉框的数据</title>
</head>
<body>
<form action="" method="post">
    <select name="city">
        <option value="bj">北京</option>
        <option value="sh">上海</option>
        <option value="gz">广州</option>
    </select>
    <input type="submit" value="提交">
</form>

<%
    String city = request.getParameter("city");
    out.print("你选择的城市是：" + city);
%>
</body>
</html>
