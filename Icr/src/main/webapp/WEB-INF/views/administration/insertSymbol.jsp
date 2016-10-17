<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="springForm"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ICR</title>

<!-- Bootstrap CSS -->

<link type="text/css"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css"
	rel="stylesheet">
<link type="text/css"
	href="${pageContext.request.contextPath}/resources/css/bootstrap-responsive.css"
	rel="stylesheet">
<link type="text/css"
	href="${pageContext.request.contextPath}/resources/css/fontello.css"
	rel="stylesheet">
<link type="text/css"
	href="${pageContext.request.contextPath}/resources/css/fontello-ie7.css"
	rel="stylesheet">
<link type="text/css"
	href="${pageContext.request.contextPath}/resources/css/prettyPhoto.css"
	rel="stylesheet">
<link type="text/css"
	href="${pageContext.request.contextPath}/resources/css/style.css"
	rel="stylesheet">

<link rel="shortcut icon" href="resources/img/siteImages/favicon.ico" />





</head>
<body>
	<div style="position: absolute; top: 15px; left: 10px">
		<font size="6" color="white">Admin Page</font>
	</div>

	<div style="position: absolute; top: 15px; right: 40px">
		<font size="6" color="white">Welcome:
			${pageContext.request.userPrincipal.name}</font>
	</div>

	
	<div align="center">

		<h1>
			<font color="white">Insert a new Symbol</font>
		</h1>

		<form:form method="post" action="addSymbol" modelAttribute="symbol"
			name="form">

			<h3>Type:</h3>
			<form:input type="text" path="type" placeholder="Type" />
			<h3>Transcription:</h3>
			<form:input type="text" path="transcription"
				placeholder="Transcription" />
			

			<td><input type="submit" value="addSymbol" /></td>




		</form:form>
		

		<div style="position: absolute; top: 250px; right: 578px">
			<a href="homeAdmin"><img width="200" height="150"
				src="resources/img/siteImages/endSymbols.png"></a>
			
		</div>
	</div>

</body>
</html>