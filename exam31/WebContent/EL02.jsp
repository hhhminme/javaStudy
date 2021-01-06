<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page isELIgnored = "true" %>
<%
request.setAttribute("k",10); 
request.setAttribute("m",true);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
K : ${k } <br>
k + 5 : ${k+5 } <br>
k - 5 : ${k-5 } <br>
k * 5 : ${k*5 } <br>
k / 5 : ${k div 5 } <br>

k > 5 : ${k > 5 }<br>
k < 5 : ${k < 5 }<br>
k >= 5 : ${k >= 5 }<br>
k <= 5 : ${k <= 5 }<br>
m : ${m }<br>
!m : ${!m}<br>
</body>
</html>