<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Ninja Gold Game</title>
	<link rel="stylesheet" href="/css/css.css"/>

</head>
<body>

	 <div class="gold-display">
	    Your Gold: <input type="text" value="${gold}" >
	  </div>
	
	<div class="container">
	  <form action="/NinjaGold" class="location" method="post">
	  <input type="hidden" name="farm" value="farm">
	    Farm<br>
	    (earns 10-20 gold)
	    <button >Find Gold!</button>
	  </form>
	
	  <form  action="/NinjaGold" class="location" method="post">
	  <input type="hidden" name="farm" value="cave">
	    Cave<br>
	    (earns 5-10 gold)
	    <button >Find Gold!</button>
	  </form>
	
	  <form  action="/NinjaGold" class="location" method="post">
	  <input type="hidden" name="farm" value="house">
	    House<br>
	    (earns 2-5 gold)
	    <button >Find Gold!</button>
	  </form>
	
	  <form  action="/NinjaGold" class="location" method="post">
	  <input type="hidden" name="farm" value="cave">
	    Quest<br>
	    (earns/takes 0 - 50 gold)
	    <button>Find Gold!</button>
	  </form>
	</div>
	
	<div class="activities-container" >
    <div><span>Activities:</span></div>
    <div class="activities">
    	<c:forEach var="text" items="${text}">
	    <c:out value="${text}"/>
		</c:forEach>
    </div>
</div>

</body>
</html>