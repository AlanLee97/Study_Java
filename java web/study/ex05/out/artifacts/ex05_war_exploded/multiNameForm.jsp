<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/3/21
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>5.3.3 获取其他同名表单元素中的数据</title>
</head>
<body>
<h3>注册页面</h3>
<form action="" method="post">
    <%
        for (int i = 0; i < 4; i++){
    %>
    <label>号码<%=i+1%>：</label><input type="text" name="phoneNum"><br>
    <%
        }
    %>
    <input type="submit" value="提交">
</form>
<%
    String[] phoneNum = request.getParameterValues("phoneNum");
    out.println("手机号码为：");
    if (phoneNum != null){
        for (int i = 0; i < phoneNum.length; i++){
            out.println(phoneNum[i]);
        }
    }else {
        out.println("没有获取到值！");
    }
%>

</body>
</html>
