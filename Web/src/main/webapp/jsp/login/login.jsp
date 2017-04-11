<%--
  Created by IntelliJ IDEA.
  User: stasi
  Date: 11.04.2017
  Time: 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>LogIn</title>
    <link href="style.css" rel="stylesheet">
</head>
<body>
<form class="login" method="post" action="">
    <label for="login">Логин</label>
    <input type="text" id="login" name="login" value="" size="20"/>
    <label for="password">Пароль</label>
    <input type="password" id="password" name="password" value="" size="20"/>
    <input type="submit" value="Enter"/>
    <p style="color: red">${errorLoginOrPassword} </p>
    <p>${operationMessage}</p>
</form>
</body>
</html>
