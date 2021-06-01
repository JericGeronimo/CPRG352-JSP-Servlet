<%-- 
    Document   : agecalculator
    Created on : May 31, 2021, 6:52:54 PM
    Author     : 855474
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="">
            <label>Enter your age:</label>
            <input type="text" name="input_age" value="${age}">
            <br>
            <input type="submit" value="Age next birthday">
            <p>${message}</p>
            <a href="arithmetic">Arithmetic Calculator</a>
        </form>
    </body>
</html>
