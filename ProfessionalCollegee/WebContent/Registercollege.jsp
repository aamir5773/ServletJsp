<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register College</title>
<script src="js/Registerform.js"></script>
</head>
<body>

	<form action="register.do" id="frm" method="post">
		<table>
			<tr>
				<td>College Id</td>
				<td><input type="number" name="cid" id="cid"></td>
			</tr>
			<tr>
				<td>College Name</td>
				<td><input type="text" name="cname" id="cname"></td>
			</tr>
			<tr>
				<td>Course Type</td>
				<td><input type="text" name="ctype" id="ctype"></td>
			</tr>
			<tr>
				<td>City</td>
				<td><input type="text" name="city" id="city"></td>
			</tr>
			<tr>
				<td>Fees</td>
				<td><input type="number" name="fees" id="fees"></td>
			</tr>
			<tr>
				<td>Pincode</td>
				<td><input type="number" name="pin" id="pin"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="button" value="Save college" onclick="validateCollege();"></td>
			</tr>
		</table>
	</form>



</body>
</html>