import java.sql.*;
public class JDBC_PS1 {
	public static void main(String[] args) {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				 // Class.forName("oracle.jdbc.OracleDriver");
			}catch (ClassNotFoundException e){
				e.printStackTrace();

			}
	Connection con;
		try{
			//con=DriverManager.getConnection("jdbc:odbc:test","scott","tiger");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle9i","scott","tiger");
		PreparedStatement stmt;
		if(args.length==0){
			System.out.println("Invalid Parameter");
			System.exit(0);
			}
		String sql= "Select * from emp where empno=?";
		stmt=con.prepareStatement(sql);
		
		stmt.setInt(1,new Integer(args[0]).intValue() );
		ResultSet rs=stmt.executeQuery();
		while(rs.next()){
			System.out.println(rs.getString("ename"));
		}
		
		String sql2="update emp set ename=? where empno=?";
		stmt=con.prepareStatement(sql2);
		stmt.setInt(2,new Integer(args[0]).intValue());
		stmt.setString(1,new String(args[1]));
		stmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
