<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
                <!-- YOUR own local CSS -->
        <link rel="stylesheet" href="/css/main.css"/>
                <!-- For any Bootstrap that uses JS or jQuery-->
        <script src="/webjars/jquery/jquery.min.js"></script>
        <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Fruity Loops</title>
</head>
<body>
	<h1 class="text-center text-danger">Fruit Store</h1>
	<table class="table container">
		<thead>
			<tr>
				<th class="text-primary">Name</th>
				<th class="text-primary">Price</th>
			</tr>
		</thead>
	</table>
	<c:forEach var="oneFruit" items="${fruitList}">
	<table class="table container table-striped">
		<tbody>
			<tr>
				<td class="text-warning"><c:out value="${oneFruit.name}"></c:out></td>
				<td class="text-warning"><c:out value="${oneFruit.price}"></c:out></td>
			</tr>
		</tbody>
	</table>	
	</c:forEach>
	
</body>
</html>