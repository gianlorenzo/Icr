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
<form:form method="post" action="confirmUser" modelAttribute="student" name="form">
					
					<td>Name :</td>
					<td><form:input type="text" path='name' placeholder="Name" /></td><br><br>
					<td>Surname :</td>
					<td><form:input type="text" path='surname' placeholder="Surname" /></td><br><br>
					<td>School :</td>
					<td><form:input type="text" path='school' placeholder="School" /></td><br><br>
					<td>Username :</td>
					<td><form:input type="text" path='username' placeholder="Username" /></td><br><br>
					
					<td>Password :</td>
					<td><form:input type="Password" path='password' placeholder="Password" /></td>

							
					<td><input type="submit" value="Send" /></td>
					</form:form>
					<br>
					<c:if test="${not empty student.username}">
   <p><c:out value="Confirm the following information:"/><p><br>
   <b><p><c:out value="Name:"/></b> ${student.name}<br>
       <b><p><c:out value="Surname:"/></b> ${student.surname}<br>
           <b><p><c:out value="School:"/></b> ${student.school}<br>
     <b><p><c:out value="Username:"/></b> ${student.username}<br>
     <b><p><c:out value="Password:"/> </b>${student.password}<br>
     
     <form:form method="post" action="addUser" modelAttribute="student" name="form2">
     <form:input type="hidden" path='name' placeholder="id" /><br/>
     <form:input type="hidden" path='surname' placeholder="id" /><br/>
     
     <form:input type="hidden" path='school' placeholder="id" /><br/>
   	 <form:input type="hidden" path='username' placeholder="id" /><br/>
     
     <form:input type="hidden" path='password' placeholder="id" />
     <td><input type="submit" value="Confirm Registration" /></td>
     </form:form>
   </c:if>
				</tr>
			</table>
		
          <h4><a href="index">Back to Homepage</a>
          
          </div>
</body>
</html>