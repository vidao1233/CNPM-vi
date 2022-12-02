<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${sessionScope.USER.username}</title>
</head>
<body>
	<c:choose>
		<c:when test="${!empty sessionScope.USER }">
			<h1>Hello ${sessionScope.USER.username}</h1>
			<h1>
				<a href="LogoutController">Logout</a>
			</h1>
		</c:when>
		<c:when test="${empty sessionScope.USER }">
			<h1>Hello Guest</h1>
			<h1>
				<a href="LoginController">Login</a>
			</h1>
			<h1>
				<a href="LogoutController">Logout</a>
			</h1>
		</c:when>
	</c:choose>

</body>
</html>