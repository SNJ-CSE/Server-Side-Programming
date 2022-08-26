package p1;

import java.io.*;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertImage1
 */
@WebServlet("/InsertImage1")
public class InsertImage1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertImage1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int roll=Integer.parseInt(request.getParameter("rollNo"));
		String name=request.getParameter("studName");
		String fname=request.getParameter("fileName");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><h1> Your Information are</h1> ");
		out.println("Name :" +name);
		out.println("Roll Number " + roll);
		out.println("File Path  "+ fname);
		Connection conn = null;
		String url = "jdbc:mysql://localhost/WIS";
		
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "jnecit2012";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,userName,password);
			System.out.println("Connected to the database");
			PreparedStatement ps=conn.prepareStatement("insert into stud values(?,?,?)");
				
		    

			
			 //File file=new File("D:/apache-tomcat/apache-tomcat-7.0.16/webapps/images/200102.jpg");
			File file=new File("C:\\images\\"+fname);
			FileInputStream fs = new FileInputStream(file);
			ps.setInt(1,roll);
			ps.setString(2,name);
			ps.setBinaryStream(3,fs,fs.available());
			int i = ps.executeUpdate();
			if(i!=0){
				out.println("image inserted successfully");
			}
			else{
				out.println("problem in image insertion");
			}
			
			conn.close();
			
		}
		catch (Exception e){
			System.out.println(e);
		}
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
