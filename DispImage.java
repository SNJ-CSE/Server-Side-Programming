package p2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.*;

/**
 * Servlet implementation class DispImage
 */
@WebServlet("/DispImage")
public class DispImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DispImage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		System.out.println("MySQL Connect Example.");
		Connection conn = null;
		String url = "jdbc:mysql://localhost/WIS";
		
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "jnecit2013";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,userName,password);
			System.out.println("Connected to the database");
			Statement stmt=conn.createStatement();
	ResultSet rs=stmt.executeQuery("select photo from stud where rollNo=200101");
	

String imgSize="";

if(rs.next()){
	imgSize=rs.getString(1);
	System.out.println("Image size/length "+imgSize.length());

}
rs=stmt.executeQuery("select photo from stud where rollNo=200101");
if(rs.next())
{
	int len=imgSize.length();
	byte[] rb=new byte[len];
	InputStream readImg=rs.getBinaryStream(1);
	int index=readImg.read(rb, 0, len);	
	System.out.println("index"+index);
	stmt.close();
	
	response.reset();
	response.setContentType("image/jpeg");
	response.getOutputStream().write(rb,0,len);
	response.getOutputStream().flush();
	
}


				
conn.close();
			System.out.println("Disconnected from database");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
