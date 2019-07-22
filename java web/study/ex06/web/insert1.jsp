<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/3/22
  Time: 8:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>6.3.1 添加数据</title>
</head>
<body>
<%@page import="java.sql.*" %>
<%
    String driver_path = "sun.jdbc.odbc.JdbcOdbcDriver";
%>
<%
    Class.forName(driver_path).newInstance();
    Connection conn = DriverManager.getConnection("jdbc:odbc:DSSchool");
    Statement statement = conn.createStatement();
    String sql = "insert into T_STUDENT(STUNO,STUNAME,STUSEX) values ('0032','冯','男')";
    int i = statement.executeUpdate(sql);
    out.print("成功添加" + i + "行数据。");
    statement.close();
    conn.close();
%>
</body>
</html>
