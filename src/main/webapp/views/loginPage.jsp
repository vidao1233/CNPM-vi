<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

	<h1>
		<a href="HomeController">Home</a>
	</h1>
	<form action="LoginController" method="POST">
		<input type="text" name="txtUsername" placeholder="Username" /> <input
			type="password" name="txtPassword" placeholder="Password" /> <input
			type="submit" value="login" /> <input type="reset" value="Reset" />
	</form>
</body>
</html>