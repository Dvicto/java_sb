<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

        <title>Transfer</title>

</head>
<body>

    <c:url value="/transfer" var="var"/>


<form action="${var}" method="POST">
    <label for="From">From</label>
    <input type="number" name="from" id="from">
    <label for="To">To</label>
    <input type="number" name="to" id="to">
    <label for="value">money</label>
    <input type="number" name="value" id="value">

        <input type="submit" value="Transfer money">

</form>
</body>
</html>