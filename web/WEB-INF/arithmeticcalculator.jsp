<%-- 
    Document   : arithmeticcalculator
    Created on : May 31, 2021, 8:21:26 PM
    Author     : 855474
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="">
            <label>First:</label>
            <input type="text" name="arithmetic_first" value="${first_input}">
            <br>
            <label>Second:</label>
            <input type="text" name="arithmetic_second" value="${second_input}">
            <br>
            <input type="submit" name="addition" value="+">
            <input type="submit" name="subtraction" value="-">
            <input type="submit" name="multiplication" value="*">
            <input type="submit" name="modulus" value="%">
            <br>
            <p>Result: ${message}</p>
            <a href="age">Age Calculator</a>
        </form>
    </body>
</html>
