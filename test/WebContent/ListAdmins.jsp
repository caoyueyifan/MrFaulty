<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ page import="com.sherry.stores.*" %>
<%@ page import="com.sherry.servlets.*" %>
<%@ page import="com.sherry.models.*" %>
<%@ page import="java.util.*" %>


    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>User List</title>
</head>
<body>
<h1>Admin</h1>
<table border="1">
			<tr>
			<td>Admin Name</td>
			<td>Action</td>
			</tr>
<%
System.out.println("In render");
List<UserStores> lUser = (List<UserStores>)request.getAttribute("User");
if (lUser==null){
 %>
	<p>No User found</p>
	<% 
}else{
%>

<% 
Iterator<UserStores> iterator;

iterator = lUser.iterator();     
while (iterator.hasNext()){
	UserStores md = (UserStores)iterator.next();
	%>
	
	<tr>
	<td> <a href="http://localhost:8080/test/Admin/<%=md.getUserid() %>" ><%=md.getName() %></a></td>
	<td><a href = "http://localhost:8080/test/AdminDelete/<%=md.getUserid()%>">Delete</a></td>
	</tr>
	 <%
}
}
%>
</table>
<h2>Create new Admin</h2>
<form name="input" action="AdduserServlets" method="post">
Name: <input type="text" name="name"><br><p>
Email: <input type="text" name="email"><br><p>
Password: <input type="password" name="password"><br><p>
Identity:<select name="identity"><option>Admin</option></select><p>
<input type="submit" name="submit" value = "submit">
</form>
<a href="http://localhost:8080/test/Welcome.jsp">Back</a>
</body>
</html>

