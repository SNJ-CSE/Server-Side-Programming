<jsp:useBean id="regform" class="p1.RegForm" scope="session"/>

<%@page errorPage="Registration.html" %>
<html>
<body bgcolor="cyan">
<pre>
<b>User Name :</b><jsp:getProperty name="regform" property="userName"/>
<b>Password :</b><jsp:getProperty name="regform" property="password"/>
<b>Email_Id :</b><jsp:getProperty name="regform" property="email"/>
<b>First Name :</b><jsp:getProperty name="regform" property="firstName"/>
<b>Last Name :</b><jsp:getProperty name="regform" property="lastName"/>
<b>Address :</b><jsp:getProperty name="regform" property="address"/>
</pre>
</body>
</html>
