<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Number Table</title>
</head>
<body>

<table border="1">

<% for (int row = 1; row < 11; row++) { %>
<tr>

<% for (int column = 1; column < 11; column++) { %>

<td><%= row * column %></td>

<% } %>

</tr>

<% } %>

</table>

</body>
</html>