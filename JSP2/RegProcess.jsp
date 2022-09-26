
<%@page errorPage="Registration.html"%>
<html>
<body bgcolor="skyblue">
	<jsp:useBean id="regform" class="p1.RegForm" scope="session" />
	<jsp:setProperty name="regform" property="*" />
	<form action="RegProcessFinal.jsp">
		<pre>
			<b>
First Name:<input type="text" name="first-name" />
Last Name :<input type="text" name="last-name" />
Address :<input type="text" name="address" />
<input type="submit" value="Register" />
</b>
</pre>
	</form>
</body>
</html>