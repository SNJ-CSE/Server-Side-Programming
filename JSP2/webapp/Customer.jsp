//Customer.jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*"  %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4> Customer</h4>
<a href="NewCustomer.jsp">Add New</a>
<a href="EditCustomer.jsp">Edit Customer </a>
<hr />
<%
	
	Connection con=null;
	try{
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud","root","jneccse");
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
//	out.println(cid+"     "+cname+"         "+caddress);
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