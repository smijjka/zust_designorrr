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
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap-theme.css">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap.css">
    <script src="/bootstrap-3.4.1-dist/js/bootstrap.min.js"></script>
    <%@include file="header.jsp"%>
    <%@include file="footer.jsp"%>
    <title>用户登录</title>
    <link type="text/css" rel="stylesheet" href="/css/design.css">
    <link type="text/css" rel="stylesheet" href="/css/regist.css">
</head>
<body>


<div class="rg_layout">
    <div class="rg_left">
        <p>用户登录</p>
        <p>USER LOGIN</p>
    </div>
    <div class="rg_center">
        <div class="rg_form">
            <form action="/users/login" method="post">
                <tr>
                    <td class="td_left"><label>用户名:</label></td>
                    <td class="td_right"><input type="text" name="userName" id="userName" placeholder="请输入用户名"></td>
                </tr><br>
                <br>
                <tr>
                    <td class="td_left"><label>密&emsp;码:</label></td>
                    <td class="td_right"><input type="password" name="password" id="password" placeholder="请输入密码"></td>
                </tr><br>
                <br>
                <td colspan="2" align="center" >  <input type="submit" name="submit" id="submit" value="登录"> </td>
            </form>
        </div>
    </div>
    <div class="rg_right">
        <p>没有账号?<a href="/users/register">立即注册</a></p>
    </div>
</div>

</body>
</html>
