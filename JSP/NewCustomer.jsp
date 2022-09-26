<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add a New Customer ! ! ! ! !</h2>
        <form method="post" action="AddCustomer.jsp">
   <table>
    <tr>
       <td>
          Id:
       </td>
       <td>
         <input type="text" name="id" value=""/>
       </td>
    </tr>
    <tr>
       <td>
          Name:
       </td>
       <td>
         <input type="text" name="name" value=""/>
       </td>
    </tr>
    <tr>
       <td>
          Address
       </td>
       <td>
         <input type="text" name="address" value=""/>
       </td>
    </tr>
    
    <tr>
       <td colspan="2">
         <input type="submit" name="submit" value="Add Customer"/>
       </td>
    </tr>
</table>
</form>

    </body>
</html>