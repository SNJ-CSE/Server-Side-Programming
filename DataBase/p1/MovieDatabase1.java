package p1;

import java.io.DataInputStream;
import java.io.IOException;
import java.sql.*;

 

public class MovieDatabase1 {

	/**
	 * @param args
	 */
	
	static String driver="com.mysql.jdbc.Driver";
	static String URL="jdbc:mysql://localhost/WIS" ;
	String title1,actor,actress,type,dateOfrel;
	Connection con;
	 Statement stmt;
	ResultSet rs;

	public void intialize() throws SQLException,ClassNotFoundException {
		 
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/WIS","root","jnecit2013");
			
	//		Class.forName(driver);
	//	Class.forName("com.mysql.jdbc.Driver").newInstance();
	//	con=DriverManager.getConnection(URL,userName,password);
		}catch(SQLException m){
			
		}
	}



	public void createTable() throws SQLException {
		stmt=con.createStatement();
		stmt.executeUpdate("CREATE TABLE CATALOG " +
				"(TITLE VARCHAR(50), "+
				"ACTOR VARCHAR(50), "+
				"ACTRESS VARCHAR(50),"+
				"MTYPE VARCHAR(20), " +
				"RELDATE DATE)");
		
	}


	public void insertRecord() throws SQLException,IOException {
		 DataInputStream d=new DataInputStream(System.in);
		stmt=con.createStatement();
		
		try {
			System.out.println("Movie Name ");
			title1=d.readLine();
			System.out.println("Actor of Movie ");
			actor=d.readLine();
			System.out.println("Actress of Movie ");
			actress=d.readLine();
			System.out.println("Type of movie ");
			type=d.readLine();

		String s1="INSERT INTO CATALOG" +
				  "(TITLE,ACTOR,ACTRESS,MTYPE) " +
				  "VALUES ('" +title1+
	                          "','"+actor+"','"+actress+"','"+type+"')";

			String s2="INSERT INTO CATALOG(TITLE) VALUES 	('sholay')";




			int r=stmt.executeUpdate(s1);
			stmt.close();
	System.out.println("Rows inserted "+r);
		
		


		

		}catch(IOException e){
			e.printStackTrace();

			}	


	}


	public void getMetaData() throws SQLException {
			System.out.println("Meta data of result set ");
			stmt=con.createStatement();
			String query="SELECT * FROM CATALOG";

			rs=stmt.executeQuery(query);
			ResultSetMetaData metaData=rs.getMetaData();
			int noColumn=metaData.getColumnCount();
			
			for(int i=1;i<noColumn +1; i++){
			System.out.println(metaData.getColumnName(i)+"   "+metaData.getColumnType(i));
	}


	}


	public void close() throws SQLException {

		
		try {

		con.close();
		


		

		}catch(SQLException e){
			throw e;

			}	


	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MovieDatabase1 movies=new MovieDatabase1();
		try{
			System.out.println("Creating Movie Table");
			
			movies.intialize();
			movies.createTable();


			movies.insertRecord();

			movies.getMetaData();
			movies.close();

		//String s3="INSERT INTO CATALOG(TITLE) VALUES('sholay')";
		//stmt.executeUpdate(s3);
		//	stmt.close();


		} catch(SQLException e) {
				while(e!=null){
				
				e.printStackTrace();
				e=e.getNextException();
				}
		}catch(Exception e1){
			e1.printStackTrace();
		}

		}

	}


