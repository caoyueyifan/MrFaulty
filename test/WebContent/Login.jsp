<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log in</title>
</head>
<body>
<center>
<h1>Log in</h1>
<form name = "input" action="Login" method="post">
Username:<input type="text" name="name"/><br><p>
Password:<input type="password" name="password"/><br><p>
Identity:<select name="identity"><option>Admin</option><option>Reporter</option><option>Developer</option></select><p>
<input type="submit" name="submit" value="Log in">
<a href='Register.jsp'>Sign in</a>
</form>
</center>
</body>
</html>