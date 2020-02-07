<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

        <title>Add</title>

</head>
<body>

    <c:url value="/add" var="var"/>


<form action="${var}" method="POST">
    <label for="name">name</label>
    <input type="text" name="name" id="name">
    <label for="nick">nick</label>
    <input type="text" name="nick" id="nick">
    <label for="money">money</label>
    <input type="text" name="money" id="money">
    <label for="coin">coin</label>
    <input type="text" name="coin" id="coin">

        <input type="submit" value="Add new user">

</form>
</body>
</html>