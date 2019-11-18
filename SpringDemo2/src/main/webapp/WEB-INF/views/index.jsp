<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My First Spring Demo</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sketchy/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-N8DsABZCqc1XWbg/bAlIDk7AS/yNzT5fcKzg/TwfmTuUqZhGquVmpb5VvfmLcMzp"
	crossorigin="anonymous">
	<link href="Style.css" rel="stylesheet">
</head>

<body>
	<div class="container">

		<h1>Hello World!</h1>

		<h2>${test}</h2>

		${5+10}

<h1>${personTest}</h1>

<form action="add-person" method="post"> 
First Name: <input type="text" name="first" required>
Last Name: <input type="text" name="last" required>
Age: <input type="number" name="age" required>
<input class="btn-primary" type="submit" value="Submit">

</form>

<hr>
<h1>This example is using variables</h1>
<form action="add-person2" onsubmit="return myValidator()">
First Name: <input id="f" type="text" name="first">
Last Name: <input id="l" type="text" name="last">
Age: <input type="number" name="age">
<input class="btn-primary" type="submit" value="Submit">

</form>

<hr>
<h1>This example is using object</h1>
<form action="add-person3">

First Name: <input type="text" name="first">
Last Name: <input type="text" name="last">
Age: <input type="number" name="age">
<input class="btn-primary" type="submit" value="Submit">

</form>
	
	</div>
	
	
	<script>
	function myValidator() {
	var f = document.getElementById("f").value;
	var l = document.getElementById("l").value;
	
	
	
	
	if (f.length<3){
		alert("Too short");
		return false;
	} else if (l.length<3){
		alert("Too short");
		return false;
	} }
	
	</script>
</body>
</html>