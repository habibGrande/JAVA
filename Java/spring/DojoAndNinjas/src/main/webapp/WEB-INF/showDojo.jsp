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

	<form:form action="/ninjas/new" method="post" modelAttribute="ninja">
			<form:select path="dojo">
		        <c:forEach var="oneDojo" items="${dojo}">
		            <!--- Each option VALUE is the id of the person --->
		            <form:option value="${oneDojo.id}" path="dojo">
		            <!--- This is what shows to the user as the option --->
		                <c:out value="${oneDojo.name}"/>
		            </form:option>
		        </c:forEach>
	    	</form:select>
		    <p>
		        <form:label path="firstName">First Name</form:label>
		        <form:errors path="firstName"/>
		        <form:input path="firstName"/>
		    </p>
		    <p>
		        <form:label path="lastName">Last Name</form:label>
		        <form:errors path="lastName"/>
		        <form:textarea path="lastName"/>
		    </p>
		    <p>
		        <form:label path="age">Age</form:label>
		        <form:errors path="age"/>     
		        <form:input type="number" path="age"/>
		   
		    <input type="submit" value="Submit"/>
	</form:form>    
		


</body>
</html>