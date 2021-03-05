<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta charset="ISO-8859-1">
<title>Medicine Stock</title>
</head>
<body> 
</body>
</html>

<c:if test="${not empty medicine}">
    <c:forEach items="${medicine}" var="medicine">
       ${medicine}<br>
</c:forEach>
</c:if>