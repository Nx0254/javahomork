<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册页面</title>
</head>
<body>
<form action="AdminUserServlet?method=add" method="post">
用户名：<input type="text" name="username"><br>
密码：<input type="password" name="password"><br>
性别：<input type="text" name="gender"><br>
电话：<input type="text" name="tel"><br>
个人介绍：<br><textarea rows="10" cols="50" name="info"></textarea><br>
<input type="submit" value="提交">
</form>
</body>
</html>