<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Integer hitCount = (Integer)application.getAttribute("visitCount");
	if(hitCount == null || hitCount == 0){
		hitCount=1;
	}else
	{
		hitCount = hitCount+1;
	}
	application.setAttribute("visitCount", hitCount);
%>

Visitor Count = <%=hitCount %>
</body>
</html>