<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/21
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java"
         isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
           prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <table align="center" border="1" cellspacing="0">
        <tr>
            <th>id</th>
            <th>username</th>
            <th>password</th>
        </tr>
        <tr>
            <c:forEach items="${users}" var="user" varStatus="st">
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
            </c:forEach>
        </tr>
    </table>
</body>
</html>
