<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/24
  Time: 12:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
</head>
<body>
    <div align="center">
        <form action="addCommit" method="post">
            <label for="brand">brand:</label>
            <input type="text" name="brand" id="brand" />
            <br />
            <label for="price">price:</label>
            <input type="text" name="price" id="price" />
            <br />
            <input type="submit" value="submit">
        </form>
    </div>
</body>
</html>
