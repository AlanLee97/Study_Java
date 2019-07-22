<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/4
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>response对象</title>
</head>
<body>
response.sendRedirect跳转：URL地址栏是跳转的地址
<%--<%--%>
    <%--response.sendRedirect("../index.jsp");--%>
    <%----%>
<%--%>--%>

动作指令跳转：URL地址栏还是显示当前页面的地址
<jsp:forward page="../index.jsp"></jsp:forward>

</body>
</html>
