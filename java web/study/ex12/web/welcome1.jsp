<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/26
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script>
    function showInfo() {
        window.location = "info.jsp";
    }
</script>
<h2>欢迎来到本系统！</h2>
<input type="submit" value="显示学生信息" onclick="showInfo()">
</body>
</html>
