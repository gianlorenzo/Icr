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

<!-- Bootstrap CSS -->
    
   <link type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css"  rel="stylesheet">
   <link type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap-responsive.css"  rel="stylesheet">
   <link type="text/css" href="${pageContext.request.contextPath}/resources/css/fontello.css"  rel="stylesheet">
   <link type="text/css" href="${pageContext.request.contextPath}/resources/css/fontello-ie7.css"  rel="stylesheet">
   <link type="text/css" href="${pageContext.request.contextPath}/resources/css/prettyPhoto.css"  rel="stylesheet">
   <link type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"  rel="stylesheet">
	
    <link rel="shortcut icon" href="resources/img/favicon.ico"/>
    
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
<font size="6" color="white">Admin Page</font>
</div>

<div style="position:absolute; top:15px; right:40px">
<font size="6" color="white">Welcome : &nbsp ${pageContext.request.userPrincipal.name}</font>
</div>

    <br><br>
    <div align="center">
    
	<h1>
		<font color="7a0000">Insert a new Symbol</font>
	</h1>
	
	<form:form method="post" action="addSymbol" modelAttribute="symbol" name="form">
	
		<h3>Type:</h3>
		<form:input type="text" path="type" placeholder="Type"/>
		<h3>Transcription:</h3>
		<form:input type="text" path="transcription" placeholder="Transcription"/>
		<br>
		
		<td><input type="submit" value="addSymbol" /></td>
	
		
	
	
	</form:form><br>
	
	<a class="classname" href="homeAdmin">Finished entering symbols</a>
	
	</div>

</body>
</html>