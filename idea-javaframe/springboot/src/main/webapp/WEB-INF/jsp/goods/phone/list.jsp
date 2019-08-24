<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/22
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java"
         isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>list</title>
    <style>
        #first {
            width:500px;
            margin:2px auto;
            text-align: center;
        }
        table {
            text-align: center;
        }
        table tr {
            height: 50px;
        }
        table td {
            width: 200px;
        }
    </style>
</head>
<body>
    <div id="first">
        <table align="center" border="1" cellspacing="0">
            <tr>
                <th>id</th>
                <th>brand</th>
                <th>price</th>
                <th colspan="2">
                    <a href="add">增加</a>
                </th>
            </tr>
            <%
                int index = 0;
            %>
            <c:forEach items="${page.content}" var="phone" varStatus="vs">
                <tr>
                    <td>${phone.id}</td>
                    <td>${phone.brand}</td>
                    <td>${phone.price}</td>
                    <td><a href="edit?id=${phone.id}">edit</a></td>
                    <td><a href="delete?id=${phone.id}">delete</a></td>
                </tr>
                <% index++; %>
            </c:forEach>
            <% for(; index < 5; index++) { %>
            <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
            <% } %>
        </table>
        <br />
        <div>
            <a href="?start=0">【首页】</a>
            <c:if test="${page.number>0}">
                <a href="?start=${page.number-1}">【上一页】</a>
            </c:if>
            <c:if test="${page.number<page.totalPages-1}">
                <a href="?start=${page.number+1}">【下一页】</a>
            </c:if>
            <a href="?start=${page.totalPages-1}">【末页】</a>
        </div>
    </div>
</body>
</html>