<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ICR</title>
</head>
<body>
	<div align="center">
		<strong>Welcome :</strong>&nbsp<td><font color="red">${pageContext.request.userPrincipal.name}</font></td><br><br>
		
		<a href="newTask">Go to your Task's page</a><br><br>
		<a href="logout">Logout</a>
		
    </div>
</body>
</html>