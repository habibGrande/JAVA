<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

 <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<h1><c:out value="${dojo.name}"/> Location Ninja's</h1>
	
	<table class="table table-striped">
	  		<thead>
			    <tr>
			      <th scope="col">First Name</th>
			      <th scope="col">Last Name</th>
			      <th scope="col">Age</th>
			    </tr>
		  	</thead>
		  	<tbody>
			    <c:forEach var="ninja" items="${dojo.ninjas}">
				<tr>
					<td scope="row"><c:out value="${ninja.firstName}"/></td>
					<td><c:out value="${ninja.lastName}"/></td>
					<td><c:out value="${ninja.age}"/></td>
				</tr>
			</c:forEach>
		  	</tbody>
		</table>






</body>
</html>