<%--
  Created by IntelliJ IDEA.
  User: dguan
  Date: 6/5/2021
  Time: 11:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Info</title>
</head>
<body>

<a href="/WEB03/view/studentInsert.jsp">Insert Student</a>
${requestScope.message.message}
<table style="border: 1px;width: 100%">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>age</td>
        <td>gender</td>
        <td>majorId</td>
        <td>operations</td>
    </tr>
    <c:forEach items="${studentsList}" var="student">
        <tr>
            <td>${student.stuid}</td>
            <td>${student.stuname}</td>
            <td>${student.age}</td>
            <td>${student.gender}</td>
            <td>${student.major_id}</td>
            <td>
                <a href="/WEB03/usr/deleteStudent?stuid=${student.stuid}">delete</a>
                <a href="/WEB03/usr/fetchStudentById?stuid=${student.stuid}">update</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
