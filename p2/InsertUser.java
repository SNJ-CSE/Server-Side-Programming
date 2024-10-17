package p2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class InsertUser
 */
public class InsertUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertUser() {
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
		String name = request.getParameter("usrName");
		String pwd = request.getParameter("usrPassword");
		String pwd1 = request.getParameter("usrPassword1");
		String fileName = request.getParameter("fname"); 
		
	File file=new File("C:\\ssp\\test.jpg");
	//	File file=new File(fileName);
		FileInputStream fs = new FileInputStream(file);
		out.println("<html><body>");
		Connection con;
		try {
		if(!pwd.equals(pwd1))
		{
			out.println("<h1>Re type the password correctly</h1>");
		}
		else
		{
			out.println("<h1>Password match</h1>");
			String query = "select * from users where username=?";
			PreparedStatement ps;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/STUD","root","jneccse");
			ps = con.prepareStatement(query);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{		
				out.println("<h2>User Exists : Check your Password</h2>");
			}else
			{
				String sqlQuery = "insert into users values(?,?,?)";
				ps = con.prepareStatement(sqlQuery);
				ps.setString(1, name);
				ps.setString(2, pwd);
				ps.setBinaryStream(3, fs,fs.available());
				int nor = ps.executeUpdate();
				out.println("<h2> New user Added successfully</h2>");
				
			}
			
			
						
			
		}
			
				
		
			
		}catch(Exception e) {
			out.println("Errorrrr   "+e );
			e.printStackTrace();
			
			}
		finally {
			out.close();
		//	con.close();
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
