<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${sessionScope.USER.username}</title>
</head>
<body>
	<h1>Hello ${sessionScope.USER.username}</h1>
</body>
</html>