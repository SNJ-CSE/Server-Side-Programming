package p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Servlet implementation class StudentMarkSheet
 */
public class StudentMarkSheet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentMarkSheet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String title="Student Result Sheet";
		out.println("<html><head><title>"+ title +"</title></head>"+
				"<body BGCOLOR=\"#FDF5E7\">"+
				"<H1 ALIGN=CENTER>"+title+"</h1>" +
				"<TABLE BORDER=1 ALIGN=CENTER>" +
				"<TRROW BGCOLOR=\"FFAD00\">"+
				"<TH> Parameter Name <TH> Parameter Value");
		Enumeration<String> paramNames=request.getParameterNames();
		while(paramNames.hasMoreElements())
		{
			String paramName=(String)paramNames.nextElement();
			out.print("<tr><td>"+paramName+"\n<td>");
			String paramValues[]=request.getParameterValues(paramName);
			if(paramValues.length==1)
			{String paramValue=paramValues[0];
				if(paramValue.length()==0)
					out.println("<I> No Values </I>");
				else
					out.println(paramValue);
							
			}else {
				out.println("<UL>");
				for(int i=0;i<paramValues.length;i++)
				{
					out.println("<LI>"+paramValues[i]);
					
				}
				out.println("</UL>");
				
			}
		}
		
		out.println("</TABLE>");
		out.print("<hr>");
	
		//String m1=(String)request.getAttribute("marks1");
		String m1=request.getParameter("marks1");
		String m2=request.getParameter("marks2");
		String m3=request.getParameter("marks3");

		int mrk1=Integer.parseInt(m1);
		int mrk2=Integer.parseInt(m2);
		int mrk3=Integer.parseInt(m3);
			if(mrk1>=40 && mrk2 >=40 && mrk3>=40)
		{
			int tot=mrk1+mrk2+mrk3;
			out.println("<center><h1> Result : Pass</h1></center>");
			out.println("<center><h1> Total Marks  " +tot+" </h1></center>");
		}
		
				
				
		out.println("</BODY></HTML>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
