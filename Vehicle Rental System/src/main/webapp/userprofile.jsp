<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Profile</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        .profile-container {
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            border-radius: 10px;
            text-align: left;
            height: 280px;
            width: 340px;
        }

        .profile-item {
            margin-bottom: 15px;
        }

        .profile-item label {
            display: inline-block;
            font-weight: bold;
            margin-bottom: 30px;
            width: 130px;     
        }

        .profile-item span {
            display: inline-block;
            color: #333;
            margin-right: 20px; 
        }
    </style>
</head>
<body>

    <div class="profile-container">
        <c:forEach var="cus" items="${cusDetails}">
        
        <c:set var="id" value="${cus.id}"/>
		<c:set var="name" value="${cus.name}"/>
		<c:set var="email" value="${cus.email}"/>
		<c:set var="mobileNo" value="${cus.mobileNo}"/>
		<c:set var="userName" value="${cus.userName}"/>
		<c:set var="password" value="${cus.password}"/>
        
            <div class="profile-item">
                <label>ID :</label>
                <span>${cus.id}</span>
            </div>
            <div class="profile-item">
                <label>Name :</label>
                <span>${cus.name}</span>
            </div>
            <div class="profile-item">
                <label>Email :</label>
                <span>${cus.email}</span>
            </div>
            <div class="profile-item">
                <label>Mobile No :</label>
                <span>${cus.mobileNo}</span>
            </div>
            <div class="profile-item">
                <label>User Name :</label>
                <span>${cus.userName}</span>
            </div>
        </c:forEach>
    </div>
    
    <c:url value="updatecustomer.jsp" var="cusupdate">
		<c:param name="id" value="${id}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="mobileNo" value="${mobileNo}"/>
		<c:param name="userName" value="${userName}"/>
		<c:param name="password" value="${password}"/>
	</c:url>
	
	<a href="${cusupdate}">
	<input type="button" name="update" value="Update My Data">
	</a>
	
	<br>
	
	<c:url value="deleteProfile.jsp" var="cusdelete">
		<c:param name="id" value="${id}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="mobileNo" value="${mobileNo}"/>
		<c:param name="userName" value="${userName}"/>
		<c:param name="password" value="${password}"/>
	</c:url>
	
	<a href="${cusdelete}">
		<input type="button" name="delete" value="Delete Account">
	</a>
	

</body>
</html>
