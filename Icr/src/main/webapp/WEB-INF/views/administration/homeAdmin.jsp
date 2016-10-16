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
	
    <link rel="shortcut icon" href="resources/img/siteImages/favicon.ico"/>
    
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
<body>

<div style="position:absolute; top:15px; left:10px">
<font size="6" color="white">Admin Page</font>
</div>

<div style="position:absolute; top:15px; right:40px">
<font size="6" color="white">Welcome : &nbsp ${pageContext.request.userPrincipal.name}</font>
</div>
 
    
    <br><br>
    <br><br>
<div style="position:absolute; top:200px;right:700px">
<a href="insertJob"><img width="200" height="150" src="resources/img/siteImages/newJob.png"></a><br><br>
</div>

<div style="position:absolute; top:200px;right:450px">
<a href="insertSymbol"><img width="200" height="150" src="resources/img/siteImages/newSymbol.png"></a><br><br>
</div>

<div style="position:absolute; top:320px;right:605px">
<a href="logout"><img width="150" height="125" src="resources/img/siteImages/logout.png"></a>
</div>
	



</body>
</html>