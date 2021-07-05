<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 7/3/2021
  Time: 6:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/studentmanagment_war/resourceurl/css/style.css"/>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
</head>
<body>

    <h2 class="red" align="center">Add Student</h2>
    <%--@elvariable id="student" type=""--%>
    <form:form action="save-student" method="post" modelAttribute="student">

        <label>Name: </label>
        <form:input path="name" />
        <br/>
        <label>Mobile: </label>
        <form:input path="mobile" /><br/>
        <label>Country: </label>
        <form:input path="country" /><br/>
        <input type="submit" />
    </form:form>
</body>
</html>
