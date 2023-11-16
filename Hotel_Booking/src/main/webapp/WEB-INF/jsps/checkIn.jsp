<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "a" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>hello welcome checkin</h1>
<form action="checkIn" method="post">
<table border="1">
<tr>
<th>Id</th>
<th>Age</th>
<th>Check In Date</th>
<th>Check Out Date</th>
<th>Guest Name</th>
<th>Room No</th>
<th>Phone No</th>
<th>Gender</th>
<th>Confirm</th>
</tr>
<a:forEach var="checkIn" items="${checkIn}">
<tr>
<td>${checkIn.id}</td>
<td>${checkIn.age}</td>
<td>${checkIn.checkInDate}</td>
<td>${checkIn.checkOutDate}</td>
<td>${checkIn.guestName}</td>
<td>${checkIn.roomId}</td>
<td>${checkIn.phone}</td>
<td>${checkIn.gender}</td>
<td><a href="confirmCheckIn?roomId=${checkIn.roomId}&guestName=${checkIn.guestName}
&checkInDate=${checkIn.checkInDate}&checkOutDate=${checkIn.checkOutDate}&phone=${checkIn.phone}&gender=${checkIn.gender}">Check In</a></td>
</tr>
</a:forEach>
</table>
</form>
</body>
</html>