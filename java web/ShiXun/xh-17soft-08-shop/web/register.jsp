<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>会员注册</title>
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

font {
	color: #3164af;
	font-size: 18px;
	font-weight: normal;
	padding: 0 10px;
}
	.correct{
		color: #56ff7b;
	}
</style>
</head>
<body onload="initAJAX()">

	<!-- 引入header.jsp -->
	<jsp:include page="/header.jsp"></jsp:include>

	<div class="container"
		style="width: 100%; background: url('image/regist_bg.jpg');">
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8"
				style="background: #fff; padding: 40px 80px; margin: 30px; border: 7px solid #ccc;">
				<font>会员注册</font>USER REGISTER
				<form
					class="form-horizontal"
					onsubmit="return checkAll()"
					style="margin-top: 5px;"
					action="${pageContext.request.contextPath}/user"
					method="POST"
					name="myForm"
				>

					<input type="hidden" name="method" id="method" value="register">
					<div class="form-group">
						<label for="username" class="col-sm-2 control-label">用户名</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" id="username"
								placeholder="请输入用户名" name="username">
						</div>
						<span id="usernameTip"></span>
					</div>
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">密码</label>
						<div class="col-sm-6">
							<input type="password" class="form-control" id="password"
								placeholder="请输入密码" name="password" value="">
						</div>
						<span id="password-tip"></span>
					</div>
					<div class="form-group">
						<label for="confirmpwd" class="col-sm-2 control-label">确认密码</label>
						<div class="col-sm-6">
							<input type="password" class="form-control" id="confirmpwd"
								placeholder="请输入确认密码" value="123456">
						</div>
					</div>
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-2 control-label">Email</label>
						<div class="col-sm-6">
							<input type="email" class="form-control" id="email"
								placeholder="Email" name="email" value="zhaojun@abc.com">
						</div>
					</div>
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-2 control-label">手机号</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" id="telephone"
								placeholder="请输入手机号" name="telephone" value="13512345678">
						</div>
					</div>
					<div class="form-group">
						<label for="usercaption" class="col-sm-2 control-label">姓名</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" id="name"
								placeholder="请输入姓名" name="name" value="赵君">
						</div>
					</div>
					<div class="form-group opt">
						<label for="inlineRadio1" class="col-sm-2 control-label">性别</label>
						<div class="col-sm-6">
							<label class="radio-inline"> <input type="radio"
								name="sex" id="sex" value="男" checked="checked">
								男
							</label> <label class="radio-inline"> <input type="radio"
								name="sex" id="sex" value="女">
								女
							</label>
						</div>
					</div>
					<div class="form-group">
						<label for="date" class="col-sm-2 control-label">出生日期</label>
						<div class="col-sm-6">
							<input type="date" class="form-control" 
								id="birthday" name="birthday" value="2018-04-7">
						</div>
					</div>

					
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<input type="submit" width="100" value="注册" name="submit"
								style="background: url('./images/register.gif') no-repeat scroll 0 0 rgba(0, 0, 0, 0); height: 35px; width: 100px; color: white;">
						</div>
					</div>
				</form>
			</div>

			<div class="col-md-2"></div>

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

	//使用ajax验证用户名

	function ajaxCheckUsername() {
		var username = document.myForm.username.value;

		var url = "${pageContext.request.contextPath}/user?method=registerCheck&username="+username;
		xmlHttp.open("POST", url, true);
		xmlHttp.onreadystatechange=function () {
			if (xmlHttp.readyState == 4 ){
				if (xmlHttp.responseText == "帐号正确") {
					usernameTip.innerHTML = "<span style='color:red'>" + xmlHttp.responseText + "</span>";
				}else {
					usernameTip.innerHTML = "<span style='color:mediumseagreen'>" + xmlHttp.responseText + "</span>";
				}
			}else {
				console.log("ajax error")
			}

		}

		xmlHttp.send();

	}

	//验证用户名
	// function checkUsername() {
	// 	var inp_username = document.getElementById("username").value;
	//
	// 	if (inp_username != null && inp_username.trim().length > 0){
	// 		document.getElementById("usernameTip").innerHTML="<span style='color:green'>正确</span>";
	// 		return true;
	// 	}else {
	// 		document.getElementById("usernameTip").innerHTML="<span style='color:red'>用户名必须填</span>";
	// 		return false;
	// 	}
	// }


	//当用户名文本框失去焦点时，进行验证，后面函数名不带括号
	document.getElementById("username").onblur = ajaxCheckUsername;


	//验证密码框
	function checkPassword() {
		var inp_password = document.getElementById("password").value;

		if (inp_password != null && inp_password.trim().length > 0){
			document.getElementById("password-tip").innerHTML="<span style='color:green'>正确</span>";
			return true;
		}else {
			document.getElementById("password-tip").innerHTML="<span style='color:red'>密码必须填</span>";
			return false;
		}
	}
	document.getElementById("password").onblur = checkPassword;

	function checkAll() {
		var flag = false;
		if (checkUsername() & checkPassword()){
			flag = true;
		}

		return flag;
	}

</script>

</body>
</html>




