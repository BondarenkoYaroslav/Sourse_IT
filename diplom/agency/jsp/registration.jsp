<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>

	<div align="center">
		<h1>Registration</h1>
	</div>

	<div align="center" style="padding-top: 20px">
		<form action="registration" method="post">
			<p>
				<input type="text" placeholder="Your Name" name="name" />
			</p>
			<p>
				<input type="text" placeholder="Your Surname" name="surname" />
			</p>
			<p>
				<input type="text" placeholder="Your Mail (can't change)" name="mail" />
			</p>
			<p>
				<input type="text" placeholder="Your Phone Number" name="number" />
			</p>
			<p>
				<input type="text" placeholder="Your Birthday(yyyy-mm-dd)" name="birthday" />
			</p>
			<p>
				<input type="password" placeholder="Create password account" name="password" />
			</p>
			<p>
				<input type="password" placeholder="Repeat password account" name="password2" />
			</p>
			<p>
				<input type="submit" value="Send" />
			</p>
		</form>
	</div>

</body>
</html>