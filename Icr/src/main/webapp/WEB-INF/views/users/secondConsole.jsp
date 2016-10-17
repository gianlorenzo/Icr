<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ICR</title>

<!-- Bootstrap CSS -->

<link type="text/css"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css"
	rel="stylesheet">
<link type="text/css"
	href="${pageContext.request.contextPath}/resources/css/bootstrap-responsive.css"
	rel="stylesheet">
<link type="text/css"
	href="${pageContext.request.contextPath}/resources/css/fontello.css"
	rel="stylesheet">
<link type="text/css"
	href="${pageContext.request.contextPath}/resources/css/fontello-ie7.css"
	rel="stylesheet">
<link type="text/css"
	href="${pageContext.request.contextPath}/resources/css/prettyPhoto.css"
	rel="stylesheet">
<link type="text/css"
	href="${pageContext.request.contextPath}/resources/css/style.css"
	rel="stylesheet">

<!-- Favicon -->
<link rel="shortcut icon"
	href="<c:url value="resources/img/siteImages/favicon.ico"/>">

<style type="text/css">
body {
	background-image: url('./resources/img/siteImages/homePage.png');
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-position: center;
	background-size: 1420px 650px;
}
</style>

</head>
</head>
<body>
	<div style="position: absolute; top: 15px; left: 10px">

		<font size="6" color="white">Student Page</font>
	</div>

	<div style="position: absolute; top: 15px; right: 40px">
		<font size="6" color="white">Welcome : &nbsp
			${pageContext.request.userPrincipal.name}</font>
	</div>



	<div style="position: absolute; top: 230px; right: 590px">
		<a href="studentTasks"><img width="175" height="125"
			src="resources/img/siteImages/taskPerformed.png"></a>
	</div>

	<div style="position: absolute; top: 300px; right: 615px">
		<a href="login"><img width="120" height="70"
			src="resources/img/siteImages/logout.png"></a>
		
	</div>

</body>
</html>