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
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
           prefix="c"%>
<html>
<head>
    <title>电脑</title>
    <style>
        #first-div {
            width: 500px;
            margin: 20px auto;
            text-align: center
        }
        #tb-computer {
            text-align: center;
        }
        #tb-computer tr {
            height: 50px;
            /*width: 200px;*/
        }
        #tb-computer td {
            width: 2000px;
        }
    </style>
</head>
<body>
    <div id="first-div">
        <table id="tb-computer" align="center" border="1px" cellspacing="0">
            <tr>
                <th>id</th>
                <th>brand</th>
                <th>price</th>
                <th id="add" colspan="2">
                    <a href="add">add</a>
                </th>
            </tr>
            <c:forEach items="${pageInfo.list}" var="computer" varStatus="vs">
                <tr>
                    <td>${computer.id}</td>
                    <td>${computer.brand}</td>
                    <td>${computer.price}</td>
                    <td>
                        <a href="edit?id=${computer.id}">edit</a>
                    </td>
                    <td>
                        <a href="delete?id=${computer.id}">delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <br />
        <div>
            <a href="?start=1">【首页】</a>
            <a href="?start=${pageInfo.pageNum-1}">【上一页】</a>
            <a href="?start=${pageInfo.pageNum+1}">【下一页】</a>
            <a href="?start=${pageInfo.pages}">【末页】</a>
        </div>
    </div>
</body>
</html>
