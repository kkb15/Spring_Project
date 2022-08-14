<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Username: ${regObj.name }<br>
EmaiId: ${regObj.Email }<br>
Password: ${regObj.password }<br>
Gender: ${regObj.Gender }<br>
Hobby: ${regObj.hobbies[0] }, ${regObj.hobbies[1] }<br>
</body>
</html>