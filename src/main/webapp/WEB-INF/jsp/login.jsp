<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/5/30
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<form action="/users/login" method="post">
    用户名<input name="userName"><br>
    密码<input name="password" type="password"><br>
    <input type="submit" value="登录">&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="取消">
</form>
</body>
</html>
