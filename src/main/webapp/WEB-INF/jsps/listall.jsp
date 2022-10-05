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
<a href="/">Create Lead</a>
<table>
<tr>
<th>fname</th>
<th>lname</th>
<th>source</th>
<th>email</th>
<th>mobile</th>
</tr>
<c:forEach var= "vasanths" items="${vasanth}">
<tr>
<td><a href="Leadinfo?id=${vasanths.id}">${vasanths.firstname}</a></td>
<td>${vasanths.lastname}</td>
<td>${vasanths.source}</td>
<td>${vasanths.email}</td>
<td>${vasanths.mobile}</td>

</tr>
</c:forEach>
</table>

</body>
</html>