<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/3/15
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>validate</title>
</head>
<body>
<form name="myForm">
    <label >帐号：</label><input type="text" name="username"> <br>
    <label >密码：</label><input type="password" name="password"> <br>
    <input type="submit" value="登录" onclick="validate()">
</form>


<script>
    function validate() {
        var username = document.myForm.username.value;
        var password = document.myForm.password.value;

        if (username == ""){
            alert("帐号不能为空");
            document.myForm.username.focus();
            return;
        } else if (password == ""){
            alert("密码不能为空");
            document.myForm.password.focus();
            return;
        } else {
            document.myForm.submit();
        }
    }
</script>
</body>
</html>
