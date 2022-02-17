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
   <h1>New Book</h1>
   <form:form action = "/books" method = "post" modelAttribute="book" class="form-control conatiner ">
   		<div>
   			<form:label class="col-sm-1 col-form-label" path="title">Title</form:label>
   			<form:errors path="title" class="danger" />
   			<form:input path="title"/>
   		</div>
   		<div>
   			<form:label class="col-sm-1 col-form-label" path="language">Language</form:label>
   			<form:errors path="language" class="danger"/>
   			<form:input path="language"/>
   		</div>
   		<div>
   			<form:label class="col-sm-1 col-form-label" path="numberOfPages">Pages</form:label>
   			<form:errors path="numberOfPages" class="danger" />
   			<form:input path="numberOfPages"/>
   		</div>
   		<div>
   			<form:label class="col-sm-1 col-form-label" path="description">Description</form:label>
   			<form:errors path="description" class="danger"/>
   			<form:textarea path="description"/>
   		</div>
   		<input type="submit" value="submit" />
   </form:form>
</body>
</html>