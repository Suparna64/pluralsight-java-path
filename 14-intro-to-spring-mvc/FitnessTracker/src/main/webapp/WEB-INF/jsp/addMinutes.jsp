<%--
  Created by IntelliJ IDEA.
  User: jsssn
  Date: 21-May-17
  Time: 11:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Minutes Page</title>
</head>
<body>
<h1>Add Minutes Exercised</h1>
<form:form commandName="exercise">
    <table>
        <tr>
            <td>Minutes Exercised For Today:</td>
            <td><form:input path="minutes"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Enter Exercise">
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
