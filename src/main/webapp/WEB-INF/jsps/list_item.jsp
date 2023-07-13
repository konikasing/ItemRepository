<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> All Item</title>
</head>
<body>
	<h2> List All Item..</h2>
		<table>
			<tr>
				<th> name</th>
				<th>category</th>
				<th>quantity</th>
				<th>ststus</th>
			</tr>
			
			<c:forEach var="Item" items="${item}" >
				<tr>
					<td>${item.Name}</td>
					<td>${item.catogory}</td>
					<td>${item.quantity}</td>
					<td>${item.status}</td>
					
					<td> <a href ="delete?id=${lead.id}" >delete </a></td>
					<td> <a href ="update?id=${lead.id}" >update </a></td>
					
				</tr>		
			</c:forEach>

		</table>
</body>
</html>