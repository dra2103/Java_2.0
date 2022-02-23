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
	<h1>Create a Ninja</h1>
	<form:form action="/ninja/new" method="post" modelAttribute="newNinja">
		<div>
			<form:label path="dojo">Select a Dojo:</form:label>
			<form:select  path="dojo">
				<c:forEach items="${dojos }" var="d">
				<option value="${d.id}"> ${d.getDojoName()}</option>
				</c:forEach>
			</form:select>
		</div>
		<div>
			<form:errors class="text-danger" path="firstName" />
			<form:label path="firstName">First Name:</form:label>
			<form:input path="firstName" />
		</div>
		<div>
			<form:errors class="text-danger" path="lastName" />
			<form:label path="lastName">Last Name:</form:label>
			<form:input path="lastName" />
		</div>
		<div>
			<form:errors class="text-danger" path="age" />
			<form:label path="age">Age:</form:label>
			<form:input path="age" />
		</div>
		<button>submit</button>
	</form:form>
</body>
</html>