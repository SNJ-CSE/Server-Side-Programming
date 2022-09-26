<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP : Dynamic Contents</title>
</head>
<body>

<p>Your virtual coin has landed on

<% if (Math.random() < 0.5) { %>


<h1> <i>heads. </i> </h1>

<% } else { %>

<h1><i>Tails</i></h1>

<% } %>
</p>

</body>
</html>