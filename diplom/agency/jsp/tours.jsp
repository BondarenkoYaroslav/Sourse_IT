<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Viewing tours</title>
</head>
<body>

	<div align="center" style="padding-top: 10px">
		<form action="tours" method="post">
			<p>
				<input type="text" placeholder="Set id tour" name="idTour" />
			</p>
			<p>
				<input type="submit" value="Find out the tour data" />
			</p>
		</form>
	</div>

	<p>Tour information: ${ingormationTour}</p>

</body>
</html>