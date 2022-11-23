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
        <form action="Home" method="POST">
            <input type="text" name="txtUserID" placeholder="Username"/>
            <input type="password" name="txtPassword" placeholder="Password"/>
            <input type="submit" name="btnAction" value="Login"/>
            <input type="reset" value="Reset"/>
        </form>
    </body>
</html>