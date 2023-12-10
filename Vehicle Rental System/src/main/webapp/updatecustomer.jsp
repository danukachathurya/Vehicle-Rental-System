<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mobileNo = request.getParameter("mobileNo");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
	%>

	<form action="update" method="post">
	<table>
		<tr>
			<td>Customer ID</td>
			<td><input type="text" name="cusid" value="<%= id %>" readonly></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><input type="text" name="name" value="<%= name %>"></td>
		</tr>
		<tr>
		<td>Email</td>
		<td><input type="text" name="email" value="<%= email %>"></td>
		</tr>
		<tr>
			<td>Phone number</td>
			<td><input type="text" name="mobileNo" value="<%= mobileNo %>"></td>
		</tr>
		<tr>
			<td>User name</td>
			<td><input type="text" name="userName" value="<%= userName %>"></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="password" value="<%= password %>"></td>
		</tr>		
	</table>
	
		<br>
		<input type="submit" name="submit" value="Update My Data">
		
	</form>

</body>
</html>