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
		<h1>Welcome!! <c:out value="${thisUser.getUserName() }"/>  </h1>
		
		<p>
		<a href="/logout">logout</a>
		</p>
	</div>
	<div class="d-flex justify-content-around">
	<p>Books from everyone's shelves:</p>
	<p>
	<a href="/books/new" class="btn btn-success">Create new book</a>
	</p>
	</div>
	
	<table class="table container">
		<thead>
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Author Name</th>
				<th>Posted By</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ allBooks}" var="b">
				<tr>
					<td> ${b.id }</td>
					<td> <a href="/books/${b.id }">${b.title }</a></td>
					<td> ${b.author }</td>
					<td> ${b.getUser().getUserName()}</td>
					<c:if test="${b.user.id == thisUser.id }">
						<td class="col-2"> 
							<div class="d-flex">
								<a href="/books/${b.id }/edit" class="btn btn-secondary">Edit</a>
								<form action="/books/${b.id }/delete" method="post" >
									<input type= "hidden" name="_method" value="delete">
									<input type="submit" value="Delete" class="btn btn-danger" >
								</form>
							</div>
						</td>
					</c:if>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>