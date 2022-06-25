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
    <link type="text/css" rel="stylesheet" href="/css/others.css">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap-theme.css">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap.css">
    <script src="/bootstrap-3.4.1-dist/js/bootstrap.min.js"></script>
    <meta charset="UTF-8">
    <%@include file="header.jsp"%>
    <%@include file="footer.jsp"%>
    <title>购物页面</title>
</head>
<body>
<a href="/buyer/back1"><h4>《--返回</h4></a>
<center><h3>商品清单</h3></center>
<center><table border="1" class="table-hover" bgcolor="white">
    <tr>
        <th width="100">ID</th>
        <th width="100">名称</th>
        <th width="100">种类</th>
        <th width="100">商户</th>
        <th width="100">价格</th>
        <th width="100">数量</th>
        <th width="100">上架时间</th>
        <th width="100">下架时间</th>
        <th width="100">创建时间</th>
        <th width="100">状态</th>
        <th width="100">操作</th>
    </tr>

    <%
        List<Goods> goods= (List<Goods>) request.getSession().getAttribute("goods");

        for (int i=0;i<goods.size();i++){
            int id=goods.get(i).getId();
            String name=goods.get(i).getName();
            String category=goods.get(i).getCategory();
             goods.get(i).getSell_id();
            goods.get(i).getPrice();
            goods.get(i).getNum();
            goods.get(i).getUp_time();
            goods.get(i).getDown_time();
            goods.get(i).getCreate_time();
            goods.get(i).getStatus();
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
            switch (i){
                case 0:
                    out.println("<td align=center>"+" <a href=\"/buyer/buttonadd\">添加</a>"+"</td");
                    break;
                case 1:
                    out.println("<td align=center>"+" <a href=\"/buyer/buttonadd1\">添加</a>"+"</td");
                    break;
                case 2:
                    out.println("<td align=center>"+" <a href=\"/buyer/buttonadd2\">添加</a>"+"</td");
                    break;
                case 3:
                    out.println("<td align=center>"+" <a href=\"/buyer/buttonadd3\">添加</a>"+"</td");
                    break;
                case 4:
                    out.println("<td align=center>"+" <a href=\"/buyer/buttonadd4\">添加</a>"+"</td");
                    break;
                case 5:
                    out.println("<td align=center>"+" <a href=\"/buyer/buttonadd5\">添加</a>"+"</td");
                    break;
                case 6:
                    out.println("<td align=center>"+" <a href=\"/buyer/buttonadd6\">添加</a>"+"</td");
                    break;
                case 7:
                    out.println("<td align=center>"+" <a href=\"/buyer/buttonadd7\">添加</a>"+"</td");
                    break;
                case 8:
                    out.println("<td align=center>"+" <a href=\"/buyer/buttonadd8\">添加</a>"+"</td");
                    break;
                case 9:
                    out.println("<td align=center>"+" <a href=\"/buyer/buttonadd9\">添加</a>"+"</td");
                    break;
                case 10:
                    out.println("<td align=center>"+" <a href=\"/buyer/buttonadd10\">添加</a>"+"</td");
                    break;
                case 11:
                    out.println("<td align=center>"+" <a href=\"/buyer/buttonadd11\">添加</a>"+"</td");
                    break;
                case 12:
                    out.println("<td align=center>"+" <a href=\"/buyer/buttonadd12\">添加</a>"+"</td");
                    break;
                case 13:
                    out.println("<td align=center>"+" <a href=\"/buyer/buttonadd13\">添加</a>"+"</td");
                    break;
                case 14:
                    out.println("<td align=center>"+" <a href=\"/buyer/buttonadd14\">添加</a>"+"</td");
                    break;
                case 15:
                    out.println("<td align=center>"+" <a href=\"/buyer/buttonadd15\">添加</a>"+"</td");
                    break;
                case 16:
                    out.println("<td align=center>"+" <a href=\"/buyer/buttonadd16\">添加</a>"+"</td");
                    break;
                case 17:
                    out.println("<td align=center>"+" <a href=\"/buyer/buttonadd17\">添加</a>"+"</td");
                    break;
                case 18:
                    out.println("<td align=center>"+" <a href=\"/buyer/buttonadd18\">添加</a>"+"</td");
                    break;
                case 19:
                    out.println("<td align=center>"+" <a href=\"/buyer/buttonadd19\">添加</a>"+"</td");
                    break;
                case 20:
                    out.println("<td align=center>"+" <a href=\"/buyer/buttonadd20\">添加</a>"+"</td");
                    break;
            }

            out.println("</tr>");

        }
    %>
</table></center>
<center><h3>购物车清单</h3></center>
<center><table border="1" class="table-condensed" bgcolor="white">
    <tr>
        <th>添加购物车</th>
        <th>清空商品</th>
    </tr>
    <tr>
        <td ><form action="/buyer/add_sho" method="post">
            订单ID:<input type="text" name="id"><br>
            商品ID:<input type="text" name="goods_id"><br>
            商户ID:<input type="text" name="seller_id"><br>
            数&emsp;量:<input type="text" name="amount"><br>
            状&emsp;态:<input type="text" name="status"><br>
            <center><input type="submit" name="submit" class="btn btn-info" value="点击添加购物清单"></center><br>
        </form></td>
        <td><form action="/buyer/empty" method="post">

            <input type="submit" name="submit" class="btn btn-info" value="点击清空购物车"></form></td>
    </tr>
    <tr>
        <td align="center" colspan="2"><a href="/buyer/show">查看购物车</a>  </td>
    </tr>
</table></center>
</form>
</body>
</html>
