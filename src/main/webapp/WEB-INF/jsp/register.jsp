<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/5/30
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
   <link type="text/css" rel="stylesheet" href="/css/design.css">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8">
    <title>注册界面</title>
</head>
<body link="gray" alink="red" vlink="black"  topmargin="30px" leftmargin="70px" >
<div>
    <center><h1>欢迎来到佳运商品系统!</h1></center>
    <marquee bgcolor="gray" behavior="scroll">
        <font color="white" size="+1">欢迎来到佳运商品系统!</font>
    </marquee>
</div>
<center><h2><b>注册</b></h2></center>
<center><div id="box">
<center><form  action="/users/register" method="post">
    <b>id</b>:<input type="text" name="id"><br>
    <b>login_name</b>:<input type="text" name="login_name"><br>
    <b>password</b>:<input type="text" name="password"><br>
    <b>name</b>:<input type="text" name="name"><br>
    <b>mobile</b>:<input type="tel" name="mobile"><br>
    <b>email</b>:<input type="email" name="email"><br>
    <b>type(0为管理员1为商户2为用户)</b>: <input type="text" name="type"><br>
    <input type="submit" name="submit" value="点击注册"><br>
</form></center>
</div>
</center>
<p align="center">提示:注册id长度不能超过八位</p>
<p align="center">注册login_name长度不能超过十位</p>
<p align="center">注册password长度不能超过十位</p>
<p align="center">注册name长度不能超过五位</p>

</body>
</html>
