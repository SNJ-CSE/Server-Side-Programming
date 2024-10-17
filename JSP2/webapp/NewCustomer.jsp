<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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