<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/3/15
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>document2</title>
</head>
<body>
<button onclick="fun()">获取数据</button>
<p id="p1"></p>
<script>
    function fun() {
        document.title = "我设置的标题";
        var windowTitle = document.title;
        alert("当前网页的网址为" + document.location);
        document.getElementById("p1").innerHTML = "当前网页的标题为：" + windowTitle;
    }

</script>

</body>
</html>
