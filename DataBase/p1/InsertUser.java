package p1;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertUser
 */
@WebServlet("/InsertUser")
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
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		
		String usr=request.getParameter("txtName");
		String pass=request.getParameter("password");
		String pass1=request.getParameter("password1");
		if (!(pass.equals(pass1))){
			out.println("<html><b>Invalid  password !</b><br></html>");
			RequestDispatcher rd=request.getRequestDispatcher("Register.html");
			rd.include(request,response);
		}
		else
		{
			Connection conn = null;
			String url = "jdbc:mysql://localhost/WIS";
			
			String driver = "com.mysql.jdbc.Driver";
			String userName = "root"; 
			String password = "jnecit2013";
			
			try {
				Class.forName(driver);
				conn = DriverManager.getConnection(url,userName,password);
				System.out.println("Connected to the database");
				PreparedStatement ps=conn.prepareStatement("insert into infologin values(?,?)");
					
			    

				
				 //File file=new File("D:/apache-tomcat/apache-tomcat-7.0.16/webapps/images/200102.jpg");
				 
				
				ps.setString(1,usr);
				ps.setString(2,pass);
								 
				int i = ps.executeUpdate();
				if(i!=0){
					out.println("Record inserted successfully");
				}
				else{
					out.println("problem in Record insertion");
				}
				
				conn.close();
				
			}
			catch (Exception e){
				System.out.println(e);
			}
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
