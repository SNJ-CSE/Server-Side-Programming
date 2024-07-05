import java.sql.*;  
class MysqlCon{  
public static void main(String args[]){  
try{  
		Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/db","root","pratik1291");  
 
	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from student1");  
	while(rs.next())  
	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString	(3) + " " + rs.getInt(4)+" " + rs.getString(5));  
	con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  