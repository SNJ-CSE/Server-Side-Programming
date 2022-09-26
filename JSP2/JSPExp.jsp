<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 
     <head>

        <title>Scripting Demo page</title>

  </head>

  <body>

    <%-- declaration tag --%>

    <%! int i = 10; %>
     
    <%-- scriptlet tag --%>

    <% out.print("i = "+i); %>
    <br>   <br>

      <% out.print("for loop execution start..........."); %>
    <br>
    <% 
         for(int j=1;j<=10;j++)
         {
              out.print("j = "+j);
    %>
    <br>
    <% 
    }
    out.print("for loop execution complete...........");
    %>
    <br>   <br>
    <%-- expression tag --%>

    <%! int a = 10;
        int b = 20; 
    %>
    The addition of two variable : a + b = 10 + 20 = <%= a+b %>
    <br>  <br>
    Current time : <%= new java.util.Date() %>
  </body>
</html>
 
