<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/11
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    //页面可以输出数据
    <jsp:forward page="responseTest6.jsp"></jsp:forward>

    //采用sendRedirect()方法输出的内容为null,因为它不能共享转发的数据
    <%--<%--%>
        <%--response.sendRedirect("responseTest6.jsp");--%>
    <%--%>--%>
</body>
</html>
