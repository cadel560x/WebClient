<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Cars</title>
	</head>
	<body>
		<h1>Cars</h1>
		<table border="1">
			<tr>
				<th>Brand</th><th>Model</th><th>Color</th><th>Purchase Date</th>
			</tr>
			<c:forEach items="${cars}" var="car">
				<tr>
					<td>${car.brand}</td><td>${car.model}</td><td>${car.color}</td><td>${car.purchaseDate}</td>
				</tr>
			</c:forEach>
		</table>
		<a href="/">Home</a>
	</body>
</html>