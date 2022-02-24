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
	<h1>Create a new Book</h1>
	<a href="/home">Back to book shelf</a>
	</div>
	<div class="container">
		<form:form action="/books" method="post" modelAttribute ="book">
		<form:input type="hidden" path="user" value="${ loggedInUser.id }"/>
			<div class="row g-3 align-items-center">
				<form:label path="title">Title:</form:label>
				<form:errors class="text-danger" path="title"/>
				<form:input path="title"/>
			</div>
			<div class="row g-3 align-items-center">
				<form:label path="author">Author:</form:label>
				<form:errors class="text-danger" path="author"/>
				<form:input path="author"/>
			</div>
			<div class="row g-3 align-items-center">
				<form:label path="thoughts">Thoughts:</form:label>
				<form:errors class="text-danger" path="thoughts"/>
				<form:input path="thoughts"/>
			</div>
			<input type="submit" value="Submit" />
		</form:form>
	</div>
</body>
</html>