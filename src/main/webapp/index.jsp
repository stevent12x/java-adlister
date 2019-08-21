<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int counter = 0; %>
<% counter += 1; %>

<html>
<head>
    <title>Hello</title>
    <%@include file="/partials/scripts.jsp"%>
</head>
<body>
<%@include file="/partials/navbar.jsp" %>

<h3>This site has been visited: <%= counter %> ${counter == 1 ? 'time' : 'times'}</h3>

View the page source!
<% request.getParameter("page_no");%>
<p>Page number: ${param.page_no != null ? param.page_no : '1'}</p>



<%-- this is a JSP comment, you will *not* see this in the html --%>

<!-- this is an HTML comment, you *will* see this in the html -->

<%--<script src="partials/custom.js"></script>--%>
</body>
</html>