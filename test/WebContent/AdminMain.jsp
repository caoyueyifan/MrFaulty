<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main page</title>
</head>
<body>
<h1>Main page</h1>
<%
String username=(String)request.getSession().getAttribute("name");
//String identity=(String)request.getSession().getAttribute("identity");
System.out.print(username);
%>
<h2>Welcome <%=username %></h2>
<h3><a href='ListuserServlets'>user</a></h3>
<h3><a href="http://localhost:8080/test/faults">faults</a></h3>
</body>
</html>