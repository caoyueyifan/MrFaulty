<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ page import="com.sherry.stores.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.sherry.servlets.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main page</title>
</head>
<body>
<h1>Reporter Main</h1>
<%
String username=(String)request.getSession().getAttribute("name");
//String identity=(String)request.getSession().getAttribute("identity");
System.out.print(username);
%>
<h2>Welcome <%=username %></h2>
<a href = 'Reporter'>View all the reporters and the reporting faults</a>

<%String idreporter=(String)request.getSession().getAttribute("name");
System.out.println(username);
%>
</body>
</html>