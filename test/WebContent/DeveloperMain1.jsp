<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main page</title>
</head>
<body>
<h1>Developer Main</h1>
<%
String username=(String)request.getSession().getAttribute("name");
//String identity=(String)request.getSession().getAttribute("identity");
System.out.print(username);
%>
<h2>Welcome <%=username %></h2>
<a href = 'Developer'>view the developer and developer faults</a>
</body>
</html>