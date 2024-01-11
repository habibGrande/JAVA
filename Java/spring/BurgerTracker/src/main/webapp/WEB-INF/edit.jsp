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
	
	
	<div>
		<h1>Edit Burger</h1>
	</div>

	<form:form action="/edit/${burger.id}" method="post" modelAttribute="burger">
	    <p>
	        <form:label path="burgerName">Burger Name</form:label>
	        <form:errors path="burgerName"/>
	        <form:input class="form-control" path="burgerName" value="${burger.burgerName}"/>
	    </p>
	    <p>
	        <form:label class="form-label" path="restName">Restaurant Name</form:label>
	        <form:errors path="restName"/>
	        <form:textarea class="form-control" path="restName" value="${burger.restName}"/>
	    </p>
	    <p>
	        <form:label  path="rate">Rating</form:label>
	        <form:errors path="rate"/>     
	        <form:input class="form-control" type="number" path="rate" value="${burger.rate}"/>
	    </p>  
	    <p>
	        <form:label  path="note">Note</form:label>
	        <form:errors path="note"/>
	        <form:input  path="note" value="${burger.note}" class="form-control"/>
	    </p>
	    <input class="btn btn-primary" type="submit" value="Submit"/>
	</form:form>    
</body>
</html>