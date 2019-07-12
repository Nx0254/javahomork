<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>A Web Page</title>
</head>
<body>
<form action="AddPreference?method=preference1" method="post">
学校名称：<input type="text" name="school"><br>
专业方向：<select name="major">
					<option value="金融">软件工程金融信息化方向</option>
					<option value="大数据">软件工程大数据方向</option>
					<option value="移动">软件工程移动方向</option>
					</select><br>
					<input type="submit" value="下一步">
					</form>
</body>
</html>