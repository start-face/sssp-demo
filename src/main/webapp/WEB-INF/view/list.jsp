<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/2/12
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>List</title>
</head>
<body>
<div style="margin-top: 10%;"></div>
<table cellpadding="0" cellspacing="0" border="2">
    <tr>
        <th>ID</th>
        <th>用户名</th>
        <th>密码</th>
        <th>电话</th>
        <th>状态</th>
        <th>时间</th>
    </tr>
    <c:forEach items="${page.list}" var="one">
        <tr>
            <td>${one.id}</td>
            <td>${one.userName}</td>
            <td>${one.passWord}</td>
            <td>${one.phone}</td>
            <td>${one.status}</td>
            <td>${one.addTime}</td>
        </tr>
    </c:forEach>
</table>
<br/>
当前页：<a href="#">${page.currentPage}</a>&nbsp;&nbsp;
总页数：<a href="#">${page.totalPage}</a>&nbsp;&nbsp;
总记录数：<a href="#">${page.totalCount}</a>&nbsp;&nbsp;
每页显示数：<a href="#">${page.pageSize}</a>
</body>
</html>
