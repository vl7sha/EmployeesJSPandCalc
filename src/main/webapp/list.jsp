<%--
  Created by IntelliJ IDEA.
  User: vl7sha
  Date: 11/20/22
  Time: 3:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <form method="post" action="${pageContext.request.contextPath}/list">
        <label for="nameInput">Name</label>
        <input type="text" name="nameSearch" id="nameInput">
        <input type="submit"  value="search">
        <label for="idInput">Id</label>
        <input type="text" name="idSearch" id="idInput">
        <input type="submit"  value="search">
        <input type="submit" name="All" value="All employees">
    </form>
</div>
<div>
    <table>
        <thead>
            <tr>
                <td>
                    Id
                </td>
                <td>
                    Name
                </td>
                <td>
                    Manager
                </td>
                <td>
                    Salary
                </td>
                <td>Name subdivision</td>
                <td>
                    Department City Location
                </td>
                <td>
                    Category
                </td>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${listEntity}" var="Entity">
            <tr>
                <td><c:out value="${Entity.idEmployee}"></c:out></td>
                <td><c:out value="${Entity.name}"></c:out></td>
                <td><c:out value="${Entity.manager}"></c:out></td>
                <td><c:out value="${Entity.salary}"></c:out></td>
                <td><c:out value="${Entity.nameSubdivision}"></c:out></td>
                <td><c:out value="${Entity.departmentCityLocation}"></c:out></td>
                <td><c:out value="${Entity.category}"></c:out></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
