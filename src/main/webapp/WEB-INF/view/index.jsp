<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>予定表</title>
	</head> 
	<body>
		今後の予定<br>
		<c:forEach var="obj" items="${list}" varStatus="status">
		<c:out value="${obj.getDate()}"/><br>
		<c:out value="${obj.getTodo()}"></c:out><br>
		</c:forEach>
		
		<form action="update" method="post">
		<input type="submit" value="登録">
		</form><br>
		
		<form action="delete" method="post">
		<input type="submit" value="削除">
		</form>
	</body>
</html>
