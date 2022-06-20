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
    <meta charset="UTF-8">
    <title>用户列表</title>
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
