package cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RepeatVisitor2
 */
@WebServlet("/RepeatVisitor2")
public class RepeatVisitor2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RepeatVisitor2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		boolean newbie = true;
		String value =
		CookieUtilities.getCookieValue(request, "repeatVisitor2",
		"no");
		if (value.equals("yes")) {
		newbie = false;
		}
		String title;
		if (newbie) {
		LongLivedCookie returnVisitorCookie =
		new LongLivedCookie("repeatVisitor2", "yes");
		response.addCookie(returnVisitorCookie);
		title = "Welcome Aboard";
		} else {
		title = "Welcome Back";
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String docType =
		"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
		"Transitional//EN\">\n";
		out.println(docType +
		"<HTML>\n" +
		"<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
		"<BODY BGCOLOR=\"#FDF5E6\">\n" +
		"<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" +
		"</BODY></HTML>");
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
