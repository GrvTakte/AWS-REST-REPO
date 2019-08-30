<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update">
<input type="hidden" name="uid" value="${user.getUid() }">
Username: <input type="text" placeholder="Enter username" name="username" value="${user.getUsername() }"><br>
Password: <input type="text" placeholder="Enter Password" name="password" value="${user.getPassword() }"><br>
<input type="submit" value="Register">
</form>
</body>
</html>