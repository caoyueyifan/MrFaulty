<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ page import="com.sherry.stores.*" %>
<%@ page import="com.sherry.servlets.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update</title>
</head>
<body>
<center>
<h1>Update</h1>
<form name="input" action="EdituserServlet" method="post">
Userid:<input type="text" name="userid"><br><p>
Name: <input type="text" name="name"><br><p>
Email: <input type="text" name="email"><br><p>
Password: <input type="text" name="password"><br><p>
Identity <input type="text" name="identity"><br><p>
<input type="submit" name="submit" value = "UPDATE">
</form>
</center>
</body>
</html>