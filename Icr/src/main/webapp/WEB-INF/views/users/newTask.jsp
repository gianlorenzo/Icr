<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="it.uniroma3.icr.model.Job" %>
<%@ page import="it.uniroma3.icr.model.Task" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
 prefix="springForm"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@taglib  uri="http://www.springframework.org/tags" prefix="spring"%>



    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ICR</title>

<!-- Bootstrap CSS -->
    
    <link rel="stylesheet" href="<c:url value=" resources/css/bootstrap.responsive.css" />" type="text/css">
 	<link rel="stylesheet" href="<c:url value=" resources/css/bootstrap.css" />" type="text/css">
 	<link rel="stylesheet" href="<c:url value=" resources/css/fontello-ie7.css" />" type="text/css">
 	<link rel="stylesheet" href="<c:url value=" resources/css/fontello.css" />" type="text/css">
 	<link rel="stylesheet" href="<c:url value=" resources/css/prettyPhoto.css" />" type="text/css">
 	<link rel="stylesheet" href="<c:url value=" resources/css/style.css" />" type="text/css">

	<!-- Favicon -->
    <link rel="shortcut icon" href="<c:url value="resources/img/favicon.ico"/>">
    
     <style type="text/css">
	 body { 
    background-image: url('./resources/img/background.png');
    background-repeat: no-repeat;
    background-attachment: fixed;
    background-position: center;
    
    background-size: 1500px 650px;

    
}
	   </style>
	   
	

</head>

<body>
<div style="position:absolute; top:15px; left:10px">

<font size="6" color="white">Student Page</font>
</div>

<div style="position:absolute; top:15px; right:40px">
<font size="6" color="white">Welcome : &nbsp ${pageContext.request.userPrincipal.name}</font>
</div>

	
    <br><br>
	<div align="center">
	<h1> <font color="white">${task.job.title}: &nbsp ${task.job.symbol.transcription} </font></h1>
	
	
	<form:form method="post" action="taskRecap" modelAttribute="taskResults" name="form">
	<font color="white">
		<c:forEach varStatus="vs" var="result" items="${taskResults.resultList}"><br>
			<c:out value="${result.image.id}"/>
			<form:checkbox path="resultList[${vs.index}].answer" value="Yes"/> 
	
			<form:hidden path="resultList[${vs.index}].id"/>
			<form:hidden path="resultList[${vs.index}].image.id"/>
			<form:hidden path="resultList[${vs.index}].task.id"/>
		</c:forEach>						
	<br>							
	<td><input type="submit" value="Send"></td>
	</font>
	</form:form>
								
	
	

		</div>
	
	
	
	
	





</body>
</html>