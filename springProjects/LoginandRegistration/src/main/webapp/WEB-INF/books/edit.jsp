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
	<h1>Edit <c:out value="${book.getTitle() }"/> <c:out value="${book.user.getUserName() }"/></h1>
	<a href="/home" class="btn btn-primary">Back to book shelve</a>
	</div>
	
	<form:form action="/books/${book.id}" method="post" modelAttribute="book">
		<input type="hidden" name="_method" value="put">
		<form:input type="hidden" path="user" value="${ loggedInUser.id }"/>
		<div>
			<form:label path="title">Title:</form:label>
			<form:errors path="title" class="text-danger"/>
			<form:input path="title"/>
		</div>
		<div>
			<form:label path="author">Author:</form:label>
			<form:errors path="author" class="text-danger"/>
			<form:input path="author"/>
		</div>
		<div>
			<form:label path="thoughts">Thoughts:</form:label>
			<form:errors path="thoughts" class="text-danger"/>
			<form:input path="thoughts"/>
		</div>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>