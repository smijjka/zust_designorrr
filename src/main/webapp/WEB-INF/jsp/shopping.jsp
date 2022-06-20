<%@ page import="cn.edu.zust.se.order.vo.Goods" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/5/31
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8">
    <title>购物页面</title>
</head>
<body>
<p>以下为商品列表</p>
<center><table border="1">
    <tr>
        <th width="100">id</th>
        <th width="100">name</th>
        <th width="100">category</th>
        <th width="100">seller_id</th>
        <th width="100">price</th>
        <th width="100">num</th>
        <th width="100">up_time</th>
        <th width="100">down_time</th>
        <th width="100">create_time</th>
        <th width="100">status</th>
    </tr>
    <%
        List<Goods> goods= (List<Goods>) request.getSession().getAttribute("goods");
        for (int i=0;i<goods.size();i++){
            out.println("<tr>");
            out.println("<td align=center>"+goods.get(i).getId()+"</td>");
            out.println("<td align=center>"+goods.get(i).getName()+"</td>");
            out.println("<td align=center>"+goods.get(i).getCategory()+"</td>");
            out.println("<td align=center>"+goods.get(i).getSell_id()+"</td>");
            out.println("<td align=center>"+goods.get(i).getPrice()+"</td>");
            out.println("<td align=center>"+goods.get(i).getNum()+"</td>");
            out.println("<td align=center>"+goods.get(i).getUp_time()+"</td>");
            out.println("<td align=center>"+goods.get(i).getDown_time()+"</td>");
            out.println("<td align=center>"+goods.get(i).getCreate_time()+"</td>");
            out.println("<td align=center>"+goods.get(i).getStatus()+"</td>");
            out.println("</tr>");
        }
    %>
</table></center>
<p>以下为购物车页面</p>
<table border="1">
    <tr>
        <th>添加购物车</th>
        <th>清空商品</th>
    </tr>
    <tr>
        <td ><form action="/buyer/add_sho" method="post">
            id <input type="text" name="id"><br>
            goods_id <input type="text" name="goods_id"><br>
            seller_id <input type="text" name="seller_id"><br>
            amount <input type="text" name="amount"><br>
            status <input type="text" name="status"><br>
            <input type="submit" name="submit" value="点击添加购物清单"><br>
        </form></td>
        <td><form action="/buyer/empty" method="post">

            <input type="submit" name="submit" value="点击清空购物车"></form></td>
    </tr>
    <tr>
        <td align="center" colspan="2"><a href="/buyer/show">查看购物车</a>  </td>
    </tr>
</table>


</form>
</body>
</html>
