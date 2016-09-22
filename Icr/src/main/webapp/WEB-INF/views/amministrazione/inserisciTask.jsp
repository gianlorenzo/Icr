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
<title>Trascrizioni Medievali</title>
</head>
<body>
	
	<h1>
		<center>Inserisci un nuovo Task</center>
	</h1>
	
	<div align="center">
	
	<form:form method="post" action="aggiungiTask" modelAttribute="task" name="form">
		
		
		<td>Titolo : </td>
		<td> <form:textarea path="Titolo" rows="5" cols="30" /></td><br>
		
		
		<td><input type="submit" value="Invia" /></td>
		</form:form>
		
		<br>
		
		<c:if test="${not empty task.titolo }">
		
		
		
		
		<form:input type="hidden" path="Titolo" placeholder="Titolo"/><br>
		
		
		<td><input type="submit" value="Conferma" /></td>
		
		
		
		</c:if>
	
		
	
	
	</div>

</body>
</html>