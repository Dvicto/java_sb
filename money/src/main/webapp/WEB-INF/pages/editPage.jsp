<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <c:if test="${empty user.name}">
        <title>Add</title>
    </c:if>
</head>
<body>
<c:if test="${empty user.name}">
    <c:url value="/add" var="var"/>
</c:if>

<form action="${var}" method="POST">
    <label for="name">name</label>
    <input type="text" name="name" id="name">
    <label for="nick">nick</label>
    <input type="text" name="nick" id="nick">
    <label for="money">money</label>
    <input type="text" name="money" id="money">
    <label for="coin">coin</label>
    <input type="text" name="coin" id="coin">
    <c:if test="${empty user.name}">
        <input type="submit" value="Add new user">
    </c:if>
</form>
</body>
</html>