<%@ page import="cn.edu.zust.se.order.vo.T_order" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/6/18
  Time: 16:39
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
  <link type="text/css" rel="stylesheet" href="/css/others.css">
  <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap-theme.css">
  <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap.min.css">
  <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap.css">
  <script src="/bootstrap-3.4.1-dist/js/bootstrap.min.js"></script>
  <%@include file="header.jsp"%>
  <%@include file="footer.jsp"%>
</head>
<body>
<a href="/buyer/back2"><h4>《--返回</h4></a>
<center><h3>购物车</h3></center>
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
    <th width="100">操作</th>
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
      switch (i){
        case 0:
          out.println("<td align=center>"+" <a href=\"/buyer/buttonupdate\">删除</a>"+"</td");
          break;
        case 1:
          out.println("<td align=center>"+" <a href=\"/buyer/buttonupdate1\">删除</a>"+"</td");
          break;
        case 2:
          out.println("<td align=center>"+" <a href=\"/buyer/buttonupdate2\">删除</a>"+"</td");
          break;
        case 3:
          out.println("<td align=center>"+" <a href=\"/buyer/buttonupdate3\">删除</a>"+"</td");
          break;
        case 4:
          out.println("<td align=center>"+" <a href=\"/buyer/buttonupdate4\">删除</a>"+"</td");
          break;
        case 5:
          out.println("<td align=center>"+" <a href=\"/buyer/buttonupdate5\">删除</a>"+"</td");
          break;
        case 6:
          out.println("<td align=center>"+" <a href=\"/buyer/buttonupdate6\">删除</a>"+"</td");
          break;
        case 7:
          out.println("<td align=center>"+" <a href=\"/buyer/buttonupdate7\">删除</a>"+"</td");
          break;
        case 8:
          out.println("<td align=center>"+" <a href=\"/buyer/buttonupdate8\">删除</a>"+"</td");
          break;
        case 9:
          out.println("<td align=center>"+" <a href=\"/buyer/buttonupdate9\">删除</a>"+"</td");
          break;
        case 10:
          out.println("<td align=center>"+" <a href=\"/buyer/buttonupdate10\">删除</a>"+"</td");
          break;
        case 11:
          out.println("<td align=center>"+" <a href=\"/buyer/buttonupdate11\">删除</a>"+"</td");
          break;
          case 12:
          out.println("<td align=center>"+" <a href=\"/buyer/buttonupdate12\">删除</a>"+"</td");
          break;
        case 13:
          out.println("<td align=center>"+" <a href=\"/buyer/buttonupdate13\">删除</a>"+"</td");
          break;
        case 14:
          out.println("<td align=center>"+" <a href=\"/buyer/buttonupdate14\">删除</a>"+"</td");
          break;
          case 15:
          out.println("<td align=center>"+" <a href=\"/buyer/buttonupdate15\">删除</a>"+"</td");
          break;
          case 16:
          out.println("<td align=center>"+" <a href=\"/buyer/buttonupdate16\">删除</a>"+"</td");
          break;
          case 17:
          out.println("<td align=center>"+" <a href=\"/buyer/buttonupdate17\">删除</a>"+"</td");
          break;
        case 18:
          out.println("<td align=center>"+" <a href=\"/buyer/buttonupdate18\">删除</a>"+"</td");
          break;
        case 19:
          out.println("<td align=center>"+" <a href=\"/buyer/buttonupdate19\">删除</a>"+"</td");
          break;
        case 20:
          out.println("<td align=center>"+" <a href=\"/buyer/buttonupdate20\">删除</a>"+"</td");
          break;

      }

      out.println("</tr>");
    }
  %>
</table></center>
<br>
   <br>
      <br>
<center><h3>商品修改界面</h3></center>
<center>
<table border="1" class="table-condensed">
  <tr>
    <th><center>修改商品数量</center></th>
    <th><center>删除商品</center></th>
  </tr>
  <tr>
    <td ><form action="/buyer/update">
        ID:<input type="text" name="id"><br>
        数&emsp;量:<input type="text" name="amount"><br>
      <center><input type="submit" name="submit" class="btn btn-info" value="修改"><br></center></form></td>
    <td>
      <form action="/buyer/delete_sho" method="post">
        商品ID:<input type="text" name="id"><br>
        商户ID:<input type="text" name="seller_id"><br>
        买家ID:<input type="text" name="buyer_id"><br>
        <center><input type="submit" name="submit" class="btn btn-info" value="点击删除商品"></center>
      </form></td>
  </tr>

  <tr>
    <td colspan="2">
      <center>付款购买</center>
    </td>
  </tr>
  <tr>
    <td colspan="2"><center><a href="/buyer/money">购买</a> </center></td>
  </tr>
</table>
</center>

</form>
</body>
</html>
