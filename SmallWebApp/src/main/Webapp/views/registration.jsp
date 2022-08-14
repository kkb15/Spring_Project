<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="userDetail">
<div style="margin-bottom: 25px;text-align:center">
<h1>This is registration page!!!</h1>
Username:  <input id="UName" name="UName"/><br>
Email ID :  <input id="Mail" name="EmailId"/><br>
Password:  <input type="password" id="pass" name="Password"/><br>
Gender:  <input type="radio" name="Gender" value="1" checked="checked" />Male
<input type="radio" name="Gender" value="2" />Female<br>
<br>
<input type="checkbox" name="Hobby" value="Dance">Dancing
<input type="checkbox" name="Hobby" value="sing">Singing<br>
<input type="submit">
</form>

</div>
</body>
</html>