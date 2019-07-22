<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/3/21
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>5.3.2 获取多选列表框中的数据</title>
</head>
<body>
<form action="" method="post">
    <select name="fav" multiple>
        <option value="sing" name="sing">唱歌</option>
        <option value="dance" name="dance">跳舞</option>
        <option value="ball" name="ball">打球</option>
        <option value="game" name="game">打游戏</option>
    </select>
    <input type="submit" value="提交">
</form>
<%
    String [] fav = request.getParameterValues("fav");
    if (fav != null){
        out.println("爱好为：");
        for (int i = 0; i < fav.length; i++){
            out.println(fav[i]);
        }
    }else{
        System.out.println("没有获取到值！");
    }
%>

</body>
</html>
