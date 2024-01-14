<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>edit</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/main.css"/>
	<!-- For any Bootstrap that uses JS -->
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div>
		<h1>Edit Expense</h1>
	</div>

	<form:form action="/edit/${expense.id}" method="post" modelAttribute="expense">
	    <p>
	        <form:label path="title">Expense</form:label>
	        <form:errors path="title"/>
	        <form:input path="title" value="${expense.title}"/>
	    </p>
	    <p>
	        <form:label path="ventor">Vendor</form:label>
	        <form:errors path="ventor"/>
	        <form:textarea path="ventor" value="${expense.ventor}"/>
	    </p>
	    <p>
	        <form:label path="amount">Amount</form:label>
	        <form:errors path="amount"/>     
	        <form:input type="number" path="amount" value="${expense.amount}"/>
	    </p>  
	    <p>
	        <form:label path="description">Description</form:label>
	        <form:errors path="description"/>
	        <form:input path="description" value="${expense.description}"/>
	    </p>
	    <input type="submit" value="Submit" class="btn btn-primary"/>
	</form:form>    
	
</body>
</html>