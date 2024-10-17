package p3;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Servlet implementation class Link
 */
public class Link extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static private Hashtable<String, Integer> links = new Hashtable<String, Integer>();
	String stamp;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Link() {
        super();
        stamp=new Date().toString();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String lnk = request.getParameter("link");
		
		
		if(lnk != null && !lnk.equals(""))
		{
			synchronized (links)
			{
				Integer count = (Integer) links.get(lnk);
				
				if(count== null)
				{
					
					
					links.put(lnk, 1);
				}
				else
				{
					links.put(lnk, (1+count.intValue()));
				}
				
			}
			response.sendRedirect(lnk);
			
		}
		else
		{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			request.getSession();
			out.println("<html><head><title> Links Tracker servlet></title></head>");
			out.println("<body><p> Links tracked since "+ stamp +"</p>");
			if(links.size()!=0)
			{
				Enumeration<String> enm = links.keys();
				while (enm.hasMoreElements())
				{
					String key=(String) enm.nextElement();
					int count=((Integer) links.get(key)).intValue();
					out.println(key +"  :  "+ count + "visits <br>");
					
				}
				
			}
			else
			{
				out.println("No links have bee tracked<br>");
				
			}
			out.println("</body></html>");
			
			
			
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
