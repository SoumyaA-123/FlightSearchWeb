
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<a href = "logout">Logout</a>
	<!--new table   -->
	<table class="table table-hover table-dark">
		<thead>
			<tr>
				<th scope="col">Flight No.</th>
				<th scope="col">Departure Location</th>
				<th scope="col">ARRIVAL LOCATION</th>
				<th scope="col">VALID TILL</th>
				<th scope="col">Flight Time</th>
				<th scope="col">FLIGHT DURATION</th>
				<th scope="col">FARE</th>
				<th scope="col">SEAT AVAILABILITY</th>
				<th scope="col">Flight Class</th>

			</tr>
		</thead>
		<tbody>
			
			<c:forEach items="${availableFlights}" var="flight">
				
				<tr>

					<td>${flight.getFlightNo()}</td>
					<td>${flight.getDepartureLoc()}</td>
					<td>${flight.getArrivalLoc()}</td>
					<td>${flight.getDate()}</td>
					<td>${flight.getTime()}</td>
					<td>${flight.getDuration()}</td>
					<td>${flight.getFare()}</td>
					<td>${flight.getSeatAvailability()}</td>
					<td>${flight.getFlightClass()}</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
	<c:if test="${availableFlights.size() == 0}">
		<h2>No flights available!</h2>
	</c:if>


</body>
</html>
