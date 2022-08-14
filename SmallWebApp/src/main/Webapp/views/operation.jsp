<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Operation Form</h1>
<form action="operation">
User By ID: <input id="uid" name="UId"/><br>
<select name="ddlFlag">
<option value="select">Select Record</option>
<option value="delete">Delete Record</option>
<option value="update">Update Record</option>
<option value="custom">Custom Record</option>
</select>
<br> 
<input type="submit" value="click me">
</form>
</body>
</html>