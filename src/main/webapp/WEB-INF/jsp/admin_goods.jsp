<%@ page import="cn.edu.zust.se.order.vo.Goods" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/6/4
  Time: 16:30
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
  <title>商品管理页面</title>
</head>
<body>
<p>以下为商品列表</p>
<center><table border="1">
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
          out.println("<td align=center>"+" <a href=\"/admin/butdown\">下架</a>"+"</td");
          break;
        case 1:
          out.println("<td align=center>"+" <a href=\"/admin/butdown1\">下架</a>"+"</td");
          break;
        case 2:
          out.println("<td align=center>"+" <a href=\"/admin/butdown2\">下架</a>"+"</td");
          break;
        case 3:
          out.println("<td align=center>"+" <a href=\"/admin/butdown3\">下架</a>"+"</td");
          break;
        case 4:
          out.println("<td align=center>"+" <a href=\"/admin/butdown4\">下架</a>"+"</td");
          break;
        case 5:
          out.println("<td align=center>"+" <a href=\"/admin/butdown5\">下架</a>"+"</td");
          break;
      }
      out.println("</tr>");
    }
  %>
</table></center>
下架商品
<div class="form-group">
  <form action="/admin/delete1" method="post">
    id <input type="text" name="id"><br>
    name <input type="text" name="name"><br>
    <input type="submit" name="submit" value="点击下架该商品"><br>
  </form>
</div>

修改商品信息
<div class="form-group">
  <form action="/admin/update1" method="post">
    id <input type="text" name="id"><br>
    name <input type="text" name="name"><br>
    price <input type="text" name="price"><br>
    num <input type="text" name="num"><br>
    status(1为正常出售) <input type="text" name="status"><br>
    <input type="submit" name="submit" value="点击修改商品信息"><br>
  </form>
</div>
</body>
</html>
