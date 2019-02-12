<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/8/9
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
<h1>这是主页.....</h1>
<a href="${pageContext.request.contextPath}/insertOne">添加用户</a>
<a href="${pageContext.request.contextPath}/getUserList?pageSize=10&currentPage=1">获取用户列表</a>
</body>
</html>
