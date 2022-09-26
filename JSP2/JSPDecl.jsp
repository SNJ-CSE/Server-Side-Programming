<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Declaration</title>
</head>
<body>


<%!
int n = 2;
int addn(int i) {
return i + n;
}

int sum(int a,int b)
{
	return a+b;
}
%>
<%= addn(5) %>

<%= addn(6) %>
Sum of number : <%=sum(6,7) %>

</body>
</html>