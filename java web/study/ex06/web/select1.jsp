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
    String sql = "select STUNO,STUNAME from T_STUDENT where STUSEX = '女'";
    ResultSet rs = statement.executeQuery(sql);
    while (rs.next()){
        String stuno = rs.getNString("STUNO");
        String stuname = rs.getNString("STUNAME");
        out.print(stuno + " " + stuname);
    }
    statement.close();
    conn.close();
%>
</body>
</html>
