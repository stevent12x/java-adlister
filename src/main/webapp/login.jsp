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
    <title>Login</title>
    <%@include file="/partials/top_package.jsp"%>
</head>
<body>
<container class="uk-container">
<form method="post" action="http://localhost:8080/login.jsp">
    <fieldset class="uk-fieldset uk-margin-large-left uk-margin-small-bottom uk-form-width-medium">
        <div class="uk-margin">Username:
            <input id="username" name="username" type="text" class="uk-input uk-form-danger" placeholder="Username">
        </div>
        <br>
        <div class="uk-margin">Password:
            <input id="password" name="password" type="password" class="uk-input uk-form-danger uk-form-success" placeholder="Password">
        </div>
        <br>
        <button type="submit" class="uk-button-primary uk-button-large uk-width-1-2@m uk-text-small uk-padding-small">Submit</button>
    </fieldset>
</form>
    <hr class="uk-divider-icon">
    <p class="uk-margin-large-left">Admin Parameter: <%=request.getParameter("username")%></p>
    <p class="uk-margin-large-left">Password Parameter: <%= request.getParameter("password")%></p>
    
    <c:if test="${param.username.equalsIgnoreCase('admin') && param.password.equalsIgnoreCase('password')}">
        <c:redirect url="profile.jsp"></c:redirect>
    </c:if>
</container>
</form>
</body>
</html>
