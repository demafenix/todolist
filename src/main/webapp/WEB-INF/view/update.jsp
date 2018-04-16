<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
		<meta charset="utf-8">
		<title>予定の追加</title>
	</head> 
	<body>
		<f:form modelAttribute="dataUpdate" action="indexup" method="post">
		<div>
		予定日を指定してください<input type="date" id ="date" name="date" value="2018-04-01">
		<f:errors path="date" element="div" cssStyle="color:red"/>
		</div>
		<div>
		予定を入力してください<input type="text" id="data" name="data">
		<f:errors path="data" element="div" cssStyle="color:red"/>
		</div>
		<div>
		優先度を入力してください(1~3)<input type="number" id="priority" name="priority">
		<f:errors path="priority" element="div" cssStyle="color:red"/>
		</div>
		<div>
		<input type="submit" value="登録">
		</div>
		</f:form>
		
	</body>
</html>
