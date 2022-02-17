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
<h1 class="text-center">All Books</h1>
<table class="table container">
	<thead>
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Language</th>
			<th>Number of Pages</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${ books}" var="b">
			<tr>
				<td><c:out value="${b.getId() }"></c:out></td>
				<td> <a href="/books/${b.id}"><c:out value="${b.getTitle()}"></c:out></a></td>
				<td><c:out value="${b.getLanguage()}"></c:out></td> 
				<td><c:out value="${b.getNumberOfPages()}"></c:out> </td>
			</tr>	
		</c:forEach>
	</tbody>
</table>
</body>
</html>