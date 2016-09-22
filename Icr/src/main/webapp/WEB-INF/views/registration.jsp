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

</head>

<body>

	<h4>
		<center>Create a new Account</center>
	</h4>
	<div align="center">
<form:form method="post" action="confirmUser" modelAttribute="user" name="form">
					
					<td>Name :</td>
					<td><form:input type="text" path='Name' placeholder="Name" /></td><br><br>
					<td>Surname :</td>
					<td><form:input type="text" path='Surname' placeholder="Surname" /></td><br><br>
					<td>School :</td>
					<td><form:input type="text" path='School' placeholder="School" /></td><br><br>
					<td>Username :</td>
					<td><form:input type="text" path='Username' placeholder="Username" /></td><br><br>
					
					<td>Password :</td>
					<td><form:input type="Password" path='Password' placeholder="Password" /></td>

							
					<td><input type="submit" value="Send" /></td>
					</form:form>
					<br>
					<c:if test="${not empty user.username}">
   <p><c:out value="Conferma le seguenti informazioni:"/><p><br>
   <b><p><c:out value="Nome:"/></b> ${user.name}<br>
       <b><p><c:out value="Cognome:"/></b> ${user.surname}<br>
           <b><p><c:out value="Scuola:"/></b> ${user.school}<br>
     <b><p><c:out value="Username:"/></b> ${user.username}<br>
     <b><p><c:out value="Password:"/> </b>${user.password}<br>
     
     <form:form method="post" action="addUser" modelAttribute="user" name="form2">
     <form:input type="hidden" path='Name' placeholder="id" /><br/>
     <form:input type="hidden" path='Surname' placeholder="id" /><br/>
     
     <form:input type="hidden" path='School' placeholder="id" /><br/>
   	 <form:input type="hidden" path='Username' placeholder="id" /><br/>
     
     <form:input type="hidden" path='Password' placeholder="id" />
     <td><input type="submit" value="Confirm Registration" /></td>
     </form:form>
   </c:if>
				</tr>
			</table>
		
          <h4><a href="index">Back to Homepage</a>
          
          </div>
</body>
</html>