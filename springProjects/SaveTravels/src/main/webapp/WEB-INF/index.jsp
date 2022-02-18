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
<title>Travel Expenses</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1 class="text-center">Save Travel</h1>
	<table class="tabel container">
		<thead>
			<tr>
				<th>Expense</th>
				<th>Vendor</th>
				<th>Amount</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${travels }" var="t">
				<tr>
					<td><c:out value="${t.expense }"></c:out></td>
					<td><c:out value="${t.vendor }"></c:out></td>
					<td><c:out value="${t.amount }"></c:out></td>
					<td><a href="/expenses/${t.id }/edit">Edit</a>
						<form action="/expenses/${t.id}" method="post">
							<input type="hidden" name="_method" value="delete"> 
							<input type="submit" value="Delete">
						</form></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<h2 class="text-center">Add an Expense</h2>
	<form:form action="/expenses/new" method="post"
		modelAttribute="expenses" class="form-control container">
		<p>
			<form:errors class="text-danger" path="expense" />
		</p>
		<p>
			<form:errors class="text-danger" path="vendor" />
		</p>
		<p>
			<form:errors class="text-danger" path="amount" />
		</p>
		<p>
			<form:errors class="text-danger" path="description" />
		</p>
		<div>
			<form:label class="col-sm-1 col-form-label" path="expense">Expense Name:</form:label>
			<form:input path="expense" />
		</div>
		<div>
			<form:label class="col-sm-1 col-form-label" path="vendor">Vendor:</form:label>
			<form:input path="vendor" />
		</div>
		<div>
			<form:label class="col-sm-1 col-form-label" path="amount">Amount:</form:label>
			<form:input type="number" min=".01" step="0.01" path="amount" />
		</div>
		<div>
			<form:label class="col-sm-1 col-form-label" path="description">Description:</form:label>
			<form:textarea path="description" />
		</div>
		<input type="submit" value="submit" />

	</form:form>

</body>
</html>








