<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1" cellpadding="5">
        <caption><h2>List of Users</h2></caption>
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
        </tr>
        <c:forEach var="user" items="${list}">
            <tr>
                <td><c:out value="${user.id}"/></td>
                <td><c:out value="${user.cid}"/></td>
                <td><c:out value="${user.startday}"/></td>
                <td><c:out value="${user.endday}"/></td>
                <td><c:out value="${user.wstudent}"/></td>
                <td><c:out value="${user.timelearn}"/></td>
                <td><c:out value="${user.status}"/></td>
                <td><c:out value="${user.userid}"/></td>
                <td>
                	<a href="/show-form-delete/${user.id}" >Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <a href="/show-form-add">add</a>
</body>
</html>