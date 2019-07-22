<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/3/15
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>document3</title>
</head>
<body>
<form action="" name="form1">
    <input type="text" id="n1" name="n1">
    <label> + </label>
    <input type="text" id="n2" name="n2">
    <label> = </label>
    <input type="text" id="sum" name="sum">
    <input type="submit" value="计算" onclick="add()">
</form>
<p id="tip"><h4 id="sum2"></h4></p>

<script>
    function add() {
        var n1 = Number(document.form1.n1.value);
        var n2 = Number(document.form1.n2.value);
        var sum = n1 + n2;
        document.form1.sum.value = sum;
        // document.getElementById("tip").innerHTML = "计算结果为：";
        // document.getElementById("sum2").innerHTML = sum;
    }
</script>
</body>
</html>
