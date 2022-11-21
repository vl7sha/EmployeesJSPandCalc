<%--
  Created by IntelliJ IDEA.
  User: vl7sha
  Date: 11/20/22
  Time: 9:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%--%>
<%--    float result = 0;--%>
<%--    float firstNumber = 0;--%>
<%--    float secondNumber = 0;--%>

<%--   try{--%>
<%--       if (request.getMethod().equals("POST")){--%>
<%--           firstNumber = Float.parseFloat(request.getParameter("firstNumber"));--%>
<%--           secondNumber = Float.parseFloat(request.getParameter("secondNumber"));--%>
<%--           if (request.getParameter("sum") != null){--%>
<%--               result = firstNumber + secondNumber;--%>
<%--           } else if (request.getParameter("minus") != null){--%>
<%--               result = firstNumber - secondNumber;--%>
<%--           } else if (request.getParameter("multiplication") != null){--%>
<%--               result = firstNumber * secondNumber;--%>
<%--           } else {--%>
<%--               result = firstNumber / secondNumber;--%>
<%--           }--%>
<%--       }--%>
<%--   } catch (Exception e){--%>
<%--       request.setAttribute("errorMessage", e);--%>
<%--       request.getRequestDispatcher("Error.jsp").forward(request,response);--%>
<%--   }--%>
<%--%>--%>
<html>
<head>
    <title>Title</title>
</head>
<style>
    form{
        margin-top: 10%;
        text-align: center;
    }
    div{
        margin: 10px 10px;
    }
</style>
<body>
<div>
    <form method="post">
    <div>
        <h1>Calculator</h1>
    </div>
    <div>
        <label for="firstNumber"></label>
        <input type="text" id="firstNumber" name="firstNumber" value="<c:out value="${firstNumber}"/>">
    </div>
    <div>
        <label for="secondNumber"></label>
        <input type="text" id="secondNumber" name="secondNumber" value="<c:out value="${secondNumber}"/>">
    </div>
    <div>
        <input type="submit" name="sum" value="sum">
        <input type="submit" name="minus" value="minus">
        <input type="submit" name="multiplication" value="multiplication">
        <input type="submit" name="division" value="division">
    </div>
    <div>
        Result : <c:out value="${result}"/>
    </div>
    </form>
</div>
</body>
</html>
