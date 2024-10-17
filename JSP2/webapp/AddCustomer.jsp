<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2> Add Customer...........</h2>
<hr></hr>
<%
int id;
String name,address;
id=Integer.parseInt(request.getParameter("id"));
name=request.getParameter("name");
address=request.getParameter("address");
out.println("The id is : " + id + " Name : " + name + " Address : " + address);

Connection con;
try {
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud","root","jneccse");
	String sql="insert into CUSTOMER values(?,?,?)";

	PreparedStatement stmt=con.prepareStatement(sql);

	stmt.setInt(1,id);
	stmt.setString(2, name);
	stmt.setString(3, address);
	stmt.execute();

	
}catch(SQLException e){
	e.printStackTrace();
	
}





%>
</body>
</html>