<%@ page import="cn.edu.zust.se.order.vo.Goods" %>
<%@ page import="java.util.List" %>

<%--
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
  <title>商品管理页面</title>
</head>
<body>
<a href="/admin/back4"><h4>《--返回</h4></a>
<center><h3>商品清单</h3></center>
<center><table border="1" class=table-hover>
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
        case 6:
          out.println("<td align=center>"+" <a href=\"/admin/butdown6\">下架</a>"+"</td");
          break;
        case 7:
          out.println("<td align=center>"+" <a href=\"/admin/butdown7\">下架</a>"+"</td");
          break;
        case 8:
          out.println("<td align=center>"+" <a href=\"/admin/butdown8\">下架</a>"+"</td");
          break;
        case 9:
          out.println("<td align=center>"+" <a href=\"/admin/butdown9\">下架</a>"+"</td");
          break;
        case 10:
          out.println("<td align=center>"+" <a href=\"/admin/butdown10\">下架</a>"+"</td");
          break;
        case 11:
          out.println("<td align=center>"+" <a href=\"/admin/butdown11\">下架</a>"+"</td");
          break;
        case 12:
          out.println("<td align=center>"+" <a href=\"/admin/butdown12\">下架</a>"+"</td");
          break;
        case 13:
          out.println("<td align=center>"+" <a href=\"/admin/butdown13\">下架</a>"+"</td");
          break;
        case 14:
          out.println("<td align=center>"+" <a href=\"/admin/butdown14\">下架</a>"+"</td");
          break;
        case 15:
          out.println("<td align=center>"+" <a href=\"/admin/butdown15\">下架</a>"+"</td");
          break;
        case 16:
          out.println("<td align=center>"+" <a href=\"/admin/butdown16\">下架</a>"+"</td");
          break;
        case 17:
          out.println("<td align=center>"+" <a href=\"/admin/butdown17\">下架</a>"+"</td");
          break;
        case 18:
          out.println("<td align=center>"+" <a href=\"/admin/butdown18\">下架</a>"+"</td");
          break;
        case 19:
          out.println("<td align=center>"+" <a href=\"/admin/butdown19\">下架</a>"+"</td");
          break;
        case 20:
          out.println("<td align=center>"+" <a href=\"/admin/butdown20\">下架</a>"+"</td");
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
<center><table border="1" class="table-condensed">
  <tr>
    <th><center>下架商品</center></th>
    <th><center>修改商品</center></th>
  </tr>
  <tr>
    <td ><form action="/admin/delete1" method="post">
      I&emsp;D&emsp;:<input type="text" name="id"><br>
      名&emsp;称:<input type="text" name="name"><br>
      <center><input type="submit" name="submit" class="btn btn-info" value="下架商品"><br></center>
      </form>
    </td>
    <td><form action="/admin/update1" method="post">
      I&emsp;D&emsp;:<input type="text" name="id"><br>
      名&emsp;称:<input type="text" name="name"><br>
      价&emsp;格:<input type="text" name="price"><br>
      数&emsp;量:<input type="text" name="num"><br>
      状&emsp;态:<input type="text" name="status"><br>
      <center><input type="submit" name="submit" class="btn btn-info" value="修改商品"></center></form></td>
  </tr>
</table></center>
</body>
</html>
