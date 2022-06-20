<%@ page import="cn.edu.zust.se.order.vo.T_order" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/6/18
  Time: 18:29
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
    <title>结算页面</title>
</head>
<body>
<div>
    <center><h1>欢迎来到佳运商品系统!</h1></center>
    <marquee bgcolor="gray" behavior="scroll">
        <font color="white" size="+1">欢迎来到佳运商品系统!</font>
    </marquee>
</div>
<h1>欢迎来到佳运商品结算页面</h1>
<p>您的购物车信息为</p>
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
        <th width="100">statue</th>
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
    <%
        int sum=0;
        for (int i=0;i<goods.size();i++){
            sum+=goods.get(i).getPrice()*goods.get(i).getAmount();
        }
    %>
</table></center>
<p>总金额为：<%=sum%></p>
<div>
    欢迎您的下一次购买
</div>

</body>
</html>
