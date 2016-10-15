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
    <link rel="shortcut icon" href="<c:url value="resources/img/siteImages/favicon.ico"/>">
    
    <style type="text/css">
	 body { 
    background-image: url('./resources/img/siteImages/background.png');
    background-repeat: no-repeat;
    background-attachment: fixed;
    background-position: center;
    
    background-size: 1500px 650px;

    
}
	   </style>

</head>

<body>

    <br><br>
 
	<div align="center">
	
	<h2>
		<strong><font color="ffffff">Create a new Account</font></strong><br>
	</h2>
<form:form method="post" action="confirmUser" modelAttribute="student" name="form">
					<div class="normal">
					
					
					Name :
					<form:input type="text" path='name' placeholder="Name" />
					Surname :
					<form:input type="text" path='surname' placeholder="Surname" /><br>
					School :
					<form:input type="text" path='school' placeholder="School" />
					SchoolGroup:
					<form:select path="schoolGroup">
						<form:options items="${schoolGroups}" />
					
					</form:select>
					Section:
					<form:input type="text" path='section' placeholder="Section" />
					Username :<font size="3" color="red">${usernameError}</font>
					<form:input type="text" path='username' placeholder="Username" />
				
					Password :
					<form:input type="Password" path='password' placeholder="Password" /><br>
					
					
					
					
					</div>
					
					<font color="white"><springForm:errors path="username" /></font>
					<font color="white"><springForm:errors path="password" /></font>
					<td><input type="submit" value="Send" /><td>
					 
					</form:form>
					
				
					
					
					<c:if test="${not empty student.username}">
	<h2>
	<font color="ffffff">
   <c:out value="Confirm the following information:"/></font></h2><br>
   <font color="ffffff">
   
   <strong><c:out value="Name:"/></strong> ${student.name}<br>
     <strong><c:out value="Surname:"/></strong> ${student.surname}<br>
     <strong><c:out value="School:"/></strong> ${student.school}<br>
          <strong><c:out value="SchoolGroup:"/></strong> ${student.schoolGroup}<br>
     
          <strong><c:out value="Username:"/></strong> ${student.section}<br>
     
     <strong><c:out value="Username:"/></strong> ${student.username}<br>
     <strong><c:out value="Password:"/></strong> ${student.password}<br>
     </font>
     <form:form method="post" action="addUser" modelAttribute="student" name="form2">
     <input type="submit" value="Confirm Registration" /><br><br>
     
     <div style="position:absolute; top:475px;right:610px ">
     <a href="index"><img width="125" height="100" src="<c:url value="/resources/img/siteImages/toHomepage.png"/>"></a>
     </div>
     
     <form:input type="hidden" path='name' placeholder="id" /><br/>
     <form:input type="hidden" path='surname' placeholder="id" /><br/>
     
     <form:input type="hidden" path='school' placeholder="id" /><br/>
          <form:input type="hidden" path='schoolGroup' placeholder="id" /><br/>
     
         <form:input type="hidden" path='section' placeholder="id" /><br/>
    
   	 <form:input type="hidden" path='username' placeholder="id" /><br/>
     
     <form:input type="hidden" path='password' placeholder="id" />
     <form:input type="hidden" path='role' placeholder="id" />
     
     
     </form:form>
   </c:if>
		 
          
          
          </div>
</body>
</html>