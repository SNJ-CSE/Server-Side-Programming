import java.sql.*;
import java.util.Date;

public class JDBC_Where {


	public static void main(String[] args) {
		try {
		//	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Class.forName("oracle.jdbc.OracleDriver");
		}catch (ClassNotFoundException e){
			e.printStackTrace();

		}
		Connection con;
	//	int a=Integer.parseInt(args[0]);
		try {
			//con=DriverManager.getConnection("jdbc:odbc:test","scott","tiger");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle9i","scott","tiger");
			Statement stmt=con.createStatement();
			String sql1="insert into emp(empno,ename,job) values (110,'Anil','Lect')";
			stmt.executeUpdate(sql1);	
			String sqlup="update emp set ename='Kapil' where empno=105";
			stmt.executeUpdate(sqlup);
			String del="delete from emp where empno=105";
			stmt.executeUpdate(del);
			 String sql2 ="Select * from emp";
			ResultSet rs=stmt.executeQuery(sql2);
	
			
			
			//rs.deleteRow();
			int cnt=1;
			while(rs.next()){
				int empno=rs.getInt("empno");
				String ename=rs.getString("ename");
				String job=rs.getString("job");
				int mgr=rs.getInt("mgr");
				
				Date hdate=rs.getDate("hiredate");
				double sal=rs.getDouble("sal");
				
				double comm=rs.getDouble("comm");
				int dno=rs.getInt("deptno");
				System.out.print(cnt+ " "+empno+" "+ename+" "+job+" "+mgr+" "+hdate);
				System.out.println(" " +sal+" "+comm+ " "+dno);
				cnt++;
			}
		}
			catch(SQLException e){
				e.printStackTrace();
			}


		}
}
		
	

