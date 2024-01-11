<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Burger Tracker</title>
	<!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/main.css"/>
	<!-- For any Bootstrap that uses JS -->
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>Burger Tracker</h1>
	<table class="table">
  		<thead>
		    <tr>
		      <th scope="col">Burger Name</th>
		      <th scope="col">Restaurant Name</th>
		      <th scope="col">Rating(out of 5)</th>
		    </tr>
	  	</thead>
	  	<tbody>
		    <c:forEach var="burger" items="${burgers}">
			<tr>
				<td><c:out value="${burger.burgerName}"/></td>
				<td><c:out value="${burger.restName}"/></td>
				<td><c:out value="${burger.rate}"/></td>
				<td><a href="/edit/${burger.id}">Edit</a></td>
			</tr>
		</c:forEach>
	  	</tbody>
	</table>
	<div>
		<h1>Add a Burger</h1>
	</div>

	<form:form action="/Burger" method="post" modelAttribute="burger">
	    <p>
	        <form:label path="burgerName">Burger Name</form:label>
	        <form:errors path="burgerName"/>
	        <form:input path="burgerName"/>
	    </p>
	    <p>
	        <form:label path="restName">Restaurant Name</form:label>
	        <form:errors path="restName"/>
	        <form:textarea path="restName"/>
	    </p>
	    <p>
	        <form:label path="rate">Rating</form:label>
	        <form:errors path="rate"/>     
	        <form:input type="number" path="rate"/>
	    </p>  
	    <p>
	        <form:label path="note">Note</form:label>
	        <form:errors path="note"/>
	        <form:input path="note" />
	    </p>
	    <input type="submit" value="Submit"/>
	</form:form>    
	







</body>
</html>