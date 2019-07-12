<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品列表</title>
<style>
table{height:100%;width:100%;}
</style>
</head>
<body>
<form action="AdminGoodsServlet?method=serach" method="post">
<input type="text" name="info">
<input type="submit" value="搜索">
</form>
<table border="1">
	<tr>
		<th>商品名称</th>
		<th>商品价格</th>
		<th>介绍</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${list}" var="good">
	 <tr>
          <td>${good.goods_name }</td>
          <td>${good.goods_price}</td>
          <td>${good.goods_info}</td>
          <td>
          <c:set value="${good.goods_count }" var="count"/>
          <c:if test="${count>0 }">
          <a href="${pageContext.request.contextPath }/CartServlet?method=add&goods_id=${good.goods_id }&goods_count=${good.goods_count}">加入购物车</a>
          </c:if>
          <c:if test="${count<=0 }">
          卖光了
          </c:if>
          </tr>
     </c:forEach>
</table>
</body>
</html>