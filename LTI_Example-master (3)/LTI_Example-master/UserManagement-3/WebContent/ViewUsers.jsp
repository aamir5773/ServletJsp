<%@page import="java.util.List"%>
<%@page import="com.lti.model.Users"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Mobile Number</th>
			<th>Update?</th>
			<th>Delete?</th>
		</tr>
	<%
		List<Users> users =  (List<Users>)request.getAttribute("UsersList");
		for(Users user : users){
			out.println("<tr>");
			out.println("<td>"+user.getFirstname()+"</td>");
			out.println("<td>"+user.getLastname()+"</td>");
			out.println("<td>"+user.getMobilenumber()+"</td>");
			out.println("<td><a href=''>Update</a></td>");
			out.println("<td><a href='delete.do?username="+user.getUsername()+"'>Delete</a></td>");
			out.println("</tr>");
		}
	%>
	</table>
</body>
</html>