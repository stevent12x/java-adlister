<%--
  Created by IntelliJ IDEA.
  User: steventurner
  Date: 2019-08-23
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Apply Now!</h1>
    <p>Apply for our <span>${sessionScope.program}</span> program!</p>



    <h3>Price: ${param.price}.00</h3>
    <form action="#">

        <c:if test="${sessionScope.program == 'DS'}">
             <label for="Q1">Do you know Python?</label>
             <select name="Q1" id="Q1">
                 <option value="0">No</option>
                 <option value="1">Yes</option>
             </select>
        </c:if>
        <hr class="uk-divider-icon">
        <label for="Q2">Do you like solving problems?</label>
        <select name="Q2" id="Q2">
            <option value="0">No</option>
            <option value="1">Yes</option>
        </select>
        <hr class="uk-divider-icon">
        <label for="Q3">Do you like big butts and you cannot lie?</label>
        <select name="Q3" id="Q3">
            <option value="0">Yes</option>
            <option value="1">Yes</option>
        </select>

    </form>
</body>
</html>
