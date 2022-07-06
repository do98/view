<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/delete.css" /></link>
</head>
<body>
	<div class="del">
		<form action="/delete" method="post">
			<input type="hidden" name="id"
				value="<c:out value='${classes.id}' />">
			<p>
				Do you want to delete
				<c:out value="${classes.wstudent}" />
				?
			</p>
			<button>Submit</button>
			<a href="/list">Cancel</a>
		</form>
	</div>
</body>
</html>