<%@ page import="java.util.Calendar" %>
<%@ page import="com.jcsanchez.User" %><%--
  Created by IntelliJ IDEA.
  User: jsssn
  Date: 09-May-17
  Time: 6:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${initParam.ProductName}</title>
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="metro-bootstrap-master/css/metro-bootstrap.css" rel="stylesheet" type="text/css"/>
    <link href="app.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<%@include file="_header.jsp"%>
<section class="main container-fluid">
    <%
        Calendar calendar = Calendar.getInstance();
    %>
    <div class="container">
        <h1>Home</h1>
        <div class="row-fluid">
            <div class="col-md-3">
                <%= calendar.getTime().toString() %>
            </div>
            <div class="col-md-9">
                <ul class="nav nav-tabs">
                    <li><a href="#home" data-toggle="tab">${app.tabNames[0]}</a> </li>
                    <li><a href="#other" data-toggle="tab">${app.tabNames[1]}</a> </li>
                    <li><a href="#messages" data-toggle="tab">${app.tabNames[2]}</a> </li>
                    <li><a href="#settings" data-toggle="tab">${app.tabNames[3]}</a> </li>
                </ul>
                <tabset>
                    <tab heading="Search">
                        <div class="${app.formCssClass.name}">
                            <h2>Welcome ${ user.name }</h2>
                            <form action="home" method="post">
                                <p>
                                    Name: <input type="text" name="name"/>
                                </p>

                                <p>
                                    <input type="submit" value="Enter name">
                                </p>
                            </form>
                        </div>
                    </tab>
                    <tab heading="Next">
                        Yet More Static content
                    </tab>
                </tabset>
            </div>
        </div>
    </div>
</section>
<script src="bootstrap/js/bootstrap.js"></script>
</body>
</html>
