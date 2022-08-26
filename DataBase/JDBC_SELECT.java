import java.sql.*;
import java.util.Date;

public class JDBC_SELECT {


	public static void main(String[] args) {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		}catch (ClassNotFoundException e){
			e.printStackTrace();

		}
		Connection con;
		try {
			 // con=DriverManager.getConnection("jdbc:odbc:stud");
			
		con=DriverManager.getConnection("jdbc:odbc:STUD");

			Statement stmt=con.createStatement();
			
			
			String sql1 ="Select * from student";

			ResultSet rs=stmt.executeQuery(sql1);
			int cnt=1;
			while(rs.next()){
				int roll=rs.getInt("rollno");
				String name=rs.getString("name");
				String city=rs.getString("city");
				
				
				//Date bdate=rs.getDate("dob");

								
				//int phoneNumber=rs.getInt("phoneno");
System.out.println(cnt+ " "+roll+" "+name+" "+city+" ");
				
				cnt++;
			}
		}
			catch(SQLException e){
				e.printStackTrace();
			}


		}
}
		
	

