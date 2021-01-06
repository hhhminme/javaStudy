<%@page import = "java.util.ArrayList"%>
<%@page import = "java.util.List" %>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<%
	List<String> list = new ArrayList<>();
	list.add("hello");
	list.add("world");
	list.add("!!!");
	
	request.setAttribute("list",list);
%>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:forEach items = "${list }" var = "item" begin = "1">
	${item } <br>
</c:forEach>
</body>
</html>