<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Bookings</title>
	</head>
	<body>
		<h1>Bookings</h1>
		<table border="1">
			<tr>
				<th>Number</th><th>Date</th><th>Customer</th><th>Cars</th>
			</tr>
			<c:forEach items="${bookings}" var="booking">
				<tr>
					<td>${booking.number}</td><td>${booking.date}</td><td>${booking.customer.firstName} ${booking.customer.lastName}</td>
					<td>
						<ul>
							<c:forEach items="${booking.car}" var="car">
								<li>${car.brand}</li>
							</c:forEach>
						</ul>
					</td>
				</tr>
			</c:forEach>
		</table>
		<a href="/">Home</a>
	</body>
</html>