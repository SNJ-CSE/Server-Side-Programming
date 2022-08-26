package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		Connection con=null;

		String name=request.getParameter("txtName");
		String password=request.getParameter("password");
		try
		{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		con = DriverManager.getConnection(connectionURL, "root", "jnecit2017");

		//Class.forName("oracle.jdbc.driver.OracleDriver");
		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","gaurav");

		PreparedStatement stmt=con.prepareStatement("insert into users(name,password) values(?,?)");
		stmt.setString(1, name);
		stmt.setString(2, password);
		int i=stmt.executeUpdate();
		out.println("<b>You are successfully Registered at</b> <br>");
		out.println("<a href=\"UserList.html\">Print Register User List</a>");
		
		
		con.close();
		}
		catch(Exception e)
		{
		out.println("<b>Registration failed</b>");
		out.println("<b>Error:</b>" +e);
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
