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
		
		<f:form modelAttribute="dataDelete" action="indexdel" method="post">
		<tr>
			<td><c:out value="${obj.getDate()}"/></td>
			<td><c:out value="${obj.getTodo()}"></c:out></td>
			<td><c:out value="${obj.getPriority()}"></c:out></td>
			<input type="hidden" name="id" value="${obj.getId()}">
			<td><input type="submit" value="削除"></td>
		</tr>	
		</f:form>	
		
		</c:forEach>
		
		<form action="update" method="post">
		<input type="submit" value="登録">
		</form><br>
		
		<form action="indexpr" method="post">
		<input type="submit" value="優先度順">
		</form>
		
		<form action="indexda" method="post">
		<input type="submit" value="日付順">
		</form>
	</body>
</html>
