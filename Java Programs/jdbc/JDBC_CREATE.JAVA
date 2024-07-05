import java.sql.*;
import java.util.Date;

public class JDBC_CREATE {


	public static void main(String[] args) {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		}catch (ClassNotFoundException e){
			e.printStackTrace();

		}
		Connection con;
		try {
			 // con=DriverManager.getConnection("jdbc:odbc:test","scott","tiger");
			
		con=DriverManager.getConnection("jdbc:odbc:db1");

			Statement stmt=con.createStatement();


			
			
			//String sql1 ="INSERT INTO stud_table(rollno,stud_name,add) VALUES(4002,'Kapil','Aurangabad')";

			String sql1 ="INSERT INTO stud_table(rollno,stud_name,add,phone) VALUES(4002,'Kapil','Aurangabad',984432)";

			int row=stmt.executeUpdate(sql1);
			con.commit();
			System.out.println("Total rows inserted "+row);

			row=stmt.executeUpdate("update stud_table set add='pune' where rollno=4001");
			con.commit();
			System.out.println("Total rows updated "+row);

		ResultSet rs;
		rs=stmt.executeQuery("select * from stud_table");
		ResultSetMetaData metaData=rs.getMetaData();
		int noc=metaData.getColumnCount();
		for(int i=1;i<=noc;i++)
		{	System.out.print(metaData.getColumnName(i)+ "  ");
		}

		while(rs.next())
		{

		for(int i=1;i<=noc;i++)
		{	System.out.print(rs.getObject(i)+ "  ");
		}
		System.out.println(" ");
		}
			
		}			catch(SQLException e){
				e.printStackTrace();
			}


		}
}
		
	

