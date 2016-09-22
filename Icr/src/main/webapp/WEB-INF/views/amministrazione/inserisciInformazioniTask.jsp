<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Trascrizioni Medievali</title>
</head>
<body>
<div align="center">


<strong>

	<strong>Titolo:</strong>${task.titolo}	
	
	<form:form method="post" action="inserisciInformazioni" modelAttribute="task" name="form">	
	<form:select path="simboli">
	<form:options items="${simboli}" itemLabel="trascrizione"
					itemValue="id" />
			</form:select><br>
			
		<input type="submit" value="Invia" />
		</form:form>
	
</strong>


</div>

</body>
</html>