<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="springForm"%>
<head> 
<meta charset="utf-8">
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
                <li><a title="Login" href="login">Login</a></li>
               
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
	
	<h2>
		<strong><font color="7a0000">Create a new Account</font></strong>
	</h2>
<form:form method="post" action="confirmUser" modelAttribute="student" name="form">
					
					<h3>Name :</h3>
					<form:input type="text" path='name' placeholder="Name" /><br>
					<h3>Surname :</h3>
					<form:input type="text" path='surname' placeholder="Surname" /><br>
					<h3>School :</h3>
					<form:input type="text" path='school' placeholder="School" /><br>
					<h3>Username :</h3>
					<form:input type="text" path='username' placeholder="Username" /><br>
				
					<h3>Password :</h3>
					<form:input type="Password" path='password' placeholder="Password" /><br>

							
					<input type="submit" value="Send" />
					</form:form>
					<br>
					<c:if test="${not empty student.username}">
	<h2>
	<font color="7a0000">
   <c:out value="Confirm the following information:"/></font></h2><br>
   <font color="7a0000">
   <strong><c:out value="Name:"/></strong> ${student.name}<br>
     <strong><c:out value="Surname:"/></strong> ${student.surname}<br>
     <strong><c:out value="School:"/></strong> ${student.school}<br>
     <strong><c:out value="Username:"/></strong> ${student.username}<br>
     <strong><c:out value="Password:"/></strong> ${student.password}<br>
     </font>
     
     <form:form method="post" action="addUser" modelAttribute="student" name="form2">
     <form:input type="hidden" path='name' placeholder="id" /><br/>
     <form:input type="hidden" path='surname' placeholder="id" /><br/>
     
     <form:input type="hidden" path='school' placeholder="id" /><br/>
   	 <form:input type="hidden" path='username' placeholder="id" /><br/>
     
     <form:input type="hidden" path='password' placeholder="id" />
     <input type="submit" value="Confirm Registration" />
     </form:form>
   </c:if>
		
          <a class="classname"href="index">Back to Homepage</a>
          
          </div>
</body>
</html>