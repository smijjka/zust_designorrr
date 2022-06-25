<%@ page import="cn.edu.zust.se.order.vo.Goods" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/5/31
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8">
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <link type="text/css" rel="stylesheet" href="/css/others.css">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap-theme.css">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap.css">
    <script src="/bootstrap-3.4.1-dist/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/css/card.css">
    <%@include file="header.jsp"%>
    <%@include file="footer.jsp"%>
    <title>商品管理页面</title>
</head>
<body>
<div class="whitebox">
<a href="/seller/back"><h4>《--返回</h4> </a>
<center><table border="1" class="table-hover" bgcolor="white">
    <h3>商品列表</h3>
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
                    out.println("<td align=center>"+" <a  href=\"/seller/butdown\">下架</a>"+"</td");
                    break;
                case 1:
                    out.println("<td align=center>"+" <a href=\"/seller/butdown1\">下架</a>"+"</td");
                    break;
                case 2:
                    out.println("<td align=center>"+" <a href=\"/seller/butdown2\">下架</a>"+"</td");
                    break;
                case 3:
                    out.println("<td align=center>"+" <a href=\"/seller/butdown3\">下架</a>"+"</td");
                    break;
                case 4:
                    out.println("<td align=center>"+" <a href=\"/seller/butdown4\">下架</a>"+"</td");
                    break;
                case 5:
                    out.println("<td align=center>"+" <a href=\"/seller/butdown5\">下架</a>"+"</td");
                    break;
                case 6:
                    out.println("<td align=center>"+" <a href=\"/seller/butdown6\">下架</a>"+"</td");
                    break;
                case 7:
                    out.println("<td align=center>"+" <a href=\"/seller/butdown7\">下架</a>"+"</td");
                    break;
                case 8:
                    out.println("<td align=center>"+" <a href=\"/seller/butdown8\">下架</a>"+"</td");
                    break;
                case 9:
                    out.println("<td align=center>"+" <a href=\"/seller/butdown9\">下架</a>"+"</td");
                    break;
                case 10:
                    out.println("<td align=center>"+" <a href=\"/seller/butdown10\">下架</a>"+"</td");
                    break;
                case 11:
                    out.println("<td align=center>"+" <a href=\"/seller/butdown11\">下架</a>"+"</td");
                    break;
                case 12:
                    out.println("<td align=center>"+" <a href=\"/seller/butdown12\">下架</a>"+"</td");
                    break;
                    case 13:
                    out.println("<td align=center>"+" <a href=\"/seller/butdown13\">下架</a>"+"</td");
                    break;
                    case 14:
                    out.println("<td align=center>"+" <a href=\"/seller/butdown14\">下架</a>"+"</td");
                    break;
                    case 15:
                    out.println("<td align=center>"+" <a href=\"/seller/butdown15\">下架</a>"+"</td");
                    break;
                case 16:
                    out.println("<td align=center>"+" <a href=\"/seller/butdown16\">下架</a>"+"</td");
                    break;
                case 17:
                    out.println("<td align=center>"+" <a href=\"/seller/butdown17\">下架</a>"+"</td");
                    break;
                case 18:
                    out.println("<td align=center>"+" <a href=\"/seller/butdown18\">下架</a>"+"</td");
                    break;
                case 19:
                    out.println("<td align=center>"+" <a href=\"/seller/butdown19\">下架</a>"+"</td");
                    break;
                case 20:
                    out.println("<td align=center>"+" <a href=\"/seller/butdown20\">下架</a>"+"</td");
                    break;



            }
            out.println("</tr>");
        }
    %>
</table></center>
<div class="father">
    <div class="son">
        <div class="container">
            <!-- 堆叠表单 -->
            <p>上架清单</p>
            <form class="col-md-3" action="/seller/up_sho" method="post">
                <!-- 输入框 -->
                <div class="form-group">
                    <label for="id">ID：</label>
                    <input type="text" class="form-control" name="id" id="id">
                </div>
                <div class="form-group">
                    <label for="name">商品名称：</label>
                    <input type="text" class="form-control" id="name" name="name">
                </div>
                <div class="form-group">
                    <label for="category">种类：</label>
                    <input type="text" class="form-control" id="category" name="category">
                </div>
                <div class="form-group">
                    <label for="price">价格：</label>
                    <input type="text" class="form-control" id="price" name="price">
                </div>
                <div class="form-group">
                    <label for="num">数量：</label>
                    <input type="text" class="form-control" id="num" name="num">
                </div>
                <div class="form-group">
                    <label for="status">状态(1为正常出售)：</label>
                    <input type="text" class="form-control" id="status" name="status">
                </div>
                <input type="submit" name="submit" class="btn btn-info" value="点击上架" ></input>
            </form>
        </div>
    </div>


    <div class="son2">
        <div class="container">
            <!-- 堆叠表单 -->
            <p>下架清单</p>
            <form class="col-md-3" action="/seller/down_sho" method="post">
                <!-- 输入框 -->
                <div class="form-group">
                    <label for="id1">ID：</label>
                    <input type="text" class="form-control" name="id" id="id1">
                </div>
                <div class="form-group">
                    <label for="name1">商品名称：</label>
                    <input type="text" class="form-control" id="name1" name="name">
                </div>
                <input type="submit" name="submit" class="btn btn-info" value="点击下架" ></input>
            </form>
        </div>
    </div>

    <div class="son1">
        <div class="container">
            <!-- 堆叠表单 -->
            <p>修改商品清单</p>
            <form class="col-md-3" action="/seller/update_sho" method="post">
                <!-- 输入框 -->
                <div class="form-group">
                    <label for="id2">ID：</label>
                    <input type="text" class="form-control" name="id" id="id2">
                </div>
                <div class="form-group">
                    <label for="name2">商品名称：</label>
                    <input type="text" class="form-control" id="name2" name="name">
                </div>
                <div class="form-group">
                    <label for="category2">种类：</label>
                    <input type="text" class="form-control" id="category2" name="category">
                </div>
                <div class="form-group">
                    <label for="price2">价格：</label>
                    <input type="text" class="form-control" id="price2" name="price">
                </div>
                <div class="form-group">
                    <label for="num2">数量：</label>
                    <input type="text" class="form-control" id="num2" name="num">
                </div>
                <div class="form-group">
                    <label for="status2">状态(1为正常出售)：</label>
                    <input type="text" class="form-control" id="status2" name="status">
                </div>
                <input type="submit" name="submit" class="btn btn-info" value="点击修改" ></input>
            </form>
        </div>
    </div>

</div>
</div>
</body>
</html>
