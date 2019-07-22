<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/19
  Time: 23:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="student" class="c10_1.Student"></jsp:useBean>

<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:setProperty name="student" property="stuname" param="stuName"></jsp:setProperty>
<%--<%=student.getStuname()%>--%>
<jsp:getProperty name="student" property="stuname"></jsp:getProperty>
</body>
</html>
