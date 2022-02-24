<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) -->
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Title</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1 class="text-center">Welcome!!</h1>
	<h6 class="text-center">Join our growing community</h6>
	<div class="d-flex container justify-content-around">
		<div class="">
			<h2>Register:</h2>
			<form:form action="/register" method="post" modelAttribute="newUser">
				<div class="mb-3">
					<form:errors class="text-danger" path="userName" />
					<form:label class="form-label" path="userName">User Name:</form:label>
					<form:input class="form-control" path="userName" />
				</div>
				<div class="mb-3">
					<form:errors class="text-danger" path="email" />
					<form:label class="form-label" path="email">Email:</form:label>
					<form:input class="form-control" path="email" />
				</div>
				<div class="mb-3">
					<form:errors class="text-danger" path="password" />
					<form:label class="form-label" path="password">Password:</form:label>
					<form:password class="form-control" path="password" />
				</div>
				<div class="mb-3">
					<form:errors class="text-danger" path="confirm" />
					<form:label class="form-label" path="confirm">Confirm PW:</form:label>
					<form:password class="form-control" path="confirm" />
				</div>
				<input type="submit" value="Register" class="btn btn-primary" />
			</form:form>
		</div>
		<div class= "login-reg-main border-round">
			<h2>Login:</h2>
			<form:form action ="/login" method="post" modelAttribute="newLogin">
				<div>
					<form:errors class="text-danger" path="email" />
					<form:label class="form-label" path="email">Email:</form:label>
					<form:input class="form-control" path="email" />
				</div>
				<div>
					<form:errors class="text-danger" path="password" />
					<form:label class="form-label" path="password">Password:</form:label>
					<form:password class="form-control" path="password" />
				</div>
				<input type="submit" value="Login" class="btn btn-success" />
			</form:form>
		</div>
	</div>
</body>
</html>