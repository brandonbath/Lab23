<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>

<h1>Please fill in the form to register:</h1>
<form action="add-user" method="post"> 
First Name: <input type="text" name="first" required>
Last Name: <input type="text" name="last" required>
Email: <input type="text" name="email" required>
Phone Number: <input type="number" name="number" required>
Password: <input type="text" name="password" required>
<input class="btn-primary" type="submit" value="Submit">


	

</form>

</body>
</html>