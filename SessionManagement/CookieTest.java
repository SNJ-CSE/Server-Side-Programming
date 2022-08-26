package p2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;

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
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	for(int i=0; i<3; i++) {
		Cookie cookie = new Cookie("Session-Cookie-" + i,"Cookie-Value-S" + i);
			// No maxAge (ie maxAge = -1)
		response.addCookie(cookie);
		cookie = new Cookie("Persistent-Cookie-" + i,"Cookie-Value-P" + i);
			cookie.setMaxAge(3600);
			response.addCookie(cookie);
			}
	String title="Differentiating Session Cookies from Persistent Cookies";
	out.println("<html><head><title>"+ title +"</title></head>"+
			"<body BGCOLOR=\"#FDF5E6\">"+
			"<H1 ALIGN=CENTER>"+title+"</h1>" +
			"<TABLE BORDER=1 ALIGN=CENTER>" +
			"<TRROW BGCOLOR=\"FFAD00\">"+
			"<TH> Cookie Name <TH> Cookie Value");
	Cookie[] cookies = request.getCookies();
	if (cookies == null) {
		out.println("<TR><TH COLSPAN=2>No cookies");
	} else {
	for(Cookie cookie: cookies) {
		out.println	("<TR>\n" + " <TD>" + cookie.getName() + "\n" +
	                  " <TD>" + cookie.getValue());
	         }
	       }
	out.println("</TABLE></BODY></HTML>");
		
		
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
