<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<%
	String user = (String) session.getAttribute("username");
	if(user != null)
	{
		out.println("<h2>Welcome "+user+" to Home Page.</h2>");
		out.println("<h3><a href='showUsers.view'>Find All Users</a></h3>");
		out.println("<a href='logout.do'>Log Out</a>");
	}else{
		response.sendRedirect("LoginForm.html");
	}
	%>
</body>
</html>