<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/css/main.css"/>
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Omikuji Show</title>
</head>
<body>
	<h1>Here's Your Omikuji</h1>
	
	<p class="bg-primary">In <c:out value="${number }"/> years, you will live in <c:out value="${city} "/> 
	with <c:out value="${name }"/> as your roommate, <c:out value="${hobbie }"/>. The next time you see a <c:out value="${living }"/>, 
	you will have good luck.  Also, <c:out value="${kind }"/></p>
	<a href="/">Go Back</a>
</html>