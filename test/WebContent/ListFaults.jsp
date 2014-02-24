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
<h1>Faults</h1>
<table border="1">
			<tr>
			<td>Fault Summary</td>
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
	<td> <a href="http://localhost:8080/test/Faults/<%=md.getIdfault() %>" ><%=md.getSummary() %></a></td>
	<td><a href = 'EditFault.jsp'>Edit</a>|
	<a href = "http://localhost:8080/test/FaultDelete/<%=md.getIdfault()%>">Delete</a></td>
	</tr>
	<%


}
}
%>
</table>

<h2>Add Fault</h2>
<form name="input" action="FaultAdd" method="post">
Summary: <input type="text" name="summary"><br><p>
Details: <input type="text" name="details"><br><p>
Severity: <select name="severity"><option>Low</option><option>Intermediate</option><option>High</option></select><p>
Reporterid:<input type="text" name="idreporter"><br><p>
Developerid:<input type="text" name="iddeveloper"><br><p>
Adminid:<input type="text" name="idadmin"><br><p>
<input type="submit" name="submit" value = "submit">
</form>

<a href="http://localhost:8080/test/Welcome.jsp">Back</a>
</body>
</html>

