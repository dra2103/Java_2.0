<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1 class="text-center">Create One</h1>
	<div class="d-flex justify-content-around">
		<div class="">
			<a href="/dojo">Create Dojo</a>
		</div>
		<div class="">
			<a href="/ninja">Create Ninja</a>
		</div>
	</div>
	<div class ="d-flex justify-content-center">
	<c:forEach items="${dojos }" var="d">
		<a href="/dojo/${d.id}/show">| ${d.getDojoName() } |</a>
	</c:forEach>
	</div>
</body>
</html>