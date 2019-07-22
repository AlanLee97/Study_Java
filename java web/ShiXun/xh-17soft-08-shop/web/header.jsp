<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- 登录 注册 购物车... -->
<div class="container-fluid">
	<div class="col-md-4">
		<img src="img/logo2.png" />
	</div>
	<div class="col-md-5">
		<img src="img/header.png" />
	</div>

	<div class="col-md-3" style="padding-top:20px">


		<ol class="list-inline">
			<li>

<%--				欢迎您，
				<c:choose>
					<c:when test="${!empty USER}">
						${USER.username}
					</c:when>
					<c:otherwise>
						游客
					</c:otherwise>
				</c:choose>
--%>
				<%--使用三元运算符--%>
				欢迎您，${!empty USER ? USER.username : "游客"}
			</li>

			<c:choose>
				<c:when test="${!empty USER}">
					<li><a href="cart.jsp">购物车</a></li>
					<li><a href="${pageContext.request.contextPath}/user?method=logout">退出</a></li>

				</c:when>
				<c:otherwise>
					<li><a href="login.jsp">登录</a></li>
					<li><a href="register.jsp">注册</a></li>

				</c:otherwise>
			</c:choose>



		</ol>
	</div>
</div>

<!-- 导航条 -->
<div class="container-fluid">
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="default.jsp">首页</a>
			</div>

			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav" id="ul">



					<%--之前写死的列表
					 <li><a href="${pageContext.request.contextPath}/product?method=findAllProductByCid&cid=1">手机数码</a></li>
				     <li><a href="${pageContext.request.contextPath}/product?method=findAllProductByCid&cid=2">电脑平板</a></li>
				     <li><a href="${pageContext.request.contextPath}/product?method=findAllProductByCid&cid=3">女士服装</a></li>
				     <li><a href="${pageContext.request.contextPath}/product?method=findAllProductByCid&cid=4">男士服装</a></li>
				     <li><a href="${pageContext.request.contextPath}/product?method=findAllProductByCid&cid=5">鞋帽箱包</a></li>
				     --%>

				<script>
					$(function () {
						var url = "${pageContext.request.contextPath}/product";
						var data = "method=findAllCategory";
						var callback = function(categoryList){
							if(categoryList!="error"){
								var content = "";
								//目前categoryList只是一个JSON字符串，不是JSON对象
								//如果你想要JSON对象，只需将type值修改为"json"即可
								//我们的JavaScrpt是解析JSON对象的，不是解析JSON字符串的
								//因为categoryList是一个数组，里面有5个category对象
								for(var i=0;i<categoryList.length;i++){
									//取出一个category对象
									var category = categoryList[i];
									//获取category的cid和cname
									var cid = category.cid;
									var cname = category.cname;
									//拼接HTML代码，JS中字符串既可以用""，又可以用''
									content += "<li><a href='${pageContext.request.contextPath}/product?method=findAllProductByCid&cid="+cid+"'>"+cname+"</a></li>";
								}
								//将content变量的值设置到ul标签中
								var ul = document.getElementById("ul");
								ul.innerHTML = content;
							}
						};
						var type = "json";

						$.get(url, data, callback, type);
					});
				</script>

				</ul>
				<form class="navbar-form navbar-right" role="search">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="Search">
					</div>
					<button type="submit" class="btn btn-default">Submit</button>
				</form>
			</div>
		</div>
	</nav>
</div>

