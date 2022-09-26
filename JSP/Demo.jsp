<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import ="be1.Test" %>
<%! int numtimes=3;
  public String sayHello(String name)
  {
	  
	  return "Hello"+name+"!";
  }
  public int Area(int l,int b)
  {
	  return l*b;
  }
  
%>
<h1>declaration test page</h1>
<p> The value of numtimes is <%=numtimes %></p>
<p>Saying Hello to Reader : "<%= sayHello("reader") %>" .</p>
<p>Area : "<%= Area(10,20) %>"</p>

<% Test t =new Test();
t.abc();
%>
 

</body>
</html>