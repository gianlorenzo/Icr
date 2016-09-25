<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="it.uniroma3.icr.model.Job" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



    
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
<body>
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
	<h1><font color="7A0000"><strong>
	Select the images resemble that letter: &nbsp ${job.symbol.transcription}</strong> </font></h1>
	</div>
	
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo1/74_295.png" />" /><br>
		<input type="checkbox" name="image" value="75_213.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo1/75_213.png" />" /><br>
		<input type="checkbox" name="image" value="75_213.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo1/75_218.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo1/75_223.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo1/75_228.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo1/75_233.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo1/75_251.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo1/75_340.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo1/75_345.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo1/75_682.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo2/75_729.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo2/76_1046.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo2/76_1071.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo2/76_1099.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo2/76_199.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo2/76_321.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo2/76_335.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo2/76_385.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo2/76_390.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo2/76_696.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo2/76_701.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo2/76_743.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo2/76_748.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo2/76_753.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo2/76_758.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo2/76_763.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo2/76_813.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo2/76_818.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo2/76_823.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo2/77_169.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo3/77_490.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo3/77_495.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo3/77_500.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo3/77_569.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo3/77_583.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo3/77_588.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo3/77_593.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo3/77_598.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo3/77_784.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo3/77_828.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo3/77_833.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo3/77_838.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo3/77_843.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo3/77_848.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo3/77_853.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo3/77_858.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo3/77_863.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo3/77_868.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo3/77_873.png" />" /><br>
		<input type="checkbox" name="image" value="74_295.png"/>
	
	<img src="<c:url value="/resources/sources/rv12/tipo3/77_929.png" />" /><br><br>
	
	
	
	<td><input type="submit" value="Send" /></td>





</body>
</html>