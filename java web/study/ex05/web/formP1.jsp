<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/3/21
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>5.4 隐藏表单1</title>
</head>
<body>
<%
    String str = "12";
    int num = Integer.parseInt(str);
%>
<p>该数的平方为：<%=num * num%></p>
<hr>

<%--&lt;%&ndash;<form action="formP2.jsp" method="get">&ndash;%&gt;//默认提交方式为get--%>
<form action="formP2.jsp" method="post">
    <input hidden type="text" name="num" value="<%=num%>">
    <input type="submit" value="到达p2">
</form>

</body>
</html>
