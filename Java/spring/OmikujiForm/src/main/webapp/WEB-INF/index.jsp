<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" href="/css/form.css"/>
</head>
<body>
	<div class="container">
	  <div class="form-title">Send an Omikuji!</div>
	  <form action="/process" method="post">
	    <div class="form-group">
	      <label for="number">Pick any number from 5 to 25</label>
	      <input type="number" id="number" name="number" min="5" max="25">
	    </div>
	    <div class="form-group">
	      <label for="city">Enter the name of any city</label>
	      <input type="text" id="city" name="city">
	    </div>
	    <div class="form-group">
	      <label for="person">Enter the name of any real person</label>
	      <input type="text" id="person" name="person">
	    </div>
	    <div class="form-group">
	      <label for="endeavor">Enter professional endeavor or hobby</label>
	      <input type="text" id="endeavor" name="endeavor">
	    </div>
	    <div class="form-group">
	      <label for="living-thing">Enter any type of living thing</label>
	      <input type="text" id="living-thing" name="living_thing">
	    </div>
	    <div class="form-group">
	      <label for="nice-thing">Say something nice to someone</label>
	      <textarea id="nice-thing" name="nice_thing"></textarea>
	    </div>
	    <div class="form-group">
	      <button type="submit">Send</button>
	    </div>
	  </form>
	</div>

</body>
</html>