<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="springForm"%>
	
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	
<%@ page import="it.uniroma3.icr.model.Symbol" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ICR</title>




</head>
<body>
	
	<h1>
		<center>Insert a new Job</center>
	</h1>
	
	<div align="center">
	
	<form:form method="post" action="addJob" modelAttribute="job" name="form">
		
		
		<td>#Students</td>
		<td><form:input type="text" path='students' placeholder="Students" /></td><br><br>
		<td>#Images : </td>
		<td><form:input type="text" path='images' placeholder="images" /></td><br><br>
		<td>%Type1 : </td>
		<td><form:input type="text" path='PercentageType1' placeholder="Images" /></td><br><br>
		<td>%Type2 : </td>
		<td><form:input type="text" path='PercentageType2' placeholder="Images" /></td><br><br>
		<td>%Type3 : </td>
		<td><form:input type="text" path='PercentageType3' placeholder="Images" /></td><br><br>
		
		Symbol:
		<form:select path="symbol">
			<form:options items="${symbols}" itemLabel="transcription" itemValue="id"/>
		
		</form:select>
		
		
		<td><input type="submit" value="Send" /></td>
		</form:form><br>
		
		
		
		
		
		
		
		 

	
	
		
	
	
	</div>
	
	
	

</body>
</html>