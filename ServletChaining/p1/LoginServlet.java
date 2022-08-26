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
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		String connectionURL = "jdbc:mysql://localhost:3306/TEIT";

		//String connectionURL = "jdbc:mysql://192.168.10.59:3306/example";
		Connection con=null;
		try
		{
		String name=request.getParameter("txtName");
		String password=request.getParameter("password");
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		con = DriverManager.getConnection(connectionURL, "root", "jnecit2017");
		
		PreparedStatement stmt=con.prepareStatement
		("select name,password from users where name=? and password=?");
		stmt.setString(1,name);
		stmt.setString(2,password);
		ResultSet rset=stmt.executeQuery();
		if(rset.next())
		out.println("Welcome," +name);
		else
		{
		out.println("<b>Invalid username and password !</b><br>");

		RequestDispatcher rd=request.getRequestDispatcher("index.html");
		rd.include(request,response);

		con.close();

		}}
		catch(Exception e)
		{
		System.out.println(e);
		}
		}
	


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request,response);
	}

}
