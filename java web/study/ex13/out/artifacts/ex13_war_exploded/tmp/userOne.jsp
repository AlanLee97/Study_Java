<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/5/16
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.text.*" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="computer"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<computer:GiveRoot coefficientA="3" coefficientB="6" coefficientC="-1"></computer:GiveRoot>

<h4>方程的根保留3为小数，并计算两个根的和</h4>
<%
    NumberFormat f = NumberFormat.getInstance();
    f.setMaximumFractionDigits(3);
//    String rootOne = (String) pageContext.getAttribute("rootOne");
//    String rootTwo = (String) pageContext.getAttribute("rootTwo");
    if (rootOne != null && rootTwo != null){
//        double r1 = Double.valueOf(rootOne);
//        double r2 = Double.valueOf(rootTwo);
        double r1 = rootOne.doubleValue();
        double r2 = rootTwo.doubleValue();

        String s1 = f.format(r1);
        String s2 = f.format(r2);

        out.print("根1：" + s1 + "<br>");
        out.print("根2：" + s2 + "<br>");

        double sum = (r1 + r2);
        out.print("两根之和：" + sum);

    }else {
        out.print("没有实根");
    }
%>

</body>
</html>
