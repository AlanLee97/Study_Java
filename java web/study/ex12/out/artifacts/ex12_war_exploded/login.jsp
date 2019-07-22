<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/28
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Title</title>
</head>
<body onload="initAJAX()">
<h2>欢迎登录学生管理系统</h2>
<hr>
<div id="resultDiv">
    <form action="" name="loginForm">
        <label>帐号：</label><input type="text" name="account"><br>
        <label>密码：</label><input type="password" name="password"><br>
        <input type="button" value="登录" onclick="login()"><br>
    </form>
</div>
<hr>
<div id="content"></div>


<script>
    var xmlHttp = false;
    function initAJAX() {
        if (window.XMLHttpRequest){
            xmlHttp = new XMLHttpRequest();
        } else if (window.ActiveXObject){
            try{
                xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
            }catch (e) {
                try{
                    xmlHttp = new ActiveXObject("Mricosoft.XMLHTTP");
                }catch (e) {
                    alert("该浏览器不支持AJAX");
                }
            }
        }

    }
    function login() {
        var account = document.loginForm.account.value;
        var password = document.loginForm.password.value;
        // var xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
        var url = "login/LoginServlet?account=" + account + "&password=" + password;
        xmlHttp.open("POST",url,true);
        xmlHttp.onreadystatechange = function () {
            if (xmlHttp.readyState == 4){
                document.getElementById("content").innerHTML = xmlHttp.responseText;
            } else {
                document.getElementById("content").innerHTML += "正在登录，请稍候。。。";
            }
        }
        xmlHttp.send();
    }
</script>
</body>
</html>
