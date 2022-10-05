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
<table>
<tr>
<h2>CUSTOMERS</h2>
Bill id : ${bill.id }</br>
fname   :${bill.firstname }</br>
lname   :${bill.lastname }</br>
email   :${bill.email}</br>
mobile  : ${bill.mobile }</br>
product :${bill.product }</br>
amount  :${bill.amount }</br>
</tr>
</table>

</body>
</html>