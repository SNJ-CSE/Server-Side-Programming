<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*"  %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Details</title>
</head>
<body>
<h4>Product Details</h4>
<h4>Select the Product</h4>
<%
	
	Connection con=null;
	try{
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud","root","jneccse");
		Statement stmt=con.createStatement();
		String sql1="Select * from product";
		ResultSet rs=stmt.executeQuery(sql1);
		int cnt=1;
		%>
		<table border="1">
<th>S.No.</th>
<th>Product ID </th>
<th>Product Name </th>
<th>Quantity </th>
<th colspan="2" align="center">Action</th>
<% while(rs.next()){
	int pid=rs.getInt("pid");
	String pname=rs.getString("prodName");
	String price=rs.getString("price");
//	out.println(cid+"     "+cname+"         "+caddress);
	%>
	<tr>
	<td><%=cnt %>
	<td><%=pid %></td>
	<td><%=pname%></td>
	<td><%=price%></td>
	<td><a href="Description.jsp?id=<%=pid%>">Description</a></td>
	<td><a href="Purchase.jsp?id=<%=pid %>">Purchase</a></td>
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