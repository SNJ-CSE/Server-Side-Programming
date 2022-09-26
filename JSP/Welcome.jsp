<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> A JSP that processes "get" requests with data</title>
</head>
<body>
<% // begin scriptlet
         String name = request.getParameter( "firstName" );
         if ( name != null ) 
         {
      %> <%-- end scriptlet to insert fixed template data --%>            
<h1>
               Hello <%= name %>, <br />
               Welcome to JavaServer Pages Technology!
            </h1>

      <% // continue scriptlet

         } // end if
         else {

      %> <%-- end scriptlet to insert fixed template data --%>

            <form action = "Welcome.jsp" method = "get">
               <p>Type your first name and press Submit</p>
      
               <p><input type = "text" name = "firstName" />
                  <input type = "submit" value = "Submit" />
               </p>
            </form>

      <% // continue scriptlet
          } // end else
      %> <%-- end scriptlet --%>


</body>
</html>