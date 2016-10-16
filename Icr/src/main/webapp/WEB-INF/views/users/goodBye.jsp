<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

	<!-- Favicon -->
    <link rel="shortcut icon" href="<c:url value="resources/img/siteImages/favicon.ico"/>">
    
    <style type="text/css">
	 body { 
    background-image: url('./resources/img/siteImages/homeAdmin.png');
    background-repeat: no-repeat;
    background-attachment: fixed;
    background-position: center;
    
    background-size: 1500px 650px;

    
}
	   </style>


</head>


<div style="position:absolute; top:15px; left:10px">

<font size="6" color="white">Student Page</font>
</div>

<div style="position:absolute; top:15px; right:40px">
<font size="6" color="white">Welcome : &nbsp ${pageContext.request.userPrincipal.name}</font>
</div>

<div style="position:absolute; top:150px;right:410px">
          <h1>
			<font color="white">Fantastic! You have completed all tasks available</font></h1><br><br>
          </div>

<div style="position:absolute; top:230px;right:590px">
<a  href="studentTasks"><img width="175" height="125" src="resources/img/siteImages/taskPerformed.png"></a>
</div>

<div style="position:absolute; top:300px;right:615px">
<a  href="login"><img width="120" height="70" src="resources/img/siteImages/logout.png"></a><br><br>
</div>






</body>
</html>