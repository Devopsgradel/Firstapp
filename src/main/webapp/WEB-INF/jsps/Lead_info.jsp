<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ include file ="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Info</title>
</head>
<body>

<h2> Lead| information</h2>

lead id: ${lead.id }<br/>
firstName: ${lead.firstname}<br/>
lastName: ${lead.lastname}<br/>
source: ${lead.source}<br/>
email: ${lead.email}<br/>
mobile: ${lead.mobile}<br/>
<form action="convertdata" method="post">
<input type="hidden" name="id" value="${lead.id }"/>
<input type="submit" value="convert"/>
</form>

</body>
</html>