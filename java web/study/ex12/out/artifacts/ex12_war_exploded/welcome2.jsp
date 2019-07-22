<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/26
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body onload="initAJAX()">
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

    function showInfo() {
        // var xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");      //步骤1
        // var xmlHttp = new XMLHttpRequest();                     //步骤1,非ie浏览器

        xmlHttp.open("GET","info.jsp",true);                    //步骤2
        xmlHttp.onreadystatechange = function () {              //步骤3
            if (xmlHttp.readyState == 4){                       //步骤4
                infoDiv.innerHTML = xmlHttp.responseText;
            }
        }
        xmlHttp.send();                                         //步骤5
    }
</script>
<h2>欢迎来到本系统！</h2>
<hr>
<input type="submit" value="显示学生信息" onclick="showInfo()">
<br>
<div id="infoDiv"></div>
</body>
</html>
