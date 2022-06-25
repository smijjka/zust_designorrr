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
    <title>结算页面</title>
</head>
<body>
<div>
</div>
<a href="/buyer/show"><h4>《--返回</h4></a>
<center><h3>商品结算页面</h3></center>
<center><p>您的购物车信息为</p></center>
<center><table border="1" class="table-hover" bgcolor="white">
    <tr>
        <th width="100">ID</th>
        <th width="100">商品ID</th>
        <th width="100">买家ID</th>
        <th width="100">商户ID</th>
        <th width="100">价格</th>
        <th width="100">下单时间</th>
        <th width="100">提交时间</th>
        <th width="100">数量</th>
        <th width="100">状态</th>
    </tr>
    <%
        List<T_order> t_order= (List<T_order>) request.getSession().getAttribute("t_order");
        for (int i=0;i<t_order.size();i++){
            out.println("<tr>");
            out.println("<td align=center>"+t_order.get(i).getId()+"</td>");
            out.println("<td align=center>"+t_order.get(i).getGoods_id()+"</td>");
            out.println("<td align=center>"+t_order.get(i).getBuyer_id()+"</td>");
            out.println("<td align=center>"+t_order.get(i).getSell_id()+"</td>");
            out.println("<td align=center>"+t_order.get(i).getPrice()+"</td>");
            out.println("<td align=center>"+t_order.get(i).getOrder_time()+"</td>");
            out.println("<td align=center>"+t_order.get(i).getSubmit_time()+"</td>");
            out.println("<td align=center>"+t_order.get(i).getAmount()+"</td>");
            out.println("<td align=center>"+t_order.get(i).getStatus()+"</td>");
            out.println("</tr>");
        }
    %>
    <%
        int sum=0;
        for (int i=0;i<t_order.size();i++){
            sum+=t_order.get(i).getPrice()*t_order.get(i).getAmount();
        }
    %>
</table></center>
 <br>
    <br>
        <br>
<center><p>总金额为：<%=sum%></p></center>
<div>
    <center>欢迎您的下一次购买</center>
</div>

</body>
</html>
