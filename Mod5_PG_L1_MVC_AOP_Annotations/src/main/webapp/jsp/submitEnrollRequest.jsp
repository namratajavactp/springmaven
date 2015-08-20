<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="./css/loginBackground.css" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ROW Intial Enroll</title>
</head>
<body background="images/background1.jpg">
	<div id="whole" align="center">

		<div align="center"
			style="background-image: url('images/img02.jpg'); background-position: center; height: 100px; font-style: +12;">
			<b><font size="90" color="white">Reach Out world</font> </b>
		</div>
		<div align="center">
			 <!-- LINE 1 --> 
			<form:form commandName="enrollRequest" method="POST" name="login">
				<table
					style="padding: 100px; background-image: url('images/images.jpg')">
					<tr>
						<td colspan="2" align="right" style="padding-right: 100px"><font
							size="20" color="white"> Intial Registration Form </font></td>
					</tr>
					<tr>
						<td><font color="white">FirstName :</font></td>
						<!--LINE 2  -->
						<td><form:input path="firstname" id="textbox" /></td>
					</tr>
					<tr>
						<td><font color="white">LastName :</font></td>
						<td><form:input path="lastname" id="textbox" /></td>
					</tr>
					<tr>
						<td><font color="white">income :</font></td>
						<td><form:input path="income" id="textbox" /></td>
					</tr>
					<tr>
						<td colspan="2" align="right" style="padding-right: 100px"><input
							type="image" src="images/submit.png" alt="submit!" id="submit"
							name="submit"></td>
					</tr>
				</table>

			</form:form>
		</div>
	</div>
</body>






</html>



