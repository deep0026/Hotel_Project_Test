<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Preview</h1>
<form>
<table border="1">
<tr><td>
Age:<c:out value="${Details.age}"/><br>
Check In Date:<c:out value="${Details.checkInDate}" /><br>
Check Out Date:<c:out value="${Details.checkOutDate}" /><br>
Guest Name:<c:out value="${Details.guestName}" /><br>
Room No:<c:out value="${Details.roomId}" /><br>
User Id:<c:out value="${Details.userId}" /><br>
Phone No:<c:out value="${Details.phone}" /><br>
Gender:<c:out value="${Details.gender}" /><br>
</td></tr>
</table>
<a href="confirmedRoom?age=${Details.age}&checkInDate=${Details.checkInDate}&checkOutDate=${Details.checkOutDate}
&guestName=${Details.guestName}&roomId=${Details.roomId}&userId=${Details.userId}&phone=${Details.phone}&gender=${Details.gender}">Confirm Booking</a>
</form>
</body>
</html>