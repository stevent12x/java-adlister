<%--
  Created by IntelliJ IDEA.
  User: steventurner
  Date: 2019-08-22
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Ads</title>
</head>
<body>

<h2>Here are the ads you requested:</h2>

<c:forEach var="ad" items="${ads}">
        <h4>${ad.title}</h4>
        <p>${ad.description}</p>
</c:forEach>
</body>
</html>
