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

id=Integer.parseInt(request.getParameter("id"));
Connection con;
try {
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud","root","jneccse");
	String sql="delete from CUSTOMER where id = ?";

	PreparedStatement stmt=con.prepareStatement(sql);

	stmt.setInt(1,id);
	
	
	stmt.executeUpdate();

	
}catch(SQLException e){
	e.printStackTrace();
	
}





%>
<a href="Index.jsp" >Home</a>
</body>
</html>