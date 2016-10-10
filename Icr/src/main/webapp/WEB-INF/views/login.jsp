<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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


		<br><br><br>
		<div align="center">
		<h2>
		<strong><font color="white">Sign in with your credentials</font></strong><br>
	</h2>
	<form method="POST" name="f" action="<c:url value="/${pageContext.request.contextPath}/j_spring_security_check"/>">
            <h3>
            Username</h3>
            <input type='text' name='j_username' /><br>

            <h3>Password</h3>
            <input type='password' name='j_password'><br><br>

            <input name="submit" type="submit" value="Send">
            
        </form>
        </div>
     	
     	<div style="position:absolute; top:350px;right:580px ">
     	<a href="registrationAdmin"><img width="200" height="150" src="<c:url value="/resources/img/newAdmin.png"/>"></a><br><br>
          <a  href="registration"><img width="200" height="150" src="<c:url value="/resources/img/newAccount.png"/>"></a><br><br>
          <a  href="index"><img width="200" height="150" src="<c:url value="/resources/img/toHomepage.png"/>"></a>
		</div>
</body>
</html>