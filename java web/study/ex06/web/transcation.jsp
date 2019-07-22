<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %><%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/25
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Connection conn = null;
    String driver_path = "sun.jdbc.odbc.JdbcOdbcDriver";
    try{

        Class.forName(driver_path).newInstance();
        conn = DriverManager.getConnection("jdbc:odbc:DSSchool");
        Statement statement = conn.createStatement();
        conn.setAutoCommit(false);
        String sql1 = "UPDATE1";
        String sql2 = "UPDATE2";

        statement.executeUpdate(sql1);
        statement.executeUpdate(sql2)
        conn.commit();
    }catch (Exception e) {
        conn.rollback();
    }finally {
        conn.close();
    }
%>
</body>
</html>
