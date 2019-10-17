<%--
  Created by IntelliJ IDEA.
  User: alextr
  Date: 10/17/19
  Time: 10:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h2>Calculator</h2>
<form action="/cal" method="post">
    <input type="tex" name="firstNumber" value="">
    <select name="opera">
        <option value="addition">+</option>
        <option value="subtraction">-</option>
        <option value="multiplication">*</option>
        <option value="division">/</option>
    </select>
    <input type="text" name="secondNumber" value="">
    <input type="submit" value="submit">
    <h4>Result: ${result}</h4>

</form>
</body>
</html>
