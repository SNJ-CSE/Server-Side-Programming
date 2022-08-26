package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class UserList
 */
@WebServlet("/UserList")
public class UserList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("application/vnd.ms-excel");
		PrintWriter out=response.getWriter();
		String connectionURL = "jdbc:mysql://localhost:3306/TEIT";
		
		Connection con=null;
		try
		{
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		con = DriverManager.getConnection(connectionURL, "root", "jnecit2017");
		
	Statement stmt=con.createStatement();
		
		
		ResultSet rset=stmt.executeQuery("select name from users");
		while (rset.next())
		{
			out.println(rset.getString(1));
		}
			
			
		

		con.close();

		}
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
	}

}
