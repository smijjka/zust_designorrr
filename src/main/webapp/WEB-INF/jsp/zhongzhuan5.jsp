<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/6/21
  Time: 12:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8">
    <title>中转页面</title>
</head>
<body>
<p><%=request.getSession().getAttribute("str4")%></p>
<a href="/admin/zhongzhuan5">点击继续操作</a>
</body>
</html>
