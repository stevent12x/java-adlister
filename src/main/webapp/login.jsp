<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: steventurner
  Date: 2019-08-21
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="http://localhost:8080/login.jsp">
    <label for="username">Username</label>
    <input id="username" name="username" type="text">
    <br>
    <label for="password">Password</label>
    <input id="password" name="password" type="text">
    <br>
    <input type="submit">

    <p>Admin Parameter: <%=request.getParameter("username")%></p>
    <p>Password Parameter: <%= request.getParameter("password")%></p>
    
    <c:if test="${param.username.equalsIgnoreCase('admin') && param.password.equalsIgnoreCase('password')}">
        <c:redirect url="profile.jsp"></c:redirect>
    </c:if>
</form>
</body>
</html>
