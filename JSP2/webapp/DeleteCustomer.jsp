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
h2>Delete Customer Record!!! </h2>
<hr/>
<form method="post" action="DelCustomer.jsp">
<%=request.getParameter("id") %>

<%

Connection con;
try {
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud","root","jneccse");
	Statement stmt=con.createStatement();
	String sql1="select * from customer where id= "+request.getParameter("id");
	ResultSet rs=stmt.executeQuery(sql1);
	while(rs.next()) {
		%>
		ID : <%=rs.getInt("id") %><br>
		Name : <%=rs.getString("name") %><br>
		Address: <%=rs.getString("address") %><br>
		<input type="hidden" name = "id" value="<%=rs.getInt("id") %>">
		<input type="Submit" name="submit" value="Delete"/>
		<a href="Customer.jsp" >Keep The Record</a>
	<%	
	}
	
}catch(SQLException e) {

}

%>


</form>
</body>
</html>