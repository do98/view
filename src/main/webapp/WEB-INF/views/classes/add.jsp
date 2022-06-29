<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/add" method="post">
		<ol>
			<li>ID</li>
			<input type="text" name="id" />
			<li>CId</li>
			<input type="text" name="cid" />
			<li>Start day</li>
			<input type="date" name="startday" />
			<li>End day</li>
			<input type="date" name="endday" />
			<li>Where learn</li>
			<input type="text" name="wstudent" />
			<li>Time learn</li>
			<input type="text" name="timelearn" />
			<li>Status</li>
			<input type="text" name="status" />
			<li>UserId</li>
			<input type="text" name="userid" />
		</ol>
		<button>Submit</button>
	</form>
</body>
</html>