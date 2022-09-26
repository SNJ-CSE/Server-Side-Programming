<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*" %>
<<jsp:include page="Banner.jsp"></jsp:include>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Page</title>
</head>
<body>
<h2>Edit Customer!!! </h2>
<hr/>
<form method="post" action="UpdateCustomer.jsp">
<%=request.getParameter("id") %>
<br>
<%
try {
	Class.forName("com.mysql.jdbc.Driver");
}catch(ClassNotFoundException e) {
	e.printStackTrace();
}
Connection con;
try {
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/WIS","root","jnecit2013");
	Statement stmt=con.createStatement();
	String sql1="select * from customer where id= "+request.getParameter("id");
	ResultSet rs=stmt.executeQuery(sql1);
	while(rs.next()) {
		%>
		ID : <input type="text" name="id" value="<%=rs.getInt("id") %>"/><br>
		Name : <input type="text" name="name" value="<%=rs.getString("name") %>"/><br>
		Address: <input type="text" name="address" value="<%=rs.getString("address") %>"/><br>
		<input type="Submit" name="submit" value="Update"/>
	<%	
	}
	
}catch(SQLException e) {

}

%>


</form>
</body>
</html>