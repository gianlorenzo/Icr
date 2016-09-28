<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<h2>
<font color="7a0000">
<c:out value="Confirms the following information:" /></font></h2>
		 <font color="7a0000">
		<strong><c:out value="Title:" /></strong>${job.title}<br>
		 
		 
		 <strong><c:out value="#Students:" /></strong>${job.students}<br>
		 <strong><c:out value="#Images:" /></strong>${job.images}<br>
		 <strong><c:out value="%Type1:" /></strong>${job.percentageType1}<br>
		 <strong><c:out value="%Type2:" /></strong>${job.percentageType2}<br>
		 <strong><c:out value="%Type3:" /></strong>${job.percentageType3}<br>
		 <strong><c:out value="TaskSize:" /></strong>${job.taskSize}<br><br>
		 
		 <strong><c:out value="Symbol:" /></strong>${job.symbol.transcription}<br><br>
		
		</font>
		
		
		
	<a class="classname" href="homeAdmin">Return to home Admin</a>
</div>

</body>
</html>