<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Login</title>
	
<style>
		body {
		    font-family: Arial, sans-serif;
		    margin: 0;
		    padding: 0;
		    display: flex;
		    justify-content: center;
		    align-items: center;
		    height: 100vh;
		    background-color: #f4f4f4;
		}
		.login-container {
		    background-color: #fff;
		    border-radius: 8px;
		    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
		    padding: 20px;
		    width: 300px;
		    text-align: center;
		}
		h2 {
	    	color: #333;
		}
		
		form {
		    display: flex;
		    flex-direction: column;
		}
		label {
		    margin-bottom: 8px;
		}
		
		input {
		    padding: 8px;
		    margin-bottom: 16px;
		    border: 1px solid #ccc;
		    border-radius: 4px;
		}
		button {
		    background-color: #4caf50;
		    color: #fff;
		    padding: 10px;
		    border: none;
		    border-radius: 4px;
		    cursor: pointer;
		}
		
		button:hover {
		    background-color: #45a049;
		}
		
	</style>
	
</head>
<body>

	<div class="login-container">
        <h2>Login</h2>
        <form action="login" method="post" id="login-form">
            <label for="username">Username:</label>
            <input type="text" id="userName" name="userName" required>
            
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
            
            <button type="submit">Login</button>
        </form>
    </div>

</body>
</html>