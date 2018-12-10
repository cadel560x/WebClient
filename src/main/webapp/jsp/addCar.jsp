<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Car</title>
</head>
<body>
	<h1>Create car</h1>
	<form:form modelAttribute="car">
		<table>
			<tr>
				<td>Enter the car Id:</td>
				<td><form:input path="id"></form:input></td>
			</tr>
			<tr>
				<td>Enter the brand:</td>
				<td><form:input path="brand"></form:input></td>
			</tr>
			<tr>
				<td>Enter the model:</td>
				<td><form:input path="model"></form:input></td>
			</tr>
			<tr>
				<td>Enter the purchase date (yyyy-MM-dd):</td>
				<%-- <td><form:input path="purchaseDate"></form:input></td> --%>
				<td><fmt:formatDate var="fmtDate" value="${car.purchaseDate}" pattern="yyyy-MM-dd"/><form:input path="purchaseDate" value="${fmtDate}"></form:input></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Create car" /></td>
			</tr>
		</table>
	</form:form>
	
	<br>
	<a href="/cars">List cars</a>
</body>
</html>