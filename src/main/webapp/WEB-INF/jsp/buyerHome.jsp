<%@ page import="cn.edu.zust.se.order.vo.UserVo" %><%--
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
    <title>用户首页</title>
    <link type="text/css" rel="stylesheet" href="/css/others.css">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap-theme.css">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap.css">
    <script src="/bootstrap-3.4.1-dist/js/bootstrap.min.js"></script>
    <%@include file="header.jsp"%>
    <%@include file="footer.jsp"%>
</head>
<body link="#00ffff" alink="gray" vlink="black">
<h1 align="center">seller home</h1>
<div><%
    UserVo user= (UserVo) request.getSession().getAttribute("user");
%>
</div>
<p align="center">欢迎用户<%=user.getLoginName()%>来到用户首页！</p>


<div >
    <table  width="80%"  border="1" align="center" class="table-condensed" bgcolor="white">
        <caption><%=user.getLoginName()%>用户信息</caption>
        <tr>
            <th rowspan="2" align="center"><img src="/img/头像2.jpeg" width="300" height="300"></img></th>
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
            <td align="center">看小说</td>
            <td  align="center">看科幻电影</td>
            <td align="center">打篮球</td>
            <td align="center">唱歌</td>
        </tr>
        <tr>
            <th colspan="5">商品清单</th>
        </tr>

        <tr>
            <td colspan="5" align="center"><a href="/buyer/showjsp">点击查看商品清单</a><br></td>
        </tr>
        <tr>
            <th colspan="5">购物</th>
        </tr>

        <tr>
            <td colspan="5" align="center"><a href="/buyer/shoppingjsp">点击进入购物页面</a></td>
        </tr>
    </table>
</div>
</body>
</html>
