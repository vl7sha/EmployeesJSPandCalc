<%--
  Created by IntelliJ IDEA.
  User: vl7sha
  Date: 11/20/22
  Time: 9:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String errorMessage = request.getParameter("errorMessage");%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <%=errorMessage%>
    </div>
    <div>
        <a href="${pageContext.request.contextPath}/calc">
                Back
        </a>
    </div>
</body>
</html>
