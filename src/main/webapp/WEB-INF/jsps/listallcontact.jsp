<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
   <%@ include file ="menu.jsp" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
<h2> Contact List</h2>
<table>
<tr>
<th>fname</th>
<th>lname</th>
<th>email</th>
<th>mobile</th>
<th>Billing</th>
</tr>
<c:forEach var= "contact" items="${contact}">
<tr>
<td><a href="contactinfo?id=${contact.id}">${contact.firstname}</a></td>
<td>${contact.lastname}</td>
<td>${contact.email}</td>
<td>${contact.mobile}</td>
<td><a href="billinginfo?id=${contact.id}">bill now</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>