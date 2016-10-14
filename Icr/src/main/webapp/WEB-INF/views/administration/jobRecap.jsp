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

<div style="position:absolute; top:15px; left:10px">

<font size="6" color="white">Admin Page</font>
</div>

<div style="position:absolute; top:15px; right:40px">
<font size="6" color="white">Welcome : &nbsp ${pageContext.request.userPrincipal.name}</font>
</div>

    <br><br>
<div align="center">

<h2>
<font color="ffffff">
<c:out value="Confirms the following information:" /></font></h2>
		 <font color="ffffff">
		<strong><c:out value="Title:" /></strong>${job.title}<br>
		 
		 
		 <strong><c:out value="#Students:" /></strong>${job.students}<br>
		 <strong><c:out value="#Images:" /></strong>${job.numberOfImages}<br>
		 <strong><c:out value="%Type1:" /></strong>${job.percentageType1}<br>
		 <strong><c:out value="%Type2:" /></strong>${job.percentageType2}<br>
		 <strong><c:out value="%Type3:" /></strong>${job.percentageType3}<br>
		 <strong><c:out value="TaskSize:" /></strong>${job.taskSize}<br><br>
		 <strong><c:out value="ImageManuscript:" /></strong>${job.imageManuscript}<br><br>
		 
		 <strong><c:out value="Symbol:" /></strong>${job.symbol.transcription}<br><br>
		
		</font>
			
	<div style="position:absolute; top:320px;right:578px">
<a href="homeAdmin"><img width="200" height="150" src="resources/img/toHomeAdmin.png"></a><br><br>
</div>	
</div>

</body>
</html>