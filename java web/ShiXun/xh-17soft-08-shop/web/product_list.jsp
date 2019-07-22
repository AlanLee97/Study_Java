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
	width: 100%;
}

.carousel-inner .item img {
	width: 100%;
	height: 300px;
}
</style>
</head>

<body>


	<!-- 引入header.jsp -->
	<jsp:include page="/header.jsp"></jsp:include>


	<%--显示商品信息--%>
	<div class="row" style="width: 1210px; margin: 0 auto;">
		<%--根据类别编号，显示商品信息--%>
		<c:choose>
			<%--如果集合存在且长度大于0--%>
			<c:when test="${!empty PAGEBEAN.pageContent}">
				<c:forEach var="product" items="${PAGEBEAN.pageContent}">
					<div class="col-md-2">
						<a href="${pageContext.request.contextPath}/product?method=findProductByPid&pid=${product.pid}">
							<img src="${product.pimage}" width="170" height="170" style="display: inline-block;">
						</a>
						<p>
							<a href="${pageContext.request.contextPath}/product?method=findProductByPid&pid=${product.pid}" style='color: green'>${product.pname}</a>
						</p>
						<p>
							<font color="#FF0000">商城价：&yen;${product.shop_price}</font>
						</p>
					</div>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<h1 style="color: red">无商品信息</h1>
			</c:otherwise>
		</c:choose>





	</div>

	<!--分页 -->
	<div style="width: 380px; margin: 0 auto; margin-top: 50px;">
		<ul class="pagination" style="text-align: center; margin-top: 10px;">
			<%--上一页--%>

				<%--如果当前页是第1页，上一页按钮不可用--%>
				<c:choose>
					<c:when test="${PAGEBEAN.currentPageNo == 1}">
						<li class="disabled">
							<a href="#" aria-label="Previous">
								<span aria-hidden="true">&laquo;</span>
							</a>
						</li>

					</c:when>
					<%--如果当前页不是第1页，则上一页按钮可用--%>
					<c:otherwise>
						<li>
							<a href="${pageContext.request.contextPath}/product?method=findAllProductByCid&cid=${param.cid}&currentPageNo=${PAGEBEAN.currentPageNo-1}" aria-label="Previous">
								<span aria-hidden="true">&laquo;</span>
							</a>
						</li>
					</c:otherwise>
				</c:choose>





			<%--页号--%>
				<%--<c:forEach var="i" begin="1" end="" step="1"> 等于 for(int i=1;i<=5;i++)--%>
			<c:forEach var="i" begin="1" end="${PAGEBEAN.allPage}" step="1">
				<%--<li class="active"><a href="#">0</a></li>--%>

				<c:choose>
					<%--如果当前页号等于i变量的值，就反选--%>
					<c:when test="${PAGEBEAN.currentPageNo == i}">
						<li class="active"><a href="#">${i}</a></li>
					</c:when>
					<c:otherwise>
						<%--点击页号时，动态读取地址栏上cid的值--%>
						<%--以下两种方式等价：--%>
						<%--Servlet中:request.getParameter("cid")--%>
						<%--JSP-EL中:${param.cid}--%>
						<li><a href="${pageContext.request.contextPath}/product?method=findAllProductByCid&cid=${param.cid}&currentPageNo=${i}">${i}</a></li>

					</c:otherwise>
				</c:choose>
			</c:forEach>


			<%--下一页--%>
				<c:choose>
					<c:when test="${PAGEBEAN.currentPageNo == PAGEBEAN.allPage}">
						<li class="disabled">
							<a href="#" aria-label="Next">
								<span aria-hidden="true">&raquo;</span>
							</a>
						</li>
					</c:when>
					<c:otherwise>
						<li>
							<a href="${pageContext.request.contextPath}/product?method=findAllProductByCid&cid=${param.cid}&currentPageNo=${PAGEBEAN.currentPageNo+1}" aria-label="Next">
								<span aria-hidden="true">&raquo;</span>
							</a>
						</li>
					</c:otherwise>
				</c:choose>


		</ul>
	</div>
	<!-- 分页结束 -->

	<!--商品浏览记录-->
	<div
		style="width: 1210px; margin: 0 auto; padding: 0 9px; border: 1px solid #ddd; border-top: 2px solid #999; height: 246px;">

		<h4 style="width: 50%; float: left; font: 14px/30px 微软雅黑">浏览记录</h4>
		<div style="width: 50%; float: right; text-align: right;">
			<a href="">more</a>
		</div>
		<div style="clear: both;"></div>

		<div style="overflow: hidden;">

			<ul style="list-style: none;">
				<li
					style="width: 150px; height: 216; float: left; margin: 0 8px 0 0; padding: 0 18px 15px; text-align: center;"><img
					src="products/1/cs10001.jpg" width="130px" height="130px" /></li>
			</ul>

		</div>
	</div>


	<!-- 引入footer.jsp -->
	<jsp:include page="/footer.jsp"></jsp:include>

</body>

</html>