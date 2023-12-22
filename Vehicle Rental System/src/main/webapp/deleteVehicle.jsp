<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Payment</title>
<link rel="stylesheet" type="text/css" href="main.css">
<style type="text/css">
	body{
		
		font-family: montserrat;
		background: linear-gradient(120deg,#2980b9,#8e44ad);
		
	}
	.center{
		position: absolute;
		margin-top: 150px;
		transform: translate(-50%, -50%);
		width: 400px;
		background: white;
		border-radius: 10px;
		margin-left: 650px;
		margin-right: auto;
	}
	.center h1{
		text-align: center;
		padding: 0 0 20px 0;
		border-bottom: 1px solid silver;
	}
	.center form{
		padding: 0 50px 30px;
		box-sizing: border-box;
	}
	input[type="submit"]{
		width: 100%;
		height: 40px;
		border: 1px solid;
		background: #2691d9;
		border-radius: 25px; 
		font-size: 18px;
		color: #e9f4fb;
		font-weight: 700;
		cursor: pointer;
		outline: none;
		border-bottom: 50px;
		
	}
	form .crd{
		position: relative;
		border-bottom: 2px solid #adadad;
		margin: 30px 0;
		
	}
			img.ribbon1{
			float:right;
			 width:150px;
			margin-right:150px;
			margin-top:100px;
	}
		img.ribbon2{
			float:left;
			 width:300px;
			margin-left:50px;
			margin-top:50px;
	}
</style>
</head>
<body>
<jsp:include page="header.jsp" /><br><br><br><br>
<img src="img/dlt.gif" class="ribbon1"><br>
<img src="img/dlt2.gif" class="ribbon2"><br>
	<%
		String pid = request.getParameter("pid");
		String vehicleType = request.getParameter("vehicleType");
		String vehicleName = request.getParameter("vehicleName");
		String owner = request.getParameter("owner");
		String mobileNumber = request.getParameter("mobileNumber");
		String registrationNumber = request.getParameter("registrationNumber");
		String color = request.getParameter("color");
		String seats = request.getParameter("seats");
		String manufacturedYear = request.getParameter("manufacturedYear");
		String price = request.getParameter("price");
	%>
	
	<div class="center">
	<h1>Delete Vehicle</h1>
	
	<form action="deleteVehicle" method="post">
		<table>
		<tr>
			<td>Vehicle ID</td>
			<td><input type="text" name = "pid" value="<%= pid %>" readonly></td>
		</tr>
		<tr>
			<td>Vehicle Type</td>
			<td><input type="text" name = "vehicleType" value="<%= vehicleType %>" readonly></td>
		</tr>
		<tr>
			<td>Vehicle Name</td>
			<td><input type="text" name = "vehicleName" value="<%= vehicleName %>" readonly></td>
		</tr>
		<tr>
			<td>Owner Name</td>
			<td><input type="text" name = "owner" value="<%= owner %>" readonly></td>
		</tr>
		<tr>
			<td>Mobile Number</td>
			<td><input type="text" name = "mobileNumber" value="<%= mobileNumber %>" readonly></td>
		</tr>
		<tr>
			<td>Registration Number</td>
			<td><input type="text" name = "registrationNumber" value="<%= registrationNumber %>" readonly></td>
		</tr>
		<tr>
			<td>Vehicle Color</td>
			<td><input type="text" name = "color" value="<%= color %>" readonly></td>
		</tr>
		<tr>
			<td>Seats</td>
			<td><input type="text" name = "seats" value="<%= seats %>" readonly></td>
		</tr>
		<tr>
			<td>Manufactured Year</td>
			<td><input type="text" name = "manufacturedYear" value="<%= manufacturedYear %>" readonly></td>
		</tr>
		<tr>
			<td>Price</td>
			<td><input type="text" name = "price" value="<%= price %>" readonly></td>
		</tr>
		</table>
		<br>
		<input type="submit" name="submit" value="Delete Vehicle"><br>
	</form>
</div>	
</body>

<br><br><br><br><br><br><br><br><br><br><br><br><br>
<br><br><br><br><br><br><br>

<footer>
<jsp:include page="footer.jsp"/>
</footer>
</html>