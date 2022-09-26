<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Array & Loops in JSP</title>
</head>
<body>

<TABLE>
<%
String[] names = {"Red", "Green", "Blue","White","Violet","Yellow","Pink"};
for (int i = 0; i < names.length; i++) {
%>
<tr><td>Name<%=i%>:</td>
<td><%=names[i]%></td></tr>
<%
}
%>
</TABLE>

</body>
</html>