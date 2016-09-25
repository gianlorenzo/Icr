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

<!-- Bootstrap CSS -->
    
    <link rel="stylesheet" href="<c:url value=" resources/css/bootstrap.responsive.css" />" type="text/css">
 	<link rel="stylesheet" href="<c:url value=" resources/css/bootstrap.css" />" type="text/css">
 	<link rel="stylesheet" href="<c:url value=" resources/css/fontello-ie7.css" />" type="text/css">
 	<link rel="stylesheet" href="<c:url value=" resources/css/fontello.css" />" type="text/css">
 	<link rel="stylesheet" href="<c:url value=" resources/css/prettyPhoto.css" />" type="text/css">
 	<link rel="stylesheet" href="<c:url value=" resources/css/style.css" />" type="text/css">

	<!-- Favicon -->
    <link rel="shortcut icon" href="<c:url value="resources/img/favicon.ico"/>">



</head>
<body background="<c:url value='/resources/img/background.jpg' />">
	<!--******************** NAVBAR ********************-->
    <div class="navbar-wrapper">
      <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="navbar-inner">
          <div class="container">
            <!-- Responsive Navbar Part 1: Button for triggering responsive navbar (not covered in tutorial). Include responsive CSS to utilize. -->
            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </a>
            <h1 class="brand"><a href="#top">In Codice Ratio</a></h1>
            <!-- Responsive Navbar Part 2: Place all navbar contents you want collapsed withing .navbar-collapse.collapse. -->
            <nav class="pull-right nav-collapse collapse">
              <ul id="menu-main" class="nav">
				<li><a title="Login" href="#">Admin Page:</a></li> 
				 <li> <a style="color:white" ><strong>${pageContext.request.userPrincipal.name}</strong></a><li>           
              </ul>
            </nav>
          </div>
          <!-- /.container -->
        </div>
        <!-- /.navbar-inner -->
      </div>
      <!-- /.navbar -->
    </div>
    <br><br>
   	<div align="center">
    
	<h1>
		<font color="7a0000">Insert a new Job</font>
	</h1>
	
	
	
	<form:form method="post" action="addJob" modelAttribute="job" name="form">
		
		
		<h3>#Students</h3>
		<form:input type="text" path='students' placeholder="Students" /><br>
		<h3>#Images : </h3>
		<form:input type="text" path='images' placeholder="images" /><br>
		<h3>%Type1 : </h3>
		<form:input type="text" path='PercentageType1' placeholder="Images" /><br>
		<h3>%Type2 : </h3>
		<form:input type="text" path='PercentageType2' placeholder="Images" /><br>
		<h3>%Type3 : </h3>
		<form:input type="text" path='PercentageType3' placeholder="Images" /><br>
		
		<h3>Symbol:</h3>
		<form:select path="symbol">
			<font color="7a0000"><form:options items="${symbols}" itemLabel="transcription" itemValue="id"/>
	</font>
		</form:select>
		
		<br>
		<td><input type="submit" value="Send" /></td>
		</form:form><br>
		
		
		
		
		
		
		
		 

	
	
		
	
	
	</div>
	
	
	

</body>
</html>