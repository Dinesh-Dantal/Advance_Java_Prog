<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--equivalent to int i=5 --%>
<c:set var="i" value="5"></c:set>

<%--display output --%>
<c:out value="${i}"></c:out>
<c:if test="${i<5}">
    smaller value <5
</c:if>
<c:forEach var="j" begin="1" end="10">
    <h3>Hello ${j}</h3>
</c:forEach>
<c:choose>
    <c:when test="${i==1}">Monday</c:when>
    <c:when test="${i==2}">Tuesday</c:when>
    <c:when test="${i==3}">Wednesday</c:when>
    <c:otherwise">Sunday</c:otherwise>
</c:choose>





</body>
</html>