<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>send to custom</title>
	
	<style type="text/css">
	.btn {
		width: 425px;
		height: 35px;
		border-color: #5555FF;
		border-style: solid;
		background-color: #5555FF;
		font-family: 'Lucida Sans Unicode', 'Lucida Grande', sans-serif;
	}
	
	.btn:hover {
		background-color: #2222FF;
		border-color: #2222FF;
	}
	</style>
</head>
<body>

	<form action="customServlet" method="post">
		<textarea rows="10" cols="50" name="mensagem" placeholder="Informe o xml" style="display:block;"></textarea>
		<input type="submit" class="btn" value="ENVIAR XML" />
	</form>

</body>
</html>