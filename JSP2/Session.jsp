<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
// determine the winner
String winner;
if (Math.random() < 0.50)
            winner = "heads";
else
             winner = "tails";
synchronized (session) {
 
  if (session.isNew()) {
               session.setAttribute("heads", new Integer(0));
               session.setAttribute("tails", new Integer(0));
  }
 
  String s1=session.getAttribute(winner).toString();
  
int oldValue =Integer.parseInt(s1);
//((Integer) session.getAttribute(winner)).intValue();
session.setAttribute(winner, new Integer(oldValue + 1));
}
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sessions in JSP</title>
</head>
<body>

<h1>Current standings:</h1>
<table border="1">
<tr>
<th>Heads</th>
<th>Tails</th>
</tr>
<tr>
<td><%= session.getAttribute("heads") %></td>
<td><%= session.getAttribute("tails") %></td>
</tr>
</table>

</body>
</html>