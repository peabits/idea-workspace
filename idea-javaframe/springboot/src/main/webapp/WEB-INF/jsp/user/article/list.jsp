<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/21
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java"
         isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <table align="center" border="1" cellspacing="0">
        <tr>
            <th>id</th>
            <th>author</th>
            <th>publish data</th>
        </tr>
        <tr>
            <c:forEach items="${articles}" var="article" varStatus="st" >
                <td>${article.id}</td>
                <td>${article.author}</td>
                <td>${article.publishDate}</td>
            </c:forEach>
        </tr>
    </table>
</body>
</html>
