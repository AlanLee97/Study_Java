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
    String driver_path = "com.mysql.cj.jdbc.Driver";
    String db_connect_url = "jdbc:mysql://localhost:3307/jspdb?serverTimezone=UTC";
    String db_username = "root";
    String db_password = "123456";
%>
<%
    Class.forName(driver_path).newInstance();
    Connection conn = DriverManager.getConnection(db_connect_url,db_username,db_password);
    Statement statement = conn.createStatement();
    String sql = "insert into goods(id,goodsname,price) values (6,'xiaomi9',2999)";
    int i = statement.executeUpdate(sql);
    out.print("成功添加" + i + "行数据。");
    statement.close();
    conn.close();
%>
</body>
</html>
