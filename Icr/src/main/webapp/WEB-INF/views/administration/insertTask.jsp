<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="springForm"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ICR</title>




</head>
<body>
	
	<h1>
		<center>Insert a new Task</center>
	</h1>
	
	<div align="center">
	
	<form:form method="post" action="addTask" modelAttribute="task" name="form">
		
		
		<td>Title : </td>
		<td> <form:textarea path="Title" rows="5" cols="30" /></td><br>
		<form:input path="" type="text"/>
		
		
		
		
		
		
		
		<td><input type="submit" value="Send" /></td>
		</form:form><br>
		
	
	
		
	
	
	</div>
	
	
	

</body>
</html>