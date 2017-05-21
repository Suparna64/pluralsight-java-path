<%--
  Created by IntelliJ IDEA.
  User: jsssn
  Date: 21-May-17
  Time: 1:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Add Goal</title>

    <style>
        .error {
            color: #ff0000;
        }

        .errorblock {
            color: #000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body>

<form:form commandName="goal">
    <form:errors path="*" cssClass="errorblock" element="div"/>
    <table>
        <tr>
            <td>Enter Minutes:</td>
            <td><form:input path="minutes" cssErrorClass="error"/></td>
            <td><form:errors path="minutes" cssClass="error"/></td>
        </tr>
        <tr>
            <td colspan="3">
                <input type="submit" value="Enter Goal Minutes"/>
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>
