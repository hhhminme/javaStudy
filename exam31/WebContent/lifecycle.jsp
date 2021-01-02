<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
hello~
<%
	System.out.println("javaService()");
%>

<%!
	public void jspInit(){
	System.out.println("javaInit()");
	}
	public void jspdestory(){
	System.out.println("javaDestroy()");
	}
%>
</body>
</html>