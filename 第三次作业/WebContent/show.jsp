<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>A Web Page</title>
</head>
<body>
姓名：${user.username }<br>
学校名称：${user.school }<br>
专业方向：${user.major }<br>
掌握技术：
<c:forEach items="${user.skills }" var="e">
${e}&nbsp;&nbsp;&nbsp;&nbsp;
</c:forEach>
</body>
</html>