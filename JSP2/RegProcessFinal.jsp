
<%@page errorPage="Registration.html" %>
<jsp:useBean id="regform" class="p1.RegForm" scope="session"/>
<jsp:setProperty name="regform" property="firstName" param="first-name"/>
<jsp:setProperty name="regform" property="lastName" param="last-name"/>
<jsp:setProperty name="regform" property="address" />
<html>
<body bgcolor="pink">
<pre>
Your details are valid
<a href="ViewRegistrationDetails.jsp">CLICK</a>to view and confirm
</pre>
</body>
</html>

