<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/3/15
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>5.2.3 获取多行文本框的数据</title>
</head>
<body>
<form action="" method="post">
    <textarea name="multiText" id="multiTextID" cols="30" rows="10">

    </textarea>
    <input type="submit" value="提交">

</form>

<%
    String msg = request.getParameter("multiText");
    out.print("你输入的数据为：" + msg);
%>
</body>
</html>
