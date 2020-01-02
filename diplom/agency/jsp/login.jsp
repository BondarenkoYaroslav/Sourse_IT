<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

	<div align="center">
		<h1>Login</h1>
	</div>

	<div align="center" style="padding-top: 20px">
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

</body>
</html>