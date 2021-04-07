<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录页面</title>
</head>
<body>
<form action = "FirstServlet" method = "post">
	学号<input type = "text" name = "sno" size = "15" /><br>
	姓名<input type = "text" name = "sname" size = "15" /><br>
	<input type = "submit" value = "登录" />
	<input type =  "reset" value = "取消">
</form>
</body>
</html>