<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/5/30
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8">
    <title>用户登录</title>
    <link type="text/css" rel="stylesheet" href="/css/design.css">
</head>
<body>
<div>
    <center><h1>欢迎来到佳运商品系统!</h1></center>
    <marquee bgcolor="gray" behavior="scroll">
        <font color="white" size="+1">欢迎来到佳运商品系统!</font>
    </marquee>
</div>
<center><h2><i>用户登录</i></h2></center>
<center><div id="box">
<center><form action="/users/login" method="post">
    login_name <input name="userName" placeholder="请输入登录名" ><br>
    password <input name="password" type="password" placeholder="请输入登录密码"><br>
    <input type="submit" value="登录">&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="取消">
</form>
</center>
</div>
</center>
</body>
</html>
