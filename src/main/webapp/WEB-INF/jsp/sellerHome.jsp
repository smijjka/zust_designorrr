<%@ page import="cn.edu.zust.se.order.vo.UserVo" %>
<%@ page import="static java.lang.System.out" %><%--
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
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link type="text/css" rel="stylesheet" href="/css/others.css">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap-theme.css">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap.css">
    <script src="/bootstrap-3.4.1-dist/js/bootstrap.min.js"></script>
    <meta charset="UTF-8">
    <title>商户首页</title>
    <%@include file="header.jsp"%>
    <%@include file="footer.jsp"%>
</head>
<body link="#00ffff" alink="gray" vlink="black">
<h1 align="center">seller home</h1>
<div><%
    UserVo user= (UserVo) request.getSession().getAttribute("user");
%>
</div>
<p align="center">欢迎商户<%=user.getLoginName()%>来到商户首页！</p>
<div>
    <table  border="1" align="center" class="table-condensed" width="80%" bgcolor="white">
        <caption><%=user.getLoginName()%>商户信息</caption>
        <tr>
            <th rowspan="2" align="center"><img src="/img/头像1.png" height="300" width="300"></img></th>
            <th>姓名</th>
            <td align="center"><%=user.getLoginName()%></td>
            <th>id</th>
            <td align="center"><%=user.getId()%></td>
        </tr>
        <tr>
            <th>mobile</th>
            <td align="center"><%=user.getMobile()%></td>
            <th>email</th>
            <td align="center"><%=user.getEmail()%>></td>
        </tr>
        <tr>
            <th colspan="5">兴趣爱好</th>
        </tr>
        <tr>
            <td width="300" align="center">编程</td>
            <td align="center">看电影</td>
            <td colspan="2" align="center">看武侠小说</td>
            <td align="center">打乒乓球</td>
        </tr>
        <tr>
            <th colspan="5">商铺管理</th>
        </tr>

        <tr>
            <td colspan="5" align="center"><a href="/seller/selljsp">点击进入商品管理页面</a></td>
        </tr>
    </table>
</div>
</body>
</html>
