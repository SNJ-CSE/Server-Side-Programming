<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="Banner.jsp" %>
<html>
<head>
<meta charset="UTF-8">
<title>Index file</title>

 <style>
        .bottom-message {
            position: fixed;
            bottom: 0;
            width: 100%;
            text-align: center;
            background-color: #f1f1f1;
            padding: 10px;
            box-shadow: 0 -2px 5px rgba(0,0,0,0.1);
        }
    </style>
</head>
<body>
<a href="Customer.jsp" >Customer</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="Product.jsp"> Product</a> &nbsp;&nbsp;&nbsp;&nbsp;
<a href="Tax.jsp">Tax</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="Invoice.jsp">Invoice</a>
<br><br><hr>
<div class="bottom-message">
<%@ include file= "HitCount.jsp" %>
</div>
</body>
</html>