<%@ page import="cn.edu.zust.se.order.vo.UserVo" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/6/20
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <link type="text/css" rel="stylesheet" href="/css/others.css">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap-theme.css">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap.css">
    <script src="/bootstrap-3.4.1-dist/js/bootstrap.min.js"></script>
    <meta charset="UTF-8">
    <%@include file="header.jsp"%>
    <%@include file="footer.jsp"%>
    <title>用户管理</title>
</head>
<body>
<a href="/admin/back4"><h4>《--返回</h4></a>
<center><h3>用户列表</h3></center>
<center><table border="1" class="table-hover">
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
        List<UserVo> user1= (List<UserVo>) request.getSession().getAttribute("user2");
        for (int i=0;i<user1.size();i++){
            out.println("<tr>");
            out.println("<td align=center>"+user1.get(i).getId()+"</td>");
            out.println("<td align=center>"+user1.get(i).getLoginName()+"</td>");
            out.println("<td align=center>"+user1.get(i).getPassword()+"</td>");
            out.println("<td align=center>"+user1.get(i).getName()+"</td>");
            out.println("<td align=center>"+user1.get(i).getMobile()+"</td>");
            out.println("<td align=center>"+user1.get(i).getEmail()+"</td>");
            out.println("<td align=center>"+user1.get(i).getType()+"</td>");
            switch (i){
                case 0:
                    out.println("<td align=center>"+" <a href=\"/admin/buttondelete\">删除</a>"+"</td");
                    break;
                case 1:
                    out.println("<td align=center>"+" <a href=\"/admin/buttondelete1\">删除</a>"+"</td");
                    break;
                case 2:
                    out.println("<td align=center>"+" <a href=\"/admin/buttondelete2\">删除</a>"+"</td");
                    break;
                case 3:
                    out.println("<td align=center>"+" <a href=\"/admin/buttondelete3\">删除</a>"+"</td");
                    break;
                case 4:
                    out.println("<td align=center>"+" <a href=\"/admin/buttondelete4\">删除</a>"+"</td");
                    break;
                case 5:
                    out.println("<td align=center>"+" <a href=\"/admin/buttondelete5\">删除</a>"+"</td");
                    break;
                case 6:
                    out.println("<td align=center>"+" <a href=\"/admin/buttondelete6\">删除</a>"+"</td");
                    break;
                case 7:
                    out.println("<td align=center>"+" <a href=\"/admin/buttondelete7\">删除</a>"+"</td");
                    break;
                case 8:
                    out.println("<td align=center>"+" <a href=\"/admin/buttondelete8\">删除</a>"+"</td");
                    break;
                case 9:
                    out.println("<td align=center>"+" <a href=\"/admin/buttondelete9\">删除</a>"+"</td");
                    break;
                case 10:
                    out.println("<td align=center>"+" <a href=\"/admin/buttondelete10\">删除</a>"+"</td");
                    break;
                case 11:
                    out.println("<td align=center>"+" <a href=\"/admin/buttondelete11\">删除</a>"+"</td");
                    break;
                case 12:
                    out.println("<td align=center>"+" <a href=\"/admin/buttondelete12\">删除</a>"+"</td");
                    break;
                case 13:
                    out.println("<td align=center>"+" <a href=\"/admin/buttondelete13\">删除</a>"+"</td");
                    break;
                case 14:
                    out.println("<td align=center>"+" <a href=\"/admin/buttondelete14\">删除</a>"+"</td");
                    break;
                case 15:
                    out.println("<td align=center>"+" <a href=\"/admin/buttondelete15\">删除</a>"+"</td");
                    break;
                case 16:
                    out.println("<td align=center>"+" <a href=\"/admin/buttondelete16\">删除</a>"+"</td");
                    break;
                case 17:
                    out.println("<td align=center>"+" <a href=\"/admin/buttondelete17\">删除</a>"+"</td");
                    break;
                case 18:
                    out.println("<td align=center>"+" <a href=\"/admin/buttondelete18\">删除</a>"+"</td");
                    break;
                case 19:
                    out.println("<td align=center>"+" <a href=\"/admin/buttondelete19\">删除</a>"+"</td");
                    break;
                case 20:
                    out.println("<td align=center>"+" <a href=\"/admin/buttondelete20\">删除</a>"+"</td");
                    break;
            }
            out.println("</tr>");
        }
    %>
</table></center>

<br>
   <br>
      <br>
<center><h3>用户修改页面</h3></center>
<center>
<table border="1" class="table-condensed">
    <tr>
        <th><center>添加用户</center></th>
        <th><center>删除用户</center></th>
        <th><center>修改用户</center></th>
    </tr>
    <tr>
        <td ><form action="/admin/add_user" method="post">
            I&emsp;D&emsp;:<input type="text" name="id"><br>
            用户名:<input type="text" name="login_name"><br>
            密&emsp;码:<input type="text" name="password"><br>
            姓&emsp;名:<input type="text" name="name"><br>
            电&emsp;话:<input type="text" name="mobile"><br>
            邮&emsp;箱:<input type="text" name="email"><br>
            类&emsp;型:<input type="text" name="type"><br>
            <center><input type="submit" name="submit" class="btn btn-info" value="添加用户"><br></center></form></td>
        <td>
            <form action="/admin/delete" method="post">
                ID:<input type="text" name="id"><br>
                <center><input type="submit" name="submit" class="btn btn-info" value="删除用户"></center>
            </form></td>
        <td>
            <form action="/admin/update" method="post">
                I&emsp;D&emsp;:<input type="text" name="id"><br>
                用户名:<input type="text" name="login_name"><br>
                密&emsp;码:<input type="text" name="password"><br>
                姓&emsp;名:<input type="text" name="name"><br>
                电&emsp;话:<input type="text" name="mobile"><br>
                邮&emsp;箱:<input type="text" name="email"><br>
                类&emsp;型:<input type="text" name="type"><br>
                <center><input type="submit" name="submit" class="btn btn-info" value="修改用户"><br></center></form>
        </td>
    </tr>
</table>
</center>

</body>
</html>
