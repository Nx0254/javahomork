<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<style>
		div{
		font-size: 20px;
		}
		a{text-decoration:none}
	</style>
	<body>
		<div>
		<ul>
		<li><a href="${pageContext.request.contextPath }/userInfo.jsp" target="iframeContent">个人信息</a></li>
		<li><a href="${pageContext.request.contextPath }/AdminGoodsServlet?method=list" target="iframeContent">全部商品</a></li>
<<<<<<< HEAD
		<li><a href="#">我的购物车</a></li>
=======
>>>>>>> vcakn
		</ul>
		</div>
	</body>
</html>
