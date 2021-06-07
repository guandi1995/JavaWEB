<%--
  Created by IntelliJ IDEA.
  User: dguan
  Date: 6/5/2021
  Time: 11:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Student Info</title>
</head>
<body>
<form action="/WEB03/usr/updateStudent" method="post">
    <input type="text" name="stuid" placeholder="student id" readonly value="${student.stuid}"><br>
    <input type="text" name="stuname" placeholder="student name" value="${student.stuname}"><br>
    <input type="text" name="age" placeholder="student age" value="${student.age}"><br>
    <input type="text" name="gender" placeholder="student gender" value="${student.gender}"><br>
    <input type="text" name="major_id" placeholder="student major id" value="${student.major_id}"><br>
    <input type="submit" value="update"><br>
</form>
</body>
</html>
