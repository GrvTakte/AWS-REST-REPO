<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">

	function deleteUser(){
		var id = document.myForm.id.value;
		alert(id);
		document.myForm.action="delete?id="+id;
		document.myForm.submit();
	}
	
	function editUser(){
		var id = document.myForm.id.value;
		document.myForm.action="edit?id="+id;
		document.myForm.submit();
	}
	

</script>
</head>
<body>
<form name="myForm">
<table border="2">
<tr>
<td>Action</td>
<td>Username</td>
<td>Password</td>
</tr>

<c:forEach var="item" items="${list}">

	<tr>
	<td><input type="radio" value="${item.getUid()}" name="id"></td>
	<td>${item.getUsername()}</td>
	<td>${item.getPassword()}</td>
	</tr>

</c:forEach>
</table>

<input type="button" value="Delete" onclick="deleteUser()">
<input type="button" value="Edit" onclick="editUser()"> 
</form>
</body>
</html>