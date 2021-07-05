<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 7/5/2021
  Time: 10:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/studentmanagment_war/resourceurl/css/style.css">
</head>
<body>
<h2 class="red" align="center">Add Student</h2>
<%--@elvariable id="student" type=""--%>
  <form:form action="update-student" method="post" modelAttribute="student">

    <form:hidden path="id" />
    <label>Name: </label>
    <form:input path="name" />
    <br/>
    <label>Mobile: </label>
    <form:input path="mobile" /><br/>
    <label>Country: </label>
    <form:input path="country" /><br/>
    <input type="submit" value="update" />

  </form:form>
</body>
</html>
