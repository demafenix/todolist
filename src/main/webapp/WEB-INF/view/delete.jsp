<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>予定の削除</title>
	</head> 
	<body>
		<c:forEach var="obj" items="${list}" varStatus="status">
		<c:out value="${obj.getDate()}"/><br>
		<c:out value="${obj.getTodo()}"></c:out><br>
		</c:forEach>
		
		<f:form modelAttribute="dataDelete" action="indexdel" method="post">
		<div>
		削除したい日付を選択してください<input type="date" id="date" name="date" value="2018-04-01">
		<f:errors path="date" elemnt="div" cssStyle="color:red"/>
		</div>
		<input type="submit" value="削除">
		
		</f:form>
	</body>
</html>
