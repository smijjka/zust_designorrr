<%@ page import="cn.edu.zust.se.order.vo.T_order" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/6/18
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8">
    <title>购物车页面</title>
    <script type="text/javascript" src="/js/design.js"></script>
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
<table border="1">
    <tr>
        <th>修改商品数量</th>
        <th>购买</th>
    </tr>
    <tr>
        <td colspan="2"><form action="/admin/update3">
            id <input type="text" name="id"><br>
            amount <input type="text" name="amount"><br>
            <input type="submit" name="submit" value="修改"><br></form></td>
    </tr>
    <tr>
        <td colspan="2">
            付款购买
        </td>
    </tr>
    <tr>
        <td colspan="2"><a href="/admin/money1">购买</a> </td>
    </tr>
</table>
</body>
</html>
