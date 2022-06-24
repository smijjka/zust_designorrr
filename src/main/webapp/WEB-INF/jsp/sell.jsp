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
    <link rel="stylesheet" href="/css/design.css">
    <link rel="stylesheet" href="/static/bootstrap-3.4.1-dist/css/bootstrap-theme.css">
    <link rel="stylesheet" href="/static/bootstrap-3.4.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/static/bootstrap-3.4.1-dist/css/bootstrap.css">
    <link rel="stylesheet" href="/css/card.css">
    <script src="/static/bootstrap-3.4.1-dist/js/bootstrap.min.js"></script>
    <%@include file="header.jsp"%>
    <%@include file="footer.jsp"%>
    <title>商品管理页面</title>
</head>
<body>

<center><table border="1">
    <caption>商品列表</caption>
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
                    out.println("<td align=center>"+" <a href=\"/seller/butdown\">下架</a>"+"</td");
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
<a href="/seller/back">返回</a>
</body>
</html>
