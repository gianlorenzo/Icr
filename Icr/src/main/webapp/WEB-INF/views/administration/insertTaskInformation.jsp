<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ICE</title>



</head>
<body>
<div align="center">


<strong>

	<strong>Title:</strong>${task.title}	
	
	<form:form method="post" action="insertInformationTask" modelAttribute="task" name="form">	
	<form:select path="symbols">
	<form:options items="${symbols}" itemLabel="type"
					itemValue="id" />
			</form:select><br>
			
			<td><form:input type="text" path='' placeholder="transcription" /></td><br><br>
			
		<input type="submit" value="Insert SYmbol" />
		</form:form>
	
</strong>


</div>

</body>
</html>