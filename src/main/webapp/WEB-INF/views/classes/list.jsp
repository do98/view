<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css" /></link>

</head>
<body>
	
	<%@ include file="header.jsp"%>
	

<div class="nav">
		<div class="menu">
			<ul>
				<li><a href="#">Trang Chủ</a></li>
				<li><a href="#">Khóa Học</a></li>
				<li><a href="#">Danh Sách Giáo Viên</a></li>
				<li><a href="#">Danh Sách Học Sinh</a></li>
				<li><a href="#">Đào Tạo</a></li>
				<li><a href="/show-form-add" style="text-decoration: none;">+</a></li>

			</ul>
		</div>
		<div class="search">
			<input type="search" placeholder="Search...">
			<button><i class="fa-solid fa-magnifying-glass"></i></button>
		</div>
	</div>
	<h2>Danh sách các lớp học</h2>
	
	<table border="1">

		<tr style="background: #28abd033;">
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
				<td><a href="/show-form-delete/${user.id}"><img
						alt="delete" src="image/delete.jpg"></a></td>
				<td><a href="/show-form-update/${user.id}"><img alt="edit"
						src="image/edit.jpg"></a></td>

			</tr>
		</c:forEach>
	</table>
<%@ include file="footer.jsp"%>
</body>
</html>