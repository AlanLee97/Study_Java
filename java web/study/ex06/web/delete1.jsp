<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/25
  Time: 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
<body>
<%@page import="java.sql.*" %>
<%
    String driver_path = "sun.jdbc.odbc.JdbcOdbcDriver";
%>
<%
    Class.forName(driver_path).newInstance();
    Connection conn = DriverManager.getConnection("jdbc:odbc:DSSchool");
    Statement statement = conn.createStatement();
    String sql = "delete from T_STUDENT WHERE STUNO = '0032'";
    int i = statement.executeUpdate(sql);
    out.print("成功删除" + i + "行数据。");
    statement.close();
    conn.close();
%>
</body>
</html>
