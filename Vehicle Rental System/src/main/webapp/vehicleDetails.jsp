<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Details</title>
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
		padding:  50px 0 100px 0;
		margin-left: 650px;
		margin-right: auto;
	}
	.center h1{
		text-align: center;
		padding: 0 0 20px 0;
		border-bottom: 1px solid silver;
	}
	
	input[type="button"]{
		width: 75%;
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
		margin-left: 50px;
		margin-bottom: 10px;
		}
	table,td{
			width: 400px;
  			border: none;
			border-radius: 5px;
			font-size: 20px;
			padding-left: 30px;
			margin-bottom: 50px;
		}
		img.ribbon1{
			float:right;
			 width:400px;
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
<img src="img/pay1.gif" class="ribbon1"><br>
<img src="img/pay5.gif" class="ribbon2"><br>
	<div class="center">
	<h1>Vehicle Details</h1>
	<table>
	<c:forEach var="vehicle" items="${vehicleDetails}">
	
	<c:set var="id" value="${vehicle.id}"/>
	<c:set var="vehicleType" value="${vehicle.vehicleType}"/>
	<c:set var="vehicleName" value="${vehicle.vehicleName}"/>
	<c:set var="owner" value="${vehicle.owner}"/>
	<c:set var="mobileNumber" value="${vehicle.mobileNumber}"/>
	<c:set var="registrationNumber" value="${vehicle.registrationNumber}"/>	
	<c:set var="color" value="${vehicle.color}"/>
	<c:set var="seats" value="${vehicle.seats}"/>
	<c:set var="manufacturedYear" value="${vehicle.manufacturedYear}"/>
	<c:set var="price" value="${vehicle.price}"/>
	
	<tr>
		<td>Vehicle ID</td>
		<td>${pay.id}</td>
	</tr>
	<tr>
		<td>Vehicle Type</td>
		<td>${pay.vehicleType}</td>
	</tr>
	<tr>
		<td>Vehicle Name</td>
		<td>${pay.vehicleName}</td>
	</tr>
	<tr>
		<td>Owner Name</td>
		<td>${pay.owner}</td>
	</tr>
	<tr>
		<td>Mobile Number</td>
		<td>${pay.mobileNumber}</td>
	</tr>
	<tr>
		<td>Registration Number</td>
		<td>${pay.registrationNumber}</td>
	</tr>
	<tr>
		<td>Vehicle Color</td>
		<td>${pay.color}</td>
	</tr>
	<tr>
		<td>Seats</td>
		<td>${pay.seats}</td>
	</tr>
	<tr>
		<td>Manufactured Year</td>
		<td>${pay.manufacturedYear}</td>
	</tr>
	<tr>
		<td>Price</td>
		<td>${pay.price}</td>
	</tr>
	
	</c:forEach>
	</table>
	
	<c:url value="updateVehicle.jsp" var="vehicleupdate">
		<c:param name="id" value="${id}"/>
		<c:param name="vehicleType" value="${vehicleType}"/>
		<c:param name="vehicleName" value="${vehicleName}"/>
		<c:param name="owner" value="${owner}"/>
		<c:param name="mobileNumber" value="${mobileNumber}"/>
		<c:param name="registrationNumber" value="${registrationNumber}"/>
		<c:param name="color" value="${color}"/>
		<c:param name="seats" value="${seats}"/>
		<c:param name="manufacturedYear" value="${manufacturedYear}"/>
		<c:param name="price" value="${price}"/>
	</c:url>
	
	<a href="${vehicleupdate}">
	<input class="upt" type="button" name="update" value="Update Vehicle">
	</a>
	<br><br>
	<c:url value="deleteVehicle.jsp" var="vehicledelete">
		<c:param name="id" value="${id}"/>
		<c:param name="vehicleType" value="${vehicleType}"/>
		<c:param name="vehicleName" value="${vehicleName}"/>
		<c:param name="owner" value="${owner}"/>
		<c:param name="mobileNumber" value="${mobileNumber}"/>
		<c:param name="registrationNumber" value="${registrationNumber}"/>
		<c:param name="color" value="${color}"/>
		<c:param name="seats" value="${seats}"/>
		<c:param name="manufacturedYear" value="${manufacturedYear}"/>
		<c:param name="price" value="${price}"/>
	</c:url>
	<a href="${vehicledelete}">
	<input type="button" name="delete" value="Delete Vehicle">
	</a>
	</div>
</body>

<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<br><br><br><br><br><br><br><br><br><br><br><br><br>

<footer>
<jsp:include page="footer.jsp"/>
</footer>
</html>