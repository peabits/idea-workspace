<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/24
  Time: 12:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java"
         isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div align="center" style="margin:0px auto; width:500px">
        <form action="update" method="post">
            <input type="hidden" name="id" value="${computer.id}" />
            <label for="brand">brand:</label>
            <input type="text" name="brand" id="brand" value="${computer.brand}" />
            <br />
            <label for="price">price:</label>
            <input type="text" name="price" id="price" value="${computer.price}" />
            <br />
            <input type="submit" value="submit">
        </form>
    </div>
</body>
</html>
