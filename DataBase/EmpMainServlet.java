
import java.io.*;
import java.sql.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


 public class EmpMainServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
	public EmpMainServlet() {
		super();
	}   	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<BODY BGCOLOR=\"#FDF4E6\">"+
				"<H3 ALIGN=\"CENTER\">Employee Servlet</h3><br>" 
								);
		Connection con=null;
		try{
			Class.forName("oracle.jdbc.OracleDriver");


		}catch(ClassNotFoundException e){
			e.printStackTrace();

		}
		try{
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle","scott","tiger");
		}catch(SQLException e){
			e.printStackTrace();
		}
			
			String ch=request.getParameter("display");
			String ch1=request.getParameter("submit");
			
			RequestDispatcher rd;
			if(ch.equalsIgnoreCase("display"))
			{
			rd=request.getRequestDispatcher("/Display");
			//rd.forward(request, response);
			rd.include(request,response);
			}
			else
			{
				out.println("You Have not Selected Display");
			}
			if(ch1.equalsIgnoreCase("submit"))
			{
			try
			{
			int no=Integer.parseInt(request.getParameter("eNo"));
			String nm =request.getParameter("name");
			String jb=request.getParameter("mjob");
			Statement stmt=con.createStatement();
			String sql="insert into myemp(empno,ename,job) values("+no+",'"+nm+"','"+jb+"')";
			int row=stmt.executeUpdate(sql);
			out.println(row+" Rows are inserted");
			}
			catch(SQLException e){
				
			}
			}
		
			
			
		
		
	}  	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
		
	}   
	
	
}