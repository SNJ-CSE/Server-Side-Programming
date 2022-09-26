<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Page</title>
</head>
<body>
<h2> Customer</h2>
<a href="NewCustomer.jsp">Add New</a>
<a href="EditCustomer.jsp">Edit Customer </a>
<hr />
<%
try {
	Class.forName("com.mysql.jdbc.Driver");
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	Connection con=null;
	try{
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/WIS","root","jnecit2013");
		Statement stmt=con.createStatement();
		String sql1="Select * from customer";
		ResultSet rs=stmt.executeQuery(sql1);
		int cnt=1;
		%>
<table border="1">
<th>S.No.</th>
<th>ID </th>
<th>Name </th>
<th>City </th>
<th colspan="2" align="center">Action</th>
<% while(rs.next()){
	int cid=rs.getInt("id");
	String cname=rs.getString("name");
	String caddress=rs.getString("address");
	out.println(cid+"     "+cname+"         "+caddress);
	%>
	<tr>
	<td><%=cnt %>
	<td><%=cid %></td>
	<td><%=cname%></td>
	<td><%=caddress%></td>
	<td><a href="EditCustomer.jsp?id=<%=cid%>">Edit</a></td>
	<td><a href="DeleteCustomer.jsp?id=<%=cid %>">Delete</a></td>
	</tr>
	<%cnt++;
	}
	%>

</table>
<%
	}catch(SQLException e){
		e.printStackTrace();
	}
	

%>

</body>
</html>