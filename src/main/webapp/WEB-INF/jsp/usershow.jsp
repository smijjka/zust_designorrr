<%@ page import="cn.edu.zust.se.order.vo.T_order" %>
<%@ page import="java.util.List" %>
<%@ page import="cn.edu.zust.se.order.vo.UserVo" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/6/18
  Time: 19:01
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
    <%@include file="header.jsp"%>
    <%@include file="footer.jsp"%>
    <title>用户列表</title>
</head>
<body>
<a href="/admin/back4"><h4>《--返回</h4></a>
<center><h3>用户清单</h3></center>
<center><table border="1" class="table-hover" bgcolor="white">
    <tr>
        <th width="100">ID</th>
        <th width="100">用户名</th>
        <th width="100">密码</th>
        <th width="100">姓名</th>
        <th width="100">联系方式</th>
        <th width="100">电子邮箱</th>
        <th width="100">用户类型</th>
    </tr>
    <%
        List<UserVo> user1= (List<UserVo>) request.getSession().getAttribute("user1");
        for (int i=0;i<user1.size();i++){
            out.println("<tr>");
            out.println("<td align=center>"+user1.get(i).getId()+"</td>");
            out.println("<td align=center>"+user1.get(i).getLoginName()+"</td>");
            out.println("<td align=center>"+user1.get(i).getPassword()+"</td>");
            out.println("<td align=center>"+user1.get(i).getName()+"</td>");
            out.println("<td align=center>"+user1.get(i).getMobile()+"</td>");
            out.println("<td align=center>"+user1.get(i).getEmail()+"</td>");
            out.println("<td align=center>"+user1.get(i).getType()+"</td>");
            out.println("</tr>");
        }
    %>
</table></center>

</body>
</html>
