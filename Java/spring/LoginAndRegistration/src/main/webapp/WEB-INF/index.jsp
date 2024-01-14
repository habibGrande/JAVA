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

	<form:form action="/register" method="post" modelAttribute="newUser">

		<table class="table table-bordered">
		  <thead>
		    <tr class="table-active">
		      <th colspan="2"scope="col">Register</th>
		    </tr>
		  </thead>
		  <tbody>
		    <tr >
		      <th scope="row">
		      <form:label path="userName"> User Name </form:label>
			        <form:errors palth="userName"/>
			        </th>
		      <td ><form:input path="userName"/></td>
		      
		    </tr>
		    <tr>
		      <th scope="row"><form:label path="email">Email</form:label>
	        <form:errors path="email"/></th>
		      <td colspan="2"><form:input path="email"/></td>
		    </tr>
		    <tr>
		      <th scope="row">
		      	<form:label path="password">password</form:label>
	        	<form:errors path="password"/>
        	 </th>
		      
		      <td scope="row">
		       		<form:input type="password"  path="password"/>
		      </td>
		    </tr>
		      <tr>
		      <th scope="row">
		      	<form:label path="confirm">Confirm Password</form:label>
	        	<form:errors path="confirm"/>
	        </th>
		  
		      <td>
		       	<form:input type="password" path="confirm" />
		       	</td>
		    </tr>
		     <tr>
		      <th scope="row"><input type="submit"class="btn btn-primary" value="Submit"/></th>
		   
		    </tr>

		  </tbody>
		</table>
	</form:form>    
	
	
	<form:form action="/login" method="post" modelAttribute="newLogin">
	
	    <p>
	        <form:label path="email">Email</form:label>
	        <form:errors path="email"/>
	        <form:textarea path="email"/>
	    </p>
	    <p>
	        <form:label path="password">password</form:label>
	        <form:errors path="password"/>     
	        <form:input type="password" path="password"/>
	    </p>  

	    <input type="submit" value="Submit"/>
	</form:form>   
</body>
</html>