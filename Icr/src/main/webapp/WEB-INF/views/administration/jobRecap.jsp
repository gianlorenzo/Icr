<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ICR</title>
</head>
<body>

<div align="center">

<h1>
<p><c:out value="Confirms the following information:" /> </p></h1>
		<b><p><c:out value="#Students" /></p></b>${job.students}<br>
		<b><p><c:out value="#Images:" /></p></b>${job.images}<br>
		<b><p><c:out value="%Type1:" /></p></b>${job.percentageType1}<br>
		<b><p><c:out value="%Type2:" /></p></b>${job.percentageType2}<br>
		<b><p><c:out value="%Type3:" /></p></b>${job.percentageType3}<br>
		<b><p><c:out value="Symbol:" /></p></b>${job.symbol.transcription}<br><br>
		
		
		
		
		
	<a href="homeAdmin">Return to home Admin</a>
</div>

</body>
</html>