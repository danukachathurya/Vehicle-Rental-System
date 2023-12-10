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
	
	<form action="delete" method="post">
	<table>
		<tr>
			<td>Customer ID</td>
			<td><input type="text" name="cusid" value="<%= id %>" readonly></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><input type="text" name="name" value="<%= name %>" readonly></td>
		</tr>
		<tr>
		<td>Email</td>
		<td><input type="text" name="email" value="<%= email %>" readonly></td>
		</tr>
		<tr>
			<td>Phone number</td>
			<td><input type="text" name="mobileNo" value="<%= mobileNo %>" readonly></td>
		</tr>
		<tr>
			<td>User name</td>
			<td><input type="text" name="userName" value="<%= userName %>" readonly></td>
		</tr>		
	</table>
	
		<br>
		<input type="submit" name="submit" value="Delete My Data">
		
	</form>

</body>
</html>