package cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VisitorCount
 */
@WebServlet("/VisitorCount")
public class VisitorCount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VisitorCount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String countString =
				CookieUtilities.getCookieValue(request,	"accessCount","1");
				int count = 1;
				try {
				count = Integer.parseInt(countString);
				} catch(NumberFormatException nfe) { }
				LongLivedCookie c = new LongLivedCookie("accessCount",String.valueOf(count+1));
				response.addCookie(c);
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				String title = "Access Count Servlet";
				String docType =
				"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " + "Transitional//EN\">\n";
				out.println(docType +
						"<HTML>\n" +
						"<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
						"<BODY BGCOLOR=\"#FDF5E6\">\n" +
						"<CENTER>\n" +
						"<H1>" + title + "</H1>\n" +
						"<H2>This is visit number " +
						count + " by this browser.</H2>\n" +
						"</CENTER></BODY></HTML>");
						}
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
