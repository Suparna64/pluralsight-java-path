<%--
  Created by IntelliJ IDEA.
  User: jsssn
  Date: 21-May-17
  Time: 11:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Minutes Page</title>

    <script type="text/javascript" src="jquery-3.2.1.js"></script>

    <script type="text/javascript">
        $(document).ready(
            function () {
                $.getJSON('<spring:url value="activities.json"/>', {
                    ajax : 'true'
                }, function (data) {
                    var html = '<option value="">--Please select one--</option>';
                    var len = data.length;
                    for (var i = 0; i < len; i++) {
                        html += '<option value="' + data[i].desc + '">'
                                + data[i].desc + '</option>';
                    }
                    html += '</option>'

                    $('#activities').html(html);
                });
            }
        );
    </script>
</head>
<body>
<h1>Add Minutes Exercised</h1>

Language : <a href="?language=en">English</a> | <a href="?language=es">Spanish</a>

<form:form commandName="exercise">
    <table>
        <tr>
            <td><spring:message code="goal.text"/></td>
            <td><form:input path="minutes"/></td>
            <td>
                <form:select id="activities" path="activity"></form:select>
            </td>
        </tr>
        <tr>
            <td colspan="3">
                <input type="submit" value="Enter Exercise">
            </td>
        </tr>
    </table>
</form:form>

<h1>Our goal for the day is: ${goal.minutes}</h1>
</body>
</html>
