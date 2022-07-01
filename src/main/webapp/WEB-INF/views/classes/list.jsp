<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css"/></link>

</head>
<body>
<%@ include file="header.jsp" %>
	<h2>List of Users</h2>
	<a href="/show-form-add" style="text-decoration: none;">ADD</a>
	<table border="1" style="width: auto; border-collapse: collapse;">

		<tr>
			<th>ID</th>
			<th>CID</th>
			<th>Start day</th>
			<th>End day</th>
			<th>Where</th>
			<th>Time learn</th>
			<th>Status</th>
			<th>UserID</th>
			<th>Delete</th>
			<th>Update</th>

		</tr>

		<c:forEach var="user" items="${list}">
			<tr>
				<td><c:out value="${user.id}" /></td>
				<td><c:out value="${user.cid}" /></td>
				<td><fmt:formatDate pattern="yyyy-MM-dd"
						value="${user.startday}" /></td>
				<td><fmt:formatDate pattern="yyyy-MM-dd" value="${user.endday}" /></td>
				<td><c:out value="${user.wstudent}" /></td>
				<td><c:out value="${user.timelearn}" /></td>
				<td><c:out value="${user.status}" /></td>
				<td><c:out value="${user.userid}" /></td>
				<td><a href="/show-form-delete/${user.id}">Delete</a></td>
				<td><a href="/show-form-update/${user.id}">Update</a></td>
				
			</tr>
		</c:forEach>
	</table>

</body>
</html>