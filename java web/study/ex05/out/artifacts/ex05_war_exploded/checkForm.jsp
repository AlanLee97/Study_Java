<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/3/15
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>5.3.1 获取复选框中的数据</title>
</head>
<body>
<from action="" method="post">
    <input type="checkbox" name="fav" value="sing" checked="checked">sing
    <input type="checkbox" name="fav" value="dance">dance
    <input type="checkbox" name="fav" value="ball">ball
    <input type="checkbox" name="fav" value="game">game
    <input type="submit" value="提交">
</from>

<%
    String[] fav = request.getParameterValues("fav");
    out.println("爱好为：");
    if (fav != null){
        for (int i = 0; i < fav.length; i++){
            out.print(fav[i]);
        }
    }

%>
</body>
</html>
