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
    <style>
        body{
            background-color:white;
            background-image: linear-gradient(90deg, rgba(200,0,0,.5) 50%, transparent 50%),
            linear-gradient(rgba(200,0,0,.5) 50%, transparent 50%);
            background-size:50px 50px;
        }
        form{
            width:250px;
            margin:50px auto;
            padding:15px 20px;
            background:#f5f5f5;
            background-color:rgba(245,245,245,0.95);
            border-radius: 10px;
            box-shadow:0 0 5px rgba(0, 0, 0, 0.4);
        }
        label{
            display:block;
            margin-top:1em;
            margin-bottom:0.5em;
        }
        label:first-child{
            margin-top:0;
        }
        input[type="text"],
        input[type="password"]{
            width:100%;
            border:1px solid #ccc;
            padding:4px 5px;
            background:white;
            border-radius: 5px;
            box-shadow:inset 0 1px 2px rgba(0, 0, 0, 0.2);
            box-sizing:border-box;
        }
        input[type="text"]:focus,
        input[type="password"]:focus{
            box-shadow:0 0 5px rgba(50, 200, 255, 0.5);
            outline:none;
        }
        input[type="submit"]{
            display:block;
            margin-top:1em;
            padding:5px 15px;
            font-weight:bold;
            color:#333;
            background:white;
            border:none;
            border-radius: 12px;
            background-image: linear-gradient(to bottom, #fff, #ddd);
            box-shadow: 0 1px 2px rgba(0, 0, 0, 0.3);
            text-shadow:0 1px 1px white;
        }
    </style>
</head>
<body>
<form class="login" method="post" action="controller">
    <label for="login">Логин</label>
    <input type="text" id="login" name="login" value="" size="20"/>
    <label for="password">Пароль</label>
    <input type="password" id="password" name="password" value="" size="20"/>
    <input type="submit" value="LogIn"/>
    <p style="color: red">${errorLoginOrPassword} </p>
    <p>${operationMessage}</p>
</form>
</body>
</html>
