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
 


</head>
<body background="resources/img/background.jpg">
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