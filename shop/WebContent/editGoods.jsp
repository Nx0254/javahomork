<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加商品</title>
</head>
<body>
<form action="AdminGoodsServlet?method=edit2" method="post">
<input type="hidden" name="goods_id" value="${ goods.goods_id}" >
商品名称：<input type="text" name="goods_name" value="${ goods.goods_name}"  ><br>
商品价格：<input type="text" name="goods_price" value="${ goods.goods_price}"><br>
商品信息：<input type="text" name="goods_info" value="${ goods.goods_info}"><br>
商品数量：<input type="text" name="goods_count" value="${ goods.goods_count}"><br>
<input type="submit" value="确认修改">
</form>
</body>
</html>