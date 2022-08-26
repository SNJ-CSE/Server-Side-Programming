package bank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String accounttype=request.getParameter("accounttype");
		PrintWriter out=response.getWriter();
		out.println("<BODY BGCOLOR=\"#FDF4E6\">"+
		"<H3 ALIGN=\"CENTER\">Bank Servlet</h3><br>" +
		"<h4 ALIGN=\"CENTER\">XYZ Bank </h4><br>"+
		"<h5 ALIGN=\"CENTER\">Branch Mumbai </h5><br>"
		);
		RequestDispatcher rd;
		if(accounttype.equalsIgnoreCase("Current"))
		{
			rd=request.getRequestDispatcher("/Current");
			//rd.forward(request, response);
			rd.include(request,response);
		
		}
		else
		{rd=request.getRequestDispatcher("/Saving");
		rd.include(request, response);
		
			
		}
		out.println("Address: Lok Center <br> MGM Road<br>"+"CIDCO<br>Aurangabad");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}

}
