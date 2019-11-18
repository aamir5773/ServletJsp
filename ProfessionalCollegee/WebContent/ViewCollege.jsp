<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List"%>
<%@page import="com.lti.model.College"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3><a href='Registercollege.jsp'>Register College</a> | <a href='index.jsp'>Home</a></h3>
	<table>
		<tr>
			<th>College Id</th>
			<th>College Name</th>
			<th>Course Type</th>
			<th>City</th>
			<th>Fees</th>
			<th>Pincode</th>	
			<th>Delete?</th>
		</tr>
		<c:forEach var="college" items="${ requestScope.CollegesList }">
			<c:url var="deleteUrl" value="delete.do">
				<c:param name="cid" value="${ college.cid }"></c:param>
			</c:url>
			
			<tr>
				<td> <c:out value="${ college.cid }"></c:out> </td>
				<td> <c:out value="${ college.cname }"></c:out> </td>
				<td> <c:out value="${ college.ctype }"></c:out> </td>
				<td> <c:out value="${ college.city }"></c:out> </td>
				<td> <c:out value="${ college.fees }"></c:out> </td>
				<td> <c:out value="${ college.pin }"></c:out> </td>
				<td><a href='<c:out value="${ deleteUrl }"></c:out>'>Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>