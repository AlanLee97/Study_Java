<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/7/7
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示所有学生信息</title>

    <style>
        td{
            text-align: center;
        }
    </style>
</head>
<body>
    <c:choose>

        <%--相当于java中的if...else--%>
        <c:when test="${!empty STUDENT_LIST}">
            <table border="1" align="center" width="70%">
                <tr>
                    <th>学生编号</th>
                    <th>用户名</th>
                    <th>密码</th>
                    <th>性别</th>
                    <th>分数</th>
                </tr>

                <%--循环打印数据--%>
                <c:forEach var="stu" items="${STUDENT_LIST}">
                    <tr>
                        <td>${stu.id}</td>
                        <td>${stu.username}</td>
                        <td>${stu.password}</td>
                        <td>${stu.gender}</td>
                        <td>${stu.score}</td>
                    </tr>
                </c:forEach>

            </table>

        </c:when>

        <c:otherwise>
            <h1>没有查到学生信息</h1>
        </c:otherwise>
    </c:choose>

</body>
</html>
