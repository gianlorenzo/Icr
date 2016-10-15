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

<script language="Javascript">
function isnum(obj) {

if (isNaN(obj.value) || parseInt(obj.value)<0 || parseInt(obj.value) > 9999)

{

alert('Nel campo � possibile immettere solo numeri!');
obj.value="";
obj.focus();
}

}

</script>

<!-- Bootstrap CSS -->
    
    <link rel="stylesheet" href="<c:url value=" resources/css/bootstrap.responsive.css" />" type="text/css">
 	<link rel="stylesheet" href="<c:url value=" resources/css/bootstrap.css" />" type="text/css">
 	<link rel="stylesheet" href="<c:url value=" resources/css/fontello-ie7.css" />" type="text/css">
 	<link rel="stylesheet" href="<c:url value=" resources/css/fontello.css" />" type="text/css">
 	<link rel="stylesheet" href="<c:url value=" resources/css/prettyPhoto.css" />" type="text/css">
 	<link rel="stylesheet" href="<c:url value=" resources/css/style.css" />" type="text/css">

	<!-- Favicon -->
    <link rel="shortcut icon" href="<c:url value="resources/img/siteImages/favicon.ico"/>">
    
    <style type="text/css">
	 body { 
    background-image: url('./resources/img/siteImages/background.png');
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
		<font color="white">Insert a new Job</font>
	</h1>
	
	
	
	<form:form method="post" action="addJob" modelAttribute="job" name="form">
	<div class="normal">
		
		Title: <br>
		<form:textarea path="title" rows="5" cols="5" /><br>
		
		#Students
		<form:input type="text" path='students' placeholder="Students" onBlur="isnum(this)" />
		#Images : 
		<form:input type="text" path='numberOfImages' placeholder="images" onBlur="isnum(this)" /><br>
		%Type1 : 
		<form:input type="text" path='percentageType1' placeholder="Images" onBlur="isnum(this)" />
		%Type2 : 
		<form:input type="text" path='percentageType2' placeholder="Images" onBlur="isnum(this)" /><br>
		%Type3 : 
		<form:input type="text" path='percentageType3' placeholder="Images" onBlur="isnum(this)" />
		TaskSize : 
		<form:input type="text" path='taskSize' placeholder="TaskSize" onBlur="isnum(this)" /><br>
		
		ImageManuscript:
		<form:select path="imageManuscript">
		
			<form:options items="${manuscripts}" />
		
		</form:select>
		
		
		Symbol:
		<form:select path="symbol">
			<font color="7a0000"><form:options items="${symbols}" itemLabel="transcription" itemValue="id"/>
	</font>
	
		</form:select>
		
		<form:hidden path="id"/>
		
		
		
		
		<br>
		<td><input type="submit" value="Send" /></td>
		</div>
		</form:form><br>
		
		
		
		
		
		
		
		 

	
	
		
	
	
	</div>
	
	
	

</body>
</html>