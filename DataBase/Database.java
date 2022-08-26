package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Database
 */
@WebServlet("/Database")
public class Database extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Database() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try
		{
		String user1=request.getParameter("txtName");
		String password1=request.getParameter("txtPassword");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/WIS","root","jnecit2012");

		PreparedStatement stmt=con.prepareStatement("select * from infologin where name=? and password=?");
		stmt.setString(1,user1);
		stmt.setString(2,password1);
		ResultSet rset=stmt.executeQuery();
		if(rset.next())
		out.println("Welcome," +user1);
		else
		{
			
			
		out.println("<b>Invalid username and password !</b><br>");
		RequestDispatcher rd=request.getRequestDispatcher("index.html");
		rd.include(request,response);
	}
		out.close();con.close();
		}
		catch(Exception e)
		
		{
		//	out.println("Invalid user" );
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
