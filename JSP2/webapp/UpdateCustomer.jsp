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
<%
int id;
String name,address;
id=Integer.parseInt(request.getParameter("id"));
name=request.getParameter("name");
address=request.getParameter("address").trim().toString();
out.println("The id is : " + id + " Name : " + name + " Address : " + address);

Connection con;
try {
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud","root","jneccse");
	String sql="update CUSTOMER set name = ?, address = ? where id = ?";

	PreparedStatement stmt=con.prepareStatement(sql);

	stmt.setString(1,name);
	stmt.setString(2, address);
	stmt.setInt(3, id);
	
	stmt.executeUpdate();

	
}catch(SQLException e){
	e.printStackTrace();
	
}





%>
<a href="Index.jsp" >Home</a>
</body>
</html>