<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/update" method="post">
		<ol>
			<!-- <li>ID</li> -->
			<input type="hidden" name="id" value="<c:out value='${classes.id}' />" />
			<li>CId</li>
			<input type="text" name="cid" value="<c:out value='${classes.cid}' />" />
			<li>Start day</li>
			<input type="date" name="startday" value="<fmt:formatDate value='${classes.startday}' pattern='yyyy-MM-dd' />" />
			<li>End day</li>
			<input type="date" name="endday" value="<fmt:formatDate value='${classes.endday}' pattern='yyyy-MM-dd' />" />
			<li>Where learn</li>
			<input type="text" name="wstudent" value="<c:out value='${classes.wstudent}' />" />
			<li>Time learn</li>
			<input type="text" name="timelearn" value="<c:out value='${classes.timelearn}'/>" />
			<li>Status</li>
			<input type="text" name="status" value="<c:out value='${classes.status}' />" />
			<li>UserId</li>
			<input type="text" name="userid" value="<c:out value='${classes.userid}' />" />
		</ol>
		<button>Submit</button>
	</form>
</body>
</html>