<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ page import="com.sherry.stores.*" %>
<%@ page import="com.sherry.servlets.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
<h1>Edit Fault</h1>
<form name="input" action="EditfaultServlet" method="post">
FaultID: <input type="text" name= "idfault"><br><p>
Summary: <input type="text" name="summary"><br><p>
Details: <input type="text" name="details"><br><p>
Severity: <select name="severity"><option>Low</option><option>Intermediate</option><option>High</option></select><p>
ReporterID: <input type="text" name="idreporter"><br><p>
DeveloperID: <input type="text" name="iddeveloper"><br><p>
AdminID: <input type="text" name="idadmin"><br><p>
<input type="submit" name="submit" value = "submit">
</form>
</body>
</html>