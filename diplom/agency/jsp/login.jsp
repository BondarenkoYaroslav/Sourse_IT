<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<div align="center" style="padding-top: 10px">
		<a href="registration"> Need to register? </a>
	</div>
	<div align="center">
		<h1>Login</h1>
	</div>

	<div align="center" style="padding-top: 10px">
		<form action="login" method="post">
			<p>
				<input type="text" placeholder="Your login" name="login" />
			</p>
			<p>
				<input type="password" placeholder="Your password" name="password" />
			</p>
			<p>
				<input type="submit" value="Send" />
			</p>
		</form>
	</div>
	<div align="center" style="padding-top: 10px">
		<form action="login" method="post">
			<p>
				<input type="hidden" name= "login"  value= "${sessionName}" />
			</p>
			<p>
				<input type="hidden" name= "password" value= "${passAccount} }" />
			</p>
			<p>
				<input type="submit" value="Try recovery session" />
			</p>
		</form>
	</div>
</body>
</html>