package session;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieTest
 */
@WebServlet("/CookieTest")
public class CookieTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieTest() {
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
		boolean newb = true;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
		for(Cookie c: cookies) {
		if ((c.getName().equals("repeatVisitor")) && (c.getValue().equals("yes"))) 
		{
		    newb = false;
		   break;
		}
		}
	}
		
		String title;
		if (newb) {
		Cookie returnVisitorCookie = new Cookie("repeatVisitor", "yes");
		returnVisitorCookie.setMaxAge(60*60*24*365);
		response.addCookie(returnVisitorCookie);
		title = "Welcome to Cookie World for first time";
		} else {
		title = "Welcome Back : You are existing user";
		}
		out.println("<HTML>" +
				"<HEAD><TITLE>"+title+"</TITLE></HEAD>\n"+
				"<BODY BGCOLOR=\"#FDF5E6\">\n" +
				"<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" +
				"</HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
