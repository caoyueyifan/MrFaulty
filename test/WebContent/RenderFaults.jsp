<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ page import="com.sherry.stores.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.sherry.servlets.*" %>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Faults List</title>
</head>
<body>
<center>
<h1>Faults</h1>
<table border="1">
			<tr>
			<td>Fault ID</td>
			<td>Fault Summary</td>
			<td>Fault Detail</td>
			<td>Fault Severity</td>
			<td>Fault Reporterid</td>
			<td>Fault Developerid</td>
			<td>Fault Adminid</td>
			<td>Action</td>
			</tr>
<%
System.out.println("In render");
List<FaultsStores> lFaults = (List<FaultsStores>)request.getAttribute("Faults");
if (lFaults==null){
 %>
	<p>No faults found</p>
	<% 
}else{
%>




<% 
Iterator<FaultsStores> iterator;




iterator = lFaults.iterator();     
while (iterator.hasNext()){
	FaultsStores md = (FaultsStores)iterator.next();


	%>
	<tr>
	<td> <%=md.getIdfault() %></td>
	<td><%=md.getSummary() %></td>
	<td><%=md.getDetails() %></td> 
	<td><%=md.getSeverity() %></td>
	<td><%=md.getIdreporter() %></td>
	<td><%=md.getIddeveloper() %></td>
	<td><%=md.getIdadmin() %></td>
	<td><a href = 'EditFault.jsp'>Edit</a>|<a href = "http://localhost:8080/test/DeleteFault/<%=md.getIdfault()%>">Delete</a></td>
	</tr>
	<%


}
}
%>
</table>
<p><a href='AddFault.jsp'>Add</a></p>
<a href="http://localhost:8080/test/AdminMain.jsp">Back</a><br>
<a href="http://localhost:8080/test/Welcome.jsp">Welcome page</a><br><br>
<form name="input" action="LogoutServlet" method="post">
<input type="submit" name="submit" value = "Log out">
</form>
</center>
</body>
</html>

