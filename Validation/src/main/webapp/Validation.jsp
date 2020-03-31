<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Validation</title>

<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>

	<h1>
		<b>Enter the user information</b>
	</h1>

	<hr />

	<form:form action="insertion" modelAttribute="student" method="get">

		<table>

			<tr>
				<th>Name</th>
				<td><form:input path="name" /> <form:errors path="name"
						cssClass="error" /></td>
			</tr>

			<tr>
				<th>Email</th>
				<td><form:input path="email" /> <form:errors path="email"
						cssClass="error" /></td>
			</tr>
			<tr>
				<th>Gender</th>
				<td><form:radiobutton path="gender" value="Male" label="Male" />
					<form:radiobutton path="gender" value="Female" label="Female" /> <form:errors
						path="gender" cssClass="error" /></td>
			</tr>

			<tr>
				<th>Languages</th>
				<td><form:select path="languages" multiple="true">

						<form:option value="US English">US English</form:option>
						<form:option value="UK English">UK English</form:option>
						<form:option value="Spanish">Spanish</form:option>
						<form:option value="Hindi">Hindi</form:option>

					</form:select> <form:errors path="languages" cssClass="error" /></td>
			</tr>

			<tr>
				<td><button type="submit">Submit</button></td>
			</tr>



		</table>


	</form:form>


</body>
</html>