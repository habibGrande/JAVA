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
</head>
<body>

<table class="table">
  		<thead>
		    <tr>
		      <th scope="col">First Name</th>
		      <th scope="col">Last Name</th>
		      <th scope="col">Age</th>
		    </tr>
	  	</thead>
	  	<tbody>
		    <c:forEach var="burger" items="${burgers}">
			<tr>
				<td><c:out value="${burger.name}"/></td>
				<td><c:out value="${burger.restName}"/></td>
				<td><c:out value="${burger.rate}"/></td>
			</tr>
		</c:forEach>
	  	</tbody>
	</table>






</body>
</html>