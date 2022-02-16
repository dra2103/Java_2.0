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
<title>Insert title here</title>
</head>
<body>
	<h1> <c:out value="${book.getTitle()}"></c:out> </h1>
	<p><c:out value="${book.getLanguage()}"></c:out> </p>
	<p><c:out value="${book.getNumberOfPages()}"></c:out> </p>
	<p><c:out value="${book.getDescription()}"></c:out> </p>
</body>
</html>