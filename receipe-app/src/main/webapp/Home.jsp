<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>   
<%@ page import="java.util.*" %>
<%! int fontSize; %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Recipe Page</title>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}

tr:nth-child(even) {
  background-color: rgba(150, 212, 212, 0.4);
}

th:nth-child(even),td:nth-child(even) {
  background-color: rgba(150, 212, 212, 0.4);
}
</style>
</head>
<body>
<table style="width:100%">
<tr style="height:70px"><th>Id</th><th>Name</th><th>Date and time of its Creation</th><th>Type of Dish</th><th>Serves For </th><th>Ingredients</th><th>CookingInstructions</th></tr>
<c:forEach items="${R}" var="item">


<tr style="height:70px">
<c:set var="count" value="0" scope="page" />
<c:forEach items="${item.getList()}" var="valuee">
<c:set var="count" value="${count + 1}" scope="page"/>
<c:if test = "${count!=6 }">
<th>${valuee}</th></c:if>
<c:if test = "${count==6 }">
 <th>
               <ol>
         <c:forEach items="${item.getvaluess(valuee)}" var="ts">
         <li>${ts}</li>
         </c:forEach>
         
         </ol></th>
         </c:if>
     
</c:forEach>

<th><a href="/delete/${R.get(0).getId()}">Delete</a></th>
<th><a href="/se/${R.get(0).getId()}">Update</a></th>
</tr>
</c:forEach>
</table>
<h3><a href="/">Home page</a> | <a href="/add">Add Recipe</a> | <a href="/s">Delete Recipe</a> | <a href="/se">Update Recipe</a></h3>
  
</body>
</html>