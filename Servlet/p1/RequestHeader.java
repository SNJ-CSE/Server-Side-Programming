package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestHeader
 */
@WebServlet("/RequestHeader")
public class RequestHeader extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestHeader() {
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
		
		String userId=request.getParameter("username");
		out.println("Hello " +userId);
		String title="Request Header Information";
		out.println("<HTML>" +
		"<HEAD><TITLE>"+title+"</TITLE></HEAD>\n"+
		"<BODY BGCOLOR=\"#FDF5E6\">\n" +
		"<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" +
		"<B>Request Method: </B>" +
		request.getMethod() + "<BR>\n" +
		"<B>Request URI: </B>" +
		request.getRequestURI()+ "<BR>\n" +
		"<B>Request Protocol: </B>" +
		request.getProtocol() + "<BR><BR>\n" +
		"<TABLE BORDER=1 ALIGN=\"CENTER\">\n" +
		"<TR BGCOLOR=\"#FFAD00\">\n" +
		"<TH>Header Name<TH>Header Value");
		Enumeration<String> headerNames =request.getHeaderNames();
		while(headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();
			out.println("<TR><TD>" + headerName);
			out.println(" <TD>"+request.getHeader(headerName));
			}
			out.println("</TABLE>\n</BODY></HTML>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
