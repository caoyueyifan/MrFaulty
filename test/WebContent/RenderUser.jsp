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
<center>
<h1>User</h1>
<table border="1">
			<tr>
			<td>User ID</td>
			<td>User Name</td>
			<td>Email</td>
			<td>Password</td>
			<td>Identity</td>
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
	<td> <%=md.getUserid() %></td>
	<td><%=md.getName() %></td>
	<td><%=md.getEmail() %></td> 
	<td><%=md.getPassword() %></td>
	<td><%=md.getIdentity()%></td>
	<td><a href = 'EditUser.jsp'>Edit</a>|<a href = "http://localhost:8080/test/DeleteUser/<%=md.getUserid()%>">Delete</a></td>
	</tr>
	 <%
}
}
%>
</table>
<a href='AddUser.jsp'>Add</a><br>
<a href="http://localhost:8080/test/AdminMain.jsp">Back</a><br>
<a href="http://localhost:8080/test/Welcome.jsp">Welcome page</a><br>
<form name="input" action="LogoutServlet" method="post">
<input type="submit" name="submit" value = "Logout">
</form>
</center>
</body>
</html>

