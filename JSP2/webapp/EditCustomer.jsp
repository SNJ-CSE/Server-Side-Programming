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

<h2>Edit Customer!!! </h2>
<hr/>
<form method="post" action="UpdateCustomer.jsp">
<%=request.getParameter("id") %>
<br>
<%

Connection con;
try {
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud","root","jneccse");
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