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
<body>
<div style="position:absolute; top:15px; left:10px">

<font size="6" color="white">Student Page</font>
</div>

<div style="position:absolute; top:15px; right:40px">
<font size="6" color="white">Welcome : &nbsp ${pageContext.request.userPrincipal.name}</font>
</div>
	
    
    <br><br>
    <br><br>
		
		
         
		
		<div style="position:absolute; top:200px;right:700px">
          <a  href="newTask"><img width="200" height="150" src="resources/img/siteImages/taskPage.png"></a><br><br>
          </div>
         
         <div style="position:absolute; top:300px;right:615px">
           <a  href="login"><img width="120" height="95" src="resources/img/siteImages/logout.png"></a><br><br>
          </div>
          
          <div style="position:absolute; top:205px;right:450px">
          <a  href="studentTasks"><img width="180" height="130" src="resources/img/siteImages/taskPerformed.png"></a><br><br>
          </div>
		
		
 
</body>
</html>