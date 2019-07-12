<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品列表</title>
<<<<<<< HEAD
</head>
<body>
=======
<style>
table{height:100%;width:100%;}
</style>
</head>
<body>
<form action="AdminGoodsServlet?method=serach" method="post">
<input type="text" name="info">
<input type="submit" value="搜索">
</form>
>>>>>>> vcakn
<a href="addGoods.jsp">添加商品</a><br>
<table border="1">
	<tr>
		<th>商品id</th>
		<th>商品名称</th>
		<th>商品价格</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${list}" var="good">
	 <tr>
          <td>${good.goods_id }</td>
          <td>${good.goods_name }</td>
          <td>${good.goods_price}</td>
<<<<<<< HEAD
          <td><a href="AdminGoodsServlet?method=delete&id=${good.goods_id }">删除</a></td>
=======
          <td>
          <a href="AdminGoodsServlet?method=edit1&id=${good.goods_id }">修改</a>&nbsp;&nbsp;
          <a href="AdminGoodsServlet?method=delete&id=${good.goods_id }">删除</a></td>
>>>>>>> vcakn
          </tr>
     </c:forEach>
</table>
</body>
</html>