<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form id="regForm" modelAttribute="user" action="register" method="post">
		<table align="center">
			<tr>
				<td>
					Name :
				</td>
				<td>
					<form:input path="name" name="name"/>
				</td>
			</tr>
			<tr>
				<td>
					Email :
				</td>
				<td>
					<form:input path="email" name="email"/>
				</td>
			</tr>
			<tr>
				<td>
					Phone :
				</td>
				<td>
					<form:input path="phone" name="phone"/>
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="Register"/>
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>