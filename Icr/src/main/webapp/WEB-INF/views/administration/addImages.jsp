<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="springForm"%>
	
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form:form method="post" action="addImages" modelAttribute="job" name="form">

<form:hidden path="id"/>
		<form:hidden path="title"/>
		<form:hidden path="students"/>
		<form:hidden path="numberOfImages"/>
		<form:hidden path="percentageType1"/>
		<form:hidden path="percentageType2"/>
		<form:hidden path="percentageType3"/>
<form:hidden path="taskSize"/>

<input type="submit" value="Send">

</form:form>

</body>
</html>