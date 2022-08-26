package p2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Link
 */
@WebServlet("/Link")
public class Link extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static private Hashtable links = new Hashtable();
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
		String lnk = request.getParameter("link");
		if(lnk != null && !lnk.equals(""))
		{
			synchronized (links)
			{
				Integer count = (Integer) links.get(lnk);
				if(count== null)
				{
					links.put(lnk, new Integer(1));
				}
				else
				{
					links.put(lnk, new Integer(1+count.intValue()));
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
				Enumeration enm = links.keys();
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
		doGet(request,response);
		
	}

}
