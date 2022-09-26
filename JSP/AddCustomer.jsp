<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*"%>
<jsp:include page="Banner.jsp"></jsp:include>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Page</title>
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
try {
	Class.forName("com.mysql.jdbc.Driver");
	
}catch (ClassNotFoundException e){
	e.printStackTrace();	
}
Connection con;
try {
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/WIS","root","jnecit2013");
	String sql="insert into CUSTOMER values(?,?,?)";

	PreparedStatement stmt=con.prepareStatement(sql);

	stmt.setInt(1,new Integer( request.getParameter("id")).intValue());
	stmt.setString(2, request.getParameter("name"));
	stmt.setString(3, request.getParameter("address"));
	stmt.execute();

	
}catch(SQLException e){
	e.printStackTrace();
	
}





%>

</body>
</html>