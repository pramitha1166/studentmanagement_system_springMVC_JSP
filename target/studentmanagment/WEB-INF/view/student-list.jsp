<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 7/3/2021
  Time: 12:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/studentmanagment_war/resourceurl/css/style.css">
</head>
<body>



  <form action="/studentmanagment_war/saveStudentPage">
      <button type="submit">Add</button>
  </form>

  <table>
      <thead>
          <tr>
              <th>ID</th>
              <th>Name</th>
              <th>Country</th>
              <th>Mobile</th>
              <th>Update</th>
          </tr>
      </thead>
      <tbody>
      <c:forEach items="${students}" var="student">
          <tr>
              <td>${student.id}</td>
              <td>${student.name}</td>
              <td>${student.country}</td>
              <td>${student.mobile}</td>
              <td>
                  <a href="/studentmanagment_war/update?userId=${student.id}">Update</a>
              </td>
              <td>
                  <a href="/studentmanagment_war/delete?userId=${student.id}">Delete</a>
              </td>
          </tr>
      </c:forEach>
      </tbody>
  </table>


</body>
</html>
