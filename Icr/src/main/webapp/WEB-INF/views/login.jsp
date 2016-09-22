<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head> 
<meta charset="utf-8">
<title></title>


</head>

<body>
		<div align="center">
		<strong>Sign in with your credentials</strong><br>
	
	<form method="POST" name="f" action="<c:url value="/${pageContext.request.contextPath}/j_spring_security_check"/>">
            
            <label>Username</label>
            <input type='text' name='j_username' /><br><br>

            <label>Password</label>
            <input type='password' name='j_password'><br><br>

            <input name="submit" type="submit" value="Send">
            </div>
        </form>
      

          <center><a style="color: red" href="registration"> Create a new account</a></center>
         <center> <h4><a href="index">Back to homepage</a></h4></center>
</body>
</html>