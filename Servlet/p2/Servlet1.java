package p2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
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
		
		String param=request.getParameter("username");
		if(param != null && !param.equals(""))
		{
			request.setAttribute("username", param);
			RequestDispatcher rd=request.getRequestDispatcher("Servlet2");
			rd.forward(request, response);
			return;
			
		}
		
		out.println("<html><head><title> Servlet # 1 </title></head>");
		out.println("<h1> A form from Servlet #1 </h1>");
		out.println(" <form> Enter a value to send to servlet #2 ");
		out.println(" <input name=\"value\"><br>");
		
		out.println(" <input type=\"submit\"");
		out.println(" <value=\"send to servlet #2 \">");
		out.println("</form></body</html>");
		
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
