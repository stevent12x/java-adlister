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

<h1>The current count is <%= counter %>.</h1>

View the page source!
<%= request.getParameter("page_no")%>
<p>"page_no" parameter: ${param.page_no != null ? param.page_no : 'No results'}</p>

<%-- this is a JSP comment, you will *not* see this in the html --%>

<!-- this is an HTML comment, you *will* see this in the html -->


</body>
</html>