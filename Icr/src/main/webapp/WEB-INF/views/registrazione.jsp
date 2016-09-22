<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="springForm"%>
<head> 
<meta charset="utf-8">
<title>Trascrizioni Medievali</title>

</head>

<body>

	<h4>
		<center>Crea un nuovo account</center>
	</h4>
	<div align="center">
<form:form method="post" action="confermaUtente" modelAttribute="utente" name="form">
					
					<td>Nome :</td>
					<td><form:input type="text" path='Nome' placeholder="Nome" /></td><br><br>
					<td>Cognome :</td>
					<td><form:input type="text" path='Cognome' placeholder="Cognome" /></td><br><br>
					<td>Scuola :</td>
					<td><form:input type="text" path='Scuola' placeholder="Scuola" /></td><br><br>
					<td>Username :</td>
					<td><form:input type="text" path='Username' placeholder="Username" /></td><br><br>
					
					<td>Password :</td>
					<td><form:input type="Password" path='Password' placeholder="Password" /></td>

							
					<td><input type="submit" value="Invia" /></td>
					</form:form>
					<br>
					<c:if test="${not empty utente.username}">
   <p><c:out value="Conferma le seguenti informazioni:"/><p><br>
   <b><p><c:out value="Nome:"/></b> ${utente.nome}<br>
       <b><p><c:out value="Cognome:"/></b> ${utente.cognome}<br>
           <b><p><c:out value="Scuola:"/></b> ${utente.scuola}<br>
     <b><p><c:out value="Username:"/></b> ${utente.username}<br>
     <b><p><c:out value="Password:"/> </b>${utente.password}<br>
     
     <form:form method="post" action="aggiungiUtente" modelAttribute="utente" name="form2">
     <form:input type="hidden" path='Nome' placeholder="id" /><br/>
     <form:input type="hidden" path='Cognome' placeholder="id" /><br/>
     
     <form:input type="hidden" path='Scuola' placeholder="id" /><br/>
   	 <form:input type="hidden" path='username' placeholder="id" /><br/>
     
     <form:input type="hidden" path='Password' placeholder="id" />
     <td><input type="submit" value="Conferma Registrazione" /></td>
     </form:form>
   </c:if>
				</tr>
			</table>
		
          <h4><a href="index">Torna alla homepage</a>
          
          </div>
</body>
</html>