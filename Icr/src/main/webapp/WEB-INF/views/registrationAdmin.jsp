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

    <br><br>

<div align="center">

<h2>
		<strong><font color="ffffff">Create a new Administrator</font></strong><br>
	</h2>

<form:form method="post" action="confirmAdmin" modelAttribute="administrator" name="form">
<div class="normal">
					Username :<font size="3" color="red">${usernameError}</font>
					<form:input type="text" path="username" placeholder="Username"/>
					Password :
					<form:input type="password" path="password" placeholder="Code"/>
					
					<font color="white"><springForm:errors path="username" /></font>
					<font color="white"><springForm:errors path="password" /></font>
					<td><input type="submit" value="Send" /><td>
</td>
</div>
</form:form>

<c:if test="${not empty administrator.username}">
<div class="normal">
 <strong><c:out value="Username:"/></strong> ${administrator.username}<br>
  <strong><c:out value="Password:"/></strong> ${administrator.password}<br>
</div> 
      <form:form method="post" action="addAdmin" modelAttribute="administrator" name="form2">
  	<br>
  	<input type="submit" value="Confirm Registration" /><br><br>
  	<div style="position:absolute; top:240px;right:585px ">
     <a href="index"><img width="200" height="175" src="<c:url value="/resources/img/toHomepage.png"/>"></a>
     </div>
  	<form:input type="hidden" path='username' placeholder="id" /><br/>
     
     <form:input type="hidden" path='password' placeholder="id" />
     <form:input type="hidden" path='role' placeholder="id" />
     </form:form>
</c:if>

</div>

</body>
</html>