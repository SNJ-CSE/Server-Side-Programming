
package p2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

/**
 * Servlet implementation class LoginDatabase
 */
public class LoginDatabase extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginDatabase() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String user = request.getParameter("usrName");
		String password = request.getParameter("usrPassword");
		response.addHeader("Refresh", "1");
	    out.println(new Date().toString());
			
		try {
	//	    Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/STUD","root","jneccse");
			String sqlQuery = "select * from users where username = ? and password = ?";
			PreparedStatement ps = con.prepareStatement(sqlQuery);
			ps.setString(1, user);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			out.println("<html><body>");
			String imgSize="";
			String s1="";
			if(rs.next())
				{out.println("<h1><br>You are Valid User" +user+"</h1>");
				
				imgSize=rs.getString(3);
				response.resetBuffer();
				response.reset();
				int len=imgSize.length();
				byte[] rb=new byte[len];
				InputStream readImg=rs.getBinaryStream(3);
				int index=readImg.read(rb, 0, len);	
		//		System.out.println("index"+index);
			//	int rn=rs.getInt(1);
		//		String nm=rs.getString(2);
				response.reset();
				response.setContentType("image/jpeg");
				response.getOutputStream().write(rb,0,len);
				
				
	//			RequestDispatcher rd = request.getRequestDispatcher("RequestHeader");
	//			rd.include(request, response);
				}
			
			else
				{
				out.println("<h1>Check your username and password</h1>");
				RequestDispatcher rd = request.getRequestDispatcher("Login.html");
				rd.include(request, response);
				
				}
			
			
			out.close();
			con.close();
				
			}catch(Exception e) {
				out.println("Errorrrrr"+ e);
				}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
