<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ICE</title>



</head>
<body>
	<div align="center">


		<strong> <strong>Title:</strong>${task.title} <form:form
				action="addSymbol" method="post" name="catch">

				<c:forEach var="symbol" items="${symbols}">
				<input type="checkbox" name="id" value="${symbol.type} }">${symbol.type}<BR>
				</c:forEach>

				<input type="submit" value="Submit">
			</form:form>



		</strong>


	</div>

</body>
</html>