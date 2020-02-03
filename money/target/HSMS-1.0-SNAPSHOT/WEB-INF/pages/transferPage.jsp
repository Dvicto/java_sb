<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <c:if test="${empty user.name}">
        <title>Transfer</title>
    </c:if>
</head>
<body>
<c:if test="${empty user.name}">
    <c:url value="/transfer" var="var"/>
</c:if>

<form action="${var}" method="POST">
    <label for="From">From</label>
    <input type="text" name="From" id="From">
    <label for="To">To</label>
    <input type="text" name="To" id="To">
    <label for="value">money</label>
    <input type="text" name="value" id="value">
    <c:if test="${empty user.name}">
        <input type="submit" value="Transfer money">
    </c:if>
</form>
</body>
</html>