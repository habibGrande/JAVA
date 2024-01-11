<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<h1>All Books</h1>
	<table class="table table-striped">
	    <thead>
	        <tr>
	            <th scope="col">ID</th>
	            <th scope="col">Title</th>
	            <th scope="col">Language</th>
	            <th scope="col">Number of Pages</th>
	        </tr>
	    </thead>
	    <tbody>
	         <c:forEach var="book" items="${books}">
	         	<tr>
	         		<td scope="row"><c:out value="${book.id}"/></td>
	         		<td><a ><c:out value="${book.title}"/>
	         					</a></td>
	         		<td><c:out value="${book.language}"/></td>
	         		<td><c:out value="${book.numberOfPages}"/></td>
	         	</tr>
	         </c:forEach>
	    </tbody>
	</table>

</body>
</html>