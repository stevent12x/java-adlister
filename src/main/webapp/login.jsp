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
    <link rel="stylesheet" href="uikit/dist/css/uikit.css">
    <link rel="stylesheet" href="uikit/dist/css/uikit-rtl.css">
    <script src="uikit/dist/js/uikit.js"></script>
    <script src="uikit/dist/js/uikit-icons.js"></script>
</head>
<body>
<%@ include file="partials/top_package.jsp"%>

<container class=".uk-container">
<form method="post" action="http://localhost:8080/login.jsp">
    <fieldset class="uk-fieldset">
        <div class="uk-margin">Username:
            <input id="username" name="username" type="text" class="uk-input" placeholder="Username">
        </div>
        <br>
        <div class="uk-margin">Password:
            <input id="password" name="password" type="text" class="uk-input" placeholder="Password">
        </div>
        <br>
        <button type="submit" class="uk-button-primary">Submit</button>
    </fieldset>
</form>
    <p>Admin Parameter: <%=request.getParameter("username")%></p>
    <p>Password Parameter: <%= request.getParameter("password")%></p>
    
    <c:if test="${param.username.equalsIgnoreCase('admin') && param.password.equalsIgnoreCase('password')}">
        <c:redirect url="profile.jsp"></c:redirect>
    </c:if>
</container>
</form>
</body>
</html>
