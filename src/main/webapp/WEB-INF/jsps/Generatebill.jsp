<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file ="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create lead</title>
</head>
<body>
<h2> Lead| Create</h2>

<form action="Generatebills" method="post">
<pre>
firstname<input type="text" name="firstname" value="${contact.firstname }"/>
lastname<input type="text"  name="lastname" value="${contact.lastname }"/>
Email<input type="text"  name="email" value="${contact.email}"/>
Mobile<input type="text" name="mobile"value="${contact.mobile }"/>
Product<input type="text"  name="product"/>
Amount<input type="text" name="amount"/>
<input type="submit" name="GenerateBill"/>
</pre>
</form>
</body>
</html>