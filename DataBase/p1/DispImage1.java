package p1;

import java.io.*;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispImage1
 */
@WebServlet("/DispImage1")
public class DispImage1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DispImage1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		Connection conn = null;
		String url = "jdbc:mysql://localhost/WIS";
		
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "jnecit2012";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,userName,password);
			System.out.println("Connected to the database");
			PreparedStatement ps=conn.prepareStatement("Select * from stud where rn=?");
			int no=Integer.parseInt(request.getParameter("rollNo"));
			ps.setInt(1,no);
			ResultSet rs=ps.executeQuery();
	

String imgSize="";
String s1="";
int rno=0;
if(rs.next()){
	imgSize=rs.getString(3);
	//rno=rs.getInt(1);
	//s1=rs.getString(2);
	//out.println("<html><h1>");
	//out.println("Image size/length "+imgSize.length());
	//out.println("<br>Roll Number  "+rno);
	//out.println("<br>Name  "+s1);
	response.resetBuffer();
	response.reset();
	
	
	

}
rs=ps.executeQuery();
if(rs.next())
{
	int len=imgSize.length();
	byte[] rb=new byte[len];
	InputStream readImg=rs.getBinaryStream(3);
	int index=readImg.read(rb, 0, len);	
	System.out.println("index"+index);
	int rn=rs.getInt(1);
	String nm=rs.getString(2);
	
	ps.close();
	
	response.reset();
	response.setContentType("image/jpeg");
	response.getOutputStream().write(rb,0,len);
	response.setContentType("text/html");
	PrintWriter out1=response.getWriter();
	out1.println("Name "+nm);
	//out1.println("<html><body><input type="text");
	//response.getOutputStream().print("Name "+nm);
	//response.getOutputStream().print("Roll Number"+rn);
	
	//response.getOutputStream().flush();
	
	
	conn.close();
	System.out.println("Disconnected from database");
}
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
