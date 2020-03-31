<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>


	<h1>User Success</h1>
	<hr />

	${student }
	<table>
		<tr>
			<th>Name</th>
			<td>${student.name}</td>
		</tr>
		<tr>
			<th>Email</th>
			<td>${student.email}</td>
		</tr>
		<tr>
			<th>Gender</th>
			<td>${student.gender}</td>
		</tr>
		<tr>
			<th>Languages</th>
			<td>${student.languages}</td>
		</tr>

	</table>


</body>
</html>