<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户信息</title>
</head>
<body>
<form action="AdminUserServlet?method=edit" method="post">
ID：<input type="text" name="id" readonly="readonly" value="${user.id }"><br>
用户名：<input type="text" name="username" value="${user.username }"><br>
密码：<input type="password" name="password" value="${user.password }"><br>
性别：<input type="text" name="gender" value="${user.gender }"><br>
电话：<input type="text" name="tel" value="${user.gender }"><br>
个人介绍：<br><textarea rows="10" cols="50" name="info" >${user.info }</textarea><br>
<input type="submit" value="保存">
</form>
</body>
</html>