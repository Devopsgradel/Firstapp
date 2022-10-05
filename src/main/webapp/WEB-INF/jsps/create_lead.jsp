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

<form action="please_save" method="post">
<pre>
firstname<input type="text" name="firstname"/>
lastname<input type="text"  name="lastname"/>
Source
<select name="source" >
  <option value="newspapper">newspapper</option>
  <option value="radio">radio</option>
  <option value="tv">tv</option>
  <option value="online">online</option>
</select>
Email<input type="text"  name="email"/>
Mobile<input type="text" name="mobile"/>
<input type="submit" name="save"/>
</pre>
</form>
</body>
</html>