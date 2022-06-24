<%@ page import="cn.edu.zust.se.order.vo.Goods" %>
<%@ page import="java.util.List" %>
<%@ page import="cn.edu.zust.se.order.vo.T_order" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/6/4
  Time: 16:33
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
    <title>订单管理页面</title>
</head>
<body>
<center><table border="1">
    <tr>
        <th width="100">id</th>
        <th width="100">goods_id</th>
        <th width="100">buyer_id</th>
        <th width="100">seller_id</th>
        <th width="100">price</th>
        <th width="100">order_time</th>
        <th width="100">submit_time</th>
        <th width="100">amount</th>
        <th width="100">status</th>
    </tr>
    <%
        List<T_order> goods= (List<T_order>) request.getSession().getAttribute("t_order");
        for (int i=0;i<goods.size();i++){
            out.println("<tr>");
            out.println("<td align=center>"+goods.get(i).getId()+"</td>");
            out.println("<td align=center>"+goods.get(i).getGoods_id()+"</td>");
            out.println("<td align=center>"+goods.get(i).getBuyer_id()+"</td>");
            out.println("<td align=center>"+goods.get(i).getSell_id()+"</td>");
            out.println("<td align=center>"+goods.get(i).getPrice()+"</td>");
            out.println("<td align=center>"+goods.get(i).getOrder_time()+"</td>");
            out.println("<td align=center>"+goods.get(i).getSubmit_time()+"</td>");
            out.println("<td align=center>"+goods.get(i).getAmount()+"</td>");
            out.println("<td align=center>"+goods.get(i).getStatus()+"</td>");
            out.println("</tr>");
        }
    %>
</table></center>
<form action="/admin/order_update" method="post">
    id <input type="text" name="id"><br>
    price <input type="text" name="price"><br>
    amount <input type="text" name="amount"><br>
    status <input type="text" name="status"><br>
    <input type="submit" name="submit" value="点击修改订单"><br>
</form>
<a href="/admin/admin_shopping">点击进入购物页面</a>

<a href="/admin/back4">返回</a>
</body>
</html>
