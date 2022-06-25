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
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap-theme.css">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap.css">
    <script src="/bootstrap-3.4.1-dist/js/bootstrap.min.js"></script>
    <script src="/js/CheckRegist.js"></script>
    <link type="text/css" rel="stylesheet" href="/css/design.css">
    <link type="text/css" rel="stylesheet" href="/css/regist.css">
    <link type="text/css" rel="stylesheet" href="/css/tips.css">
    <%@ include file="header.jsp"%>
    <%@ include file="footer.jsp"%>
    <title>注册界面</title>

    <script>
    </script>
</head>
<body link="gray" alink="red" vlink="black"  topmargin="30px" leftmargin="70px" >
<div>

</div>
<div class="rg_layout">
    <div class="rg_left">
        <p>新用户注册</p>
        <p>USER REGISTER</p>
    </div>
    <div class="rg_center">
        <form  action="/users/register" method="post">
            <br>
            <tr>
                <td class="td_left"><label for="id">I&emsp;D&emsp;:<D:</label></td>
                <td class="td_right"><input type="text" name="id" id="id" autofocus onblur="checkid(this)" placeholder="请输入不超过八位数字"></td>
            </tr>
            <span  id="span1" class="false" ></span><br>
            <tr><br>
                <td class="td_left"><label for="login_name">用户名:</label></td>
                <td class="td_right"><input type="text" name="login_name" id="login_name" autofocus onblur="checkloginname(this)" placeholder="请输入不超过十位字符"></td>
            </tr>
            <span id="span2" class="false"></span><br><br>
            <tr>
                <td class="td_left">密&emsp;码:</td>
                <td class="td_right"> <input type="password" name="password" id="password"autofocus onblur="checkpwd(this)" placeholder="请输入不超过十位字符"></td>
            </tr>
            <span id="span4" class="false"></span><br><br>
            <tr>
                <td class="td_left">姓&emsp;名:</td>
                <td class="td_right"> <input type="text" name="name" id="name" autofocus onblur="checkname(this)" placeholder="请输入不超过五位字符"></td>
            </tr>
            <span id="span7" class="false"></span><br><br>
            <tr>
                <td class="td_left">电&emsp;话:</td>
                <td class="td_right"> <input type="text" name="mobile" id="mobile" autofocus onblur="checktel(this)" placeholder="请输入联系电话"></td>
            </tr>
            <span id="span5" class="false"></span><br><br>
            <tr>
                <td class="td_left">邮&emsp;箱:</td>
                <td class="td_right"> <input type="email" name="email" id="email" onblur="checkemail(this)" autofocus placeholder="请输入电子邮箱"></td>
            </tr>
            <span id="span3" class="false"></span><br><br>
            <tr>
                <td class="td_left">类&emsp;型:</td>
                <td class="td_right"> <input type="text" name="type" id="type" autofocus onblur="checktype(this)" placeholder="1用户，2商家"></td>
            </tr>
            <span id="span6" class="false"></span> <br><br>
            <td colspan="2" align="center" >  <input type="submit" name="submit" id="submit" value="点击注册"> </td>
        </form>
    </div>
    <div class="rg_right">
        <p>已有账号?<a href="/users/login">立即登录</a></p>
    </div>
</div>


</body>
</html>
