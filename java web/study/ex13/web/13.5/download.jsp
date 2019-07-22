<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/5/10
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String filename = request.getParameter("file");
    response.setHeader("Content-Disposition","attachment;filename=" + filename);

    response.setContentType("image/jpeg");
    RequestDispatcher rd = request.getRequestDispatcher("/files/" + filename);
    rd.forward(request,response);
%>
</body>
</html>
