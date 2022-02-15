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
<title>Omikuji Form</title>
</head>
<body>
	<h1 class="text-center">Send an Omikuji!!</h1>
	<form class="container" action="/omikuji" method="post">
		<div class="mb-3">
			<label class="form-label" for="number">Pick any number from 5 to 25</label>
			<input class= "" type="number" id=" number" name="number" min="5" max="25"/>
		</div>
		<div class="mb-3 col-2">
			<label class="form-label" for="city">Enter a city</label>
			<input class= "form-control" type="text" id="city" name="city"/>
		</div>
		<div class="mb-3 col-2">
			<label class="form-label" for="name">Enter name of any real person</label>
			<input class= "form-control" type="text" id=" name" name="name"/>
		</div>
		<div class="mb-3 col-2">
			<label class="form-label" for="hobbie">Select a Hobbie/Endeavor</label>
			<input class= "form-control" type="text" id="hobbie" name="hobbie"/>
		</div>
		<div class="mb-3 col-2">
			<label class="form-label" for="living">Write down a living thing</label>
			<input class= "form-control" type="text" id="living" name="living"/>
		</div>
		<div class="mb-3 col-2">
			<label class="form-label" for="kind">Write something kind</label>
			<textarea class="form-control" name="kind" id="kind" cols="20" rows="4"></textarea>
		</div>
		<h6>Send and Show a friend</h6>
		<div>
			<input class= " btn btn-success" type="submit" />
		</div>
	</form>
</body>
</html>