<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/main.css"/>
	<!-- For any Bootstrap that uses JS -->
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

<h1>Save Travels</h1>
	<table class="table table-hover">
  		<thead>
		    <tr>
		      <th scope="col">Expense</th>
		      <th scope="col">Vendor</th>
		      <th scope="col">Amount</th>
		      <th scope="col">Action</th>
		      <th scope="col">Delete</th>
		    </tr>
	  	</thead>
	  	<tbody>
		    <c:forEach var="expense" items="${expenses}">
			<tr>
				<td scope="row"><c:out value="${expense.title}"/></td>
				<td><c:out value=""/><a href="/show/${expense.getId() }">${expense.ventor}</a></td>
				<td><c:out value="${expense.amount}"/></td>
				<td><a href="/edit/${expense.id}">Edit</a></td>
				<td> <a href="/delete/${expense.getId() }">
				 	<input type="hidden" name="_method" value="delete">
	    			<input type="submit" value="Delete" class="btn btn-danger"></a>
				</td>
				
			</tr>
		</c:forEach>
	  	</tbody>
	</table>
	<div>
		<h1>Add an Expense</h1>
	</div>

	<form:form action="/create" method="post" modelAttribute="expense">
	    <p>
	        <form:label path="title">Expense</form:label>
	        <form:errors path="title"/>
	        <form:input path="title"/>
	    </p>
	    <p>
	        <form:label path="ventor">Vendor</form:label>
	        <form:errors path="ventor"/>
	        <form:textarea path="ventor"/>
	    </p>
	    <p>
	        <form:label path="amount">Amount</form:label>
	        <form:errors path="amount"/>     
	        <form:input type="number" path="amount"/>
	    </p>  
	    <p>
	        <form:label path="description">Description</form:label>
	        <form:errors path="description"/>
	        <form:input path="description" />
	    </p>
	    <input type="submit" value="Submit" class="btn btn-primary"/>
	</form:form>    
	





</body>
</html>