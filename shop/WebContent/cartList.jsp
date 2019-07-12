<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>购物车</title>
<style>
table{height:100%;width:100%;}
</style>
</head>
<body>
<table border="1">
	<tr>
		<th>商品名称</th>
		<th>商品价格</th>
		<th>介绍</th>
		<th>数量</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${map}" var="m">
	 <tr>
          <td>${m.value.goods_name }</td>
          <td>${m.value.goods_price}</td>
          <td>${m.value.goods_info}</td>
          <td>${m.value.goods_count}</td>
          <td><a href="CartServlet?method=delete&cart_id=${m.key }">删除</a></td>
     </tr>
    </c:forEach>
</table>
</body>
</html>