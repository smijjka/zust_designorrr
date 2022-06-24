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
    <link rel="stylesheet" href="static/bootstrap-3.4.1-dist/css/bootstrap-theme.css">
    <link rel="stylesheet" href="static/bootstrap-3.4.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="static/bootstrap-3.4.1-dist/css/bootstrap.css">
    <script src="static/bootstrap-3.4.1-dist/js/bootstrap.min.js"></script>
    <link type="text/css" rel="stylesheet" href="/css/design.css">
    <link type="text/css" rel="stylesheet" href="/css/regist.css">
    <link type="text/css" rel="stylesheet" href="/css/tips.css">
    <%@ include file="header.jsp"%>
    <%@ include file="footer.jsp"%>
    <title>注册界面</title>

    <script>
        function checkid(obj){
            if(obj.value.length>8) {
                document.getElementById("span1").innerHTML = "输入长度大于8";
                document.getElementById('id').value = '';
                setTimeout(function () {
                    document.login.id.focus();
                }, 1000)
            }
            else{
                document.getElementById("span1").innerHTML ='';
            }

        }
        function checkloginname(obj){
            if(obj.value.length>10) {
                document.getElementById("span2").innerHTML = "输入长度大于10";
                document.getElementById('login_name').value = '';
                setTimeout(function () {
                    document.login.focus();
                }, 1000)
            }
            else{
                document.getElementById("span2").innerHTML ='';
            }

        }

        function checkpwd(obj){
            if(obj.value.length>10) {
                document.getElementById("span4").innerHTML = "输入长度大于10";
                document.getElementById('password').value = '';
                setTimeout(function () {
                    document.login.focus();
                }, 1000)
            }
            else{
                document.getElementById("span4").innerHTML ='';
            }
        }

        function checktel(obj) {
            var str=obj.value;
            if (str != "") {
                var strRegex = /^(13|14|15|17|18)\d{9}$/;
                if (!strRegex.test(str)) {
                    document.getElementById('mobile').value = '';
                    setTimeout(function () {
                        document.login.focus();
                    }, 1000)
                    document.getElementById("span5").innerHTML = "电话号码格式错误";
                }else{
                    document.getElementById("span5").innerHTML = "";
                }
            }
        }

        function checkemail(obj){
            var str=obj.value;
            var reg = /^([a-zA-Z]|[0-9])(\w|\-)+@[a-zA-Z0-9]+\.([a-zA-Z]{2,4})$/;
            if (str !=""){
                if (!reg.test(str)) {
                    document.getElementById('email').value = '';
                    setTimeout(function () {
                        document.login.email.focus();
                    }, 1000)
                    document.getElementById("span3").innerHTML = "电子邮箱格式错误";
                }else{
                    document.getElementById("span3").innerHTML ="";
                }
            }
        }

        function checktype(obj) {
            var str=obj.value;
            var reg = /^([|1|2|3])$/;
            if (str !=""){
                if (!reg.test(str)) {
                    document.getElementById('type').value = '';
                    setTimeout(function () {
                        document.login.focus();
                    }, 1000)
                    document.getElementById("span6").innerHTML = "输入类型错误";
                }else{
                    document.getElementById("span6").innerHTML ="";
                }
            }
        }

        function checkname(obj){
            if(obj.value.length>5) {
                document.getElementById("span7").innerHTML = "输入长度大于5";
                document.getElementById('name').value = '';
                setTimeout(function () {
                    document.login.focus();
                }, 1000)
            }
            else{
                document.getElementById("span7").innerHTML ='';
            }
        }
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
                <td class="td_left"><label for="id">ID:</label></td>
                <td class="td_right"><input type="text" name="id" id="id" autofocus onblur="checkid(this)" placeholder="请输入不超过八位字符"></td>
            </tr>
            <span  id="span1" class="false" ></span><br>
            <tr><br>
                <td class="td_left"><label for="login_name">用户名:</label></td>
                <td class="td_right"><input type="text" name="login_name" id="login_name" autofocus onblur="checkloginname(this)" placeholder="请输入不超过十位字符"></td>
            </tr>
            <span id="span2" class="false"></span><br><br>
            <tr>
                <td class="td_left">密码:</td>
                <td class="td_right"> <input type="password" name="password" id="password"autofocus onblur="checkpwd(this)" placeholder="请输入不超过十位字符"></td>
            </tr>
            <span id="span4" class="false"></span><br><br>
            <tr>
                <td class="td_left">姓名:</td>
                <td class="td_right"> <input type="text" name="name" id="name" autofocus onblur="checkname(this)" placeholder="请输入不超过五位字符"></td>
            </tr>
            <span id="span7" class="false"></span><br><br>
            <tr>
                <td class="td_left">电话:</td>
                <td class="td_right"> <input type="text" name="mobile" id="mobile" autofocus onblur="checktel(this)"></td>
            </tr>
            <span id="span5" class="false"></span><br><br>
            <tr>
                <td class="td_left">电子邮箱:</td>
                <td class="td_right"> <input type="email" name="email" id="email" onblur="checkemail(this)" autofocus></td>
            </tr>
            <span id="span3" class="false"></span><br><br>
            <tr>
                <td class="td_left">类型:</td>
                <td class="td_right"> <input type="text" name="type" id="type" autofocus onblur="checktype(this)"></td>
            </tr>
            <span id="span6" class="false"></span> <br><br>
            <td colspan="2" align="center" >  <input type="submit" name="submit" id="submit" value="点击注册"> </td>
        </form>
    </div>
    <div class="rg_right">
        <p>已有账号?<a href="#">立即登录</a></p>
    </div>
</div>


</body>
</html>
