package bank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Current
 */
@WebServlet("/Current")
public class Current extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int count;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Current() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
    	count=0;
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		count++;
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String accounttype=request.getParameter("accounttype");
		out.println("<h3 align=\"center\"> Current Servelet</h3><br>"+
				"<h4 align=\"center\">"+accounttype+"</h4><br><br>");
		out.println("<br>visitor Number "+count+"<br>");
		out.println("</body></html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}

}
