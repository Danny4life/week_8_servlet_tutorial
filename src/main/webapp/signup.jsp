<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 13/11/2024
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <h1>Register User Form</h1>
    <form action="/signup" method="post">
        First Name : <input type="text" name="firstName" /><br /><br />
        Last Name : <input type="text" name="lastName" /><br /><br />
        Email : <input type="email" name="email" /><br /><br />
        Password : <input type="password" name="password" /><br /><br />
        <input type="submit" value="Signup">
    </form>
</div>
</body>
</html>
