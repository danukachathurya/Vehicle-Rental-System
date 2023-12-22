<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Payment</title>
<link rel="stylesheet" type="text/css" href="main.css">
	<style type="text/css">
		body{
		font-family: montserrat;
		background: linear-gradient(120deg,#2980b9,#8e44ad);
	}

	.center{
		position: absolute;
		margin-top: 300px;
		transform: translate(-50%, -50%);
		width: 400px;
		background: white;
		border-radius: 10px;
		margin-left: 650px;;
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
	
	form .crd{
		position: relative;
		border-bottom: 2px solid #adadad;
		margin: 30px 0;
	}
	
	.crd input {
		width: 100%;
		padding: 0 5px;
		height: 20px;
		font-size:16px;
		border: none;
		background: none;
		outline: none;
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
		img.ribbon1{
			float:right;
			 width:350px;
			 height:400px;
			margin-right:50px;
			margin-top:100px;
	}
		img.ribbon2{
			float:left;
			 width:400px;
			 height:430px;
			margin-right:50px;
			margin-top:100px;
	}
	</style>
</head>
<body>
<jsp:include page="header.jsp" /><br><br><br><br>
<img src="img/pay3.gif" class="ribbon1"><br>
<img src="img/pay7.gif" class="ribbon2"><br>
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
	<h1>Update Vehicle</h1>
	<form action="updateVehicle" method = "post">
		<div class="crd">
		Vehicle ID <input type="text" name = "pid" value="<%= pid %>" readonly>
		</div>
		<div class="crd">
		Vehicle Type <input type="text" name = "vehicleType" value="<%= pid %>">
		</div>
		<div class="crd">
		Vehicle Name <input type="text" name = "vehicleName" value="<%= vehicleName %>">
		</div>
		<div class="crd">
		Owner Name <input type="text" name = "owner" value="<%= owner %>">
		</div>
		<div class="crd">
		Mobile Number <input type="text" name = "mobileNumber" value="<%= mobileNumber %>">
		</div>
		<div class="crd">
		Registration Number <input type="text" name = "registrationNumber" value="<%= registrationNumber %>">
		</div>	
		<div class="crd">
		Vehicle Color <input type="text" name = "color" value="<%= color %>">
		</div>
		<div class="crd">
		Seats <input type="text" name = "seats" value="<%= seats %>">
		</div>
		<div class="crd">
		Manufactured Year <input type="text" name = "manufacturedYear" value="<%= manufacturedYear %>">
		</div>
		<div class="crd">
		Price <input type="text" name = "price" value="<%= price %>">
		</div>
		<input type="submit" name="submit" value="Update Vehicle"><br>
	</form>
	</div>
</body>

		<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
		
<footer>
<jsp:include page="footer.jsp"/>
</footer>
</html>