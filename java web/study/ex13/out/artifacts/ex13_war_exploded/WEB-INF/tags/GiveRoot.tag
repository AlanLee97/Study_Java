<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/5/16
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ tag pageEncoding="GB2312" %>
<%@ tag import="java.util.*" %>
<%@attribute name="coefficientA" required="true" %>
<%@attribute name="coefficientB" required="true" %>
<%@attribute name="coefficientC" required="true" %>
<%@variable name-given="rootOne" variable-class="java.lang.Double" scope="AT_END" %>
<%@variable name-given="rootTwo" variable-class="java.lang.Double" scope="AT_END"%>

<%
    double delta, root1, root2;
    double a = Double.parseDouble(coefficientA);
    double b = Double.parseDouble(coefficientB);
    double c = Double.parseDouble(coefficientC);
    delta = b * b - (4 * a * c);
    if (delta >= 0 && a != 0){
        root1 = (-b + Math.sqrt(delta)) / (2 * a);
        root2 = (-b - Math.sqrt(delta)) / (2 * a);
        jspContext.setAttribute("rootOne", new Double(root1));
        jspContext.setAttribute("rootTwo", new Double(root2));
    }else {
        jspContext.setAttribute("rootOne", null);
        jspContext.setAttribute("rootTwo", null);
    }
%>