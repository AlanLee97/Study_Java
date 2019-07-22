<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>会员登录</title>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<!-- 引入自定义css文件 style.css -->
<link rel="stylesheet" href="css/style.css" type="text/css" />

<style>
body {
	margin-top: 20px;
	margin: 0 auto;
}

.carousel-inner .item img {
	width: 100%;
	height: 300px;
}

.container .row div {
	/* position:relative;
				 float:left; */
	
}

font {
	color: #666;
	font-size: 22px;
	font-weight: normal;
	padding-right: 17px;
}

.tip-box {
	margin-top: 6px;
	color: mediumseagreen
}
</style>
</head>
<body onload="initAJAX()">

	<!-- 引入header.jsp -->
	<jsp:include page="/header.jsp"></jsp:include>


	<div class="container"
		style="width: 100%; height: 460px; background: #FF2C4C url('images/loginbg.jpg') no-repeat;">
		<div class="row">
			<div class="col-md-7">
				<!--<img src="./image/login.jpg" width="500" height="330" alt="会员登录" title="会员登录">-->
			</div>

			<div class="col-md-5">
				<div
					style="width: 440px; border: 1px solid #E7E7E7; padding: 20px 0 20px 30px; border-radius: 5px; margin-top: 60px; background: #fff;">
					<font>会员登录</font>USER LOGIN
					<div>&nbsp;</div>



					<form 
						class="form-horizontal"
						action="${pageContext.request.contextPath}/user"
						name="loginForm"
						method="POST">

						<input type="hidden" name="method" id="method" value="login">


						<div class="form-group">
							<label for="username" class="col-sm-2 control-label">用户名</label>
							<div class="col-sm-6">
								<input type="text" class="form-control" id="username"
									placeholder="请输入用户名" name="username">
							</div>
							<div class="tip-box" name="tipBox" id="tipBox"></div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">密码</label>
							<div class="col-sm-6">
								<input type="password" class="form-control" id="password"
									placeholder="请输入密码" name="password">
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<input type="submit" width="100" value="登录" name="submit"
									style="background: url('./images/login.gif') no-repeat scroll 0 0 rgba(0, 0, 0, 0); height: 35px; width: 100px; color: white;">
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<!-- 引入footer.jsp -->
	<jsp:include page="/footer.jsp"></jsp:include>


<script>
	var xmlHttp = false;

	//初始化ajax，判断浏览器是否支持ajax
	function initAJAX() {
		if (window.XMLHttpRequest){
			xmlHttp = new XMLHttpRequest();
		} else if (window.ActiveXObject){
			try {
				xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
			} catch (e) {
				try {
					xmlHttp = new ActiveXObject("Mircosoft.XMLHTTP");
				} catch (e) {
					alert("该浏览器不支持AJAX！");
				}
			}
		}
	}

	//使用ajax对帐号是否存在进行验证
	function checkUsernameExists() {
		var username = document.loginForm.username.value;

		var url = "${pageContext.request.contextPath}/user?method=loginCheck&username="+username;
		xmlHttp.open("POST", url, true);
		xmlHttp.onreadystatechange=function () {
			if (xmlHttp.readyState == 4 ){
				tipBox.innerText = xmlHttp.responseText;
			}else {
				tipBox.innerText = xmlHttp.responseText;
			}

		}

		xmlHttp.send();

	}

	//当用户名文本框失去焦点时，进行验证，后面函数名不带括号
	document.getElementById("username").onblur = checkUsernameExists;
</script>
</body>
</html>