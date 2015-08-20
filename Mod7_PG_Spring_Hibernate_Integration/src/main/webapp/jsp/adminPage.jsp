<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>List of teams</h1>
	<p>Here you can see the list of the teams, edit them, remove or
		update.</p>
		
	<c:foreach var="enrollRequest" items="${enrollRequest}">
	</c:foreach>
	<form:form>
		<table
			style="padding: 100px; background-image: url('images/imRages.jpg')">
			<tr>
				<td colspan="2" align="right" style="padding-right: 100px"><font
					size="20" color="white"> Form Details </font></td>
			</tr>
			<tr>
				<td><font color="white">FirstName :</font></td>
				<!--LINE 2  -->
				<td>${enrollRequest.firstname}</td>
			</tr>
			<tr>
				<td><font color="white">LastName :</font></td>
				<td>${enrollRequest.lastname}</td>
			</tr>
			<tr>
				<td><font color="white">income :</font></td>
				<td>${enrollRequest.income}</td>
			</tr>
			<tr>
				<td><font color="white">city :</font></td>
				<td>${enrollRequest.city}</td>
			</tr>
			<tr>
				<td><font color="white">state :</font></td>
				<td>${enrollRequest.state}</td>
			</tr>
			<tr>
				<td><font color="white">country :</font></td>
				<td>${enrollRequest.country}</td>
			</tr>
			<tr>
				<td><font color="white">Occupation :</font></td>
				<td>${enrollRequest.custOccupation}</td>
			</tr>
			<tr>
				<td><font color="white">Email :</font></td>
				<td>${enrollRequest.custEmail}</td>
			</tr>
			<tr>
				<td colspan="2" align="right" style="padding-right: 100px"><input
					type="image" src="images/submit.png" alt="submit!" id="submit"
					name="submit"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>