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
    <link type="text/css" rel="stylesheet" href="/css/design.css">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8">
    <%@include file="header.jsp"%>
    <%@include file="footer.jsp"%>
    <title>用户管理</title>
</head>
<body>
<center><table border="1">
    <tr>
        <th width="100">id</th>
        <th width="100">login_name</th>
        <th width="100">password</th>
        <th width="100">name</th>
        <th width="100">mobile</th>
        <th width="100">email</th>
        <th width="100">type</th>
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
            }
            out.println("</tr>");
        }
    %>
</table></center>
<form action="/admin/add_user" method="post">
    id <input type="text" name="id"><br>
    login_name <input type="text" name="login_name"><br>
    password <input type="text" name="password"><br>
    name <input type="text" name="name"><br>
    mobile <input type="text" name="mobile"><br>
    email <input type="text" name="email"><br>
    type <input type="text" name="type"><br>
    <input type="submit" name="submit" value="点击添加用户"><br>
</form>
<form action="/admin/delete" method="post">
    id <input type="text" name="id"><br>
    <input type="submit" name="submit" value="点击删除该用户"><br>
</form>
<form action="/admin/update" method="post">
    id <input type="text" name="id"><br>
    login_name <input type="text" name="login_name"><br>
    password <input type="text" name="password"><br>
    name <input type="text" name="name"><br>
    mobile <input type="text" name="mobile"><br>
    email <input type="text" name="email"><br>
    type <input type="text" name="type"><br>
    <input type="submit" name="submit" value="点击修改用户信息"><br>
</form>
<a href="/admin/back4">返回</a>
</body>
</html>
