<%--
  Created by IntelliJ IDEA.
  User: dguan
  Date: 6/5/2021
  Time: 11:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert Student Info</title>
</head>
<body>
<form action="/WEB03/usr/insertStudent" method="post">
    <input type="text" name="stuid" placeholder="student id"><br>
    <input type="text" name="stuname" placeholder="student name"><br>
    <input type="text" name="age" placeholder="student age"><br>
    <input type="text" name="gender" placeholder="student gender"><br>
    <input type="text" name="major_id" placeholder="student major id"><br>
    <input type="submit" value="insert"><br>
</form>
</body>
</html>
