<%--
  Created by IntelliJ IDEA.
  User: Thinh
  Date: 1/30/2019
  Time: 3:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Email</title>
</head>
<body>
    <h1>Email Validate</h1>
    <h3 style="color:red;">${message}</h3>

    <form action="validate" method="post">
        <input type="text" name="email" size="30" placeholder="Email" />
        <input type="submit" value="Check Email">
    </form>
</body>
</html>
