<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>Welcome User to home page</h1>
	<%
	String user = request.getParameter("username");
	out.println("<h2>Welcome "+user+" to Home Page.</h2>");
	out.println("<h3><a href='showUsers.view'>Find All Users</a></h3>");
	%>
</body>
</html>