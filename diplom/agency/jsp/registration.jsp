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

	<div align="center">
		<form action="registration" method="post">
			<h6>Your Name</h6>
			<p>
				<input type="text" placeholder="Example: Boris" name="name" />
			</p>
			<h6>Your Surname</h6>
			<p>
				<input type="text" placeholder="Example: Britva" name="surname" />
			</p>
			<h6>Your Mail (cannot change in later)</h6>
			<p>
				<input type="text" placeholder="Example: Boris@i.ua"
					name="mail" />
			</p>
			<h6>You Phone Number</h6>
			<p>
				<input type="text" placeholder="Example: +38(095)12-34-567" name="number" />
			</p>
			<h6>Your Birthday (yyyy-mm-dd)</h6>
			<p>
				<input type="text" placeholder="Example: 1985-04-15"
					name="birthday" />
			</p>
			<h5>Your Password</h5>
			<p>
				<input type="password" placeholder="Example: 1Q4sa6Qtj9hs4"
					name="password" />
			</p>
			<h5>Repeat your password</h5>
			<p>
				<input type="password" placeholder="Example: 1Q4sa6Qtj9hs4"
					name="password2" />
			</p>
			<p>
				<input type="submit" value="Send" />
			</p>
		</form>
	</div>

</body>
</html>