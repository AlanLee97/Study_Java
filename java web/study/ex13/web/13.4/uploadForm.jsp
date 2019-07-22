<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/5/5
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<h2>文件上传</h2>
<form action="/ex13/servlets/UploadServlet" method="post" name="upload" enctype="multipart/form-data">
    <label >选择一个要上传的文件</label>
    <input type="file" name="myFile">
    <input type="submit" value="上传">
</form>
${successMsg}
</body>
</html>
