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
	<div class="d-flex justify-content-around">
		<h1> <c:out value="${oneBook.getTitle()}"/> </h1>
		<a href="/home">Go back to shelves</a>
	</div>
	<div class="text-center">
		<h4><c:out value="${oneBook.user.getUserName()}"/> read <c:out value="${oneBook.getTitle()}"/> by <c:out value="${oneBook.getAuthor()}"/> </h4>
		<h5>Here are <c:out value="${oneBook.user.getUserName()}"/> thoughts</h5>
	</div>
	<hr class=" container"/>
	<div class="text-center container">
		<p class="text-primary"> <c:out value="${oneBook.getThoughts()}"/></p> 
	</div>
	<hr class=" container"/>

</body>
</html>