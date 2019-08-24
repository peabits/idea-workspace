<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/23
  Time: 18:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>edit</title>
</head>
<body>
    <div style="margin: 0px auto; width: 500px">
        <form action="update" method="post">
            <input type="hidden" name="id" value="${phone.id}" />
            brand: <input type="text" name="brand" value="${phone.brand}" />
            <br />
            price: <input type="text" name="price" value="${phone.price}" />
            <br />
            <input type="submit" value="submit" />
        </form>
    </div>
</body>
</html>
