<%@ taglib prefix="display" uri="http://jakarta.apache.org/taglibs/standard/permittedTaglibs" %>
<%@ page import="cn.edu.zust.se.order.vo.Goods" %>
<%@ page import="java.util.List" %>
<%@ page import="cn.edu.zust.se.order.vo.UserVo" %><%--
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
    <script src="/layui/layui.js"></script>
    <link rel="stylesheet" href="/layui/css/layui.css">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap-theme.css">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap.css">
    <script src="/bootstrap-3.4.1-dist/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/css/prc.css">
    <script src="/js/prc.js"></script>


</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin" >
    <div class="layui-header">
        <div class="layui-logo">浙江科技业务管理平台</div>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <%
                    UserVo user= (UserVo) request.getSession().getAttribute("user");
                %>
                欢迎光临，商户<%=user.getLoginName()%>
            </li>
            <li class="layui-nav-item"><a href="/users/login">安全退出</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧垂直导航区域-->
            <ul class="layui-nav layui-nav-tree" lay-filter="test">
                <li class="layui-nav-item">
                    <p>商品管理</p>
                    <dd>
                        <a href="/seller/selljsp1" data-id="1" data-title="上架商品" data-url="index.php?&a=adminLogList"
                           class="site-demo-active" data-type="tabAdd"  >上架商品</a></dd>
                    </dd>
                    <dd>
                        <a href="/seller/selljsp" data-id="2" data-title="下架商品" data-url="index.php?&a=adminLogList"
                           class="site-demo-active" data-type="tabAdd">下架商品</a></dd>
                    </dd>
                    <dd><a href="/seller/selljsp2" data-id="2" data-title="更新商品" data-url="index.php?&a=adminLogList"
                           class="site-demo-active" data-type="tabAdd">更新商品</a></dd>
                    <dd><a href="/seller/showjsp" data-id="2" data-title="查看已上架商品" data-url="index.php?&a=adminLogList"
                           class="site-demo-active" data-type="tabAdd">查看已上架商品</a></dd>
                    </dl>
                </li>
                <%-- <li class="layui-nav-item">
                     <a href="javascript:;">系统管理</a>
                     <dl class="layui-nav-child">
                         <dd><a href="javascript:;">支付API设置</a></dd>
                         <dd><a href="javascript:;">公告设置</a></dd>
                         <dd><a href="javascript:;">控制台</a></dd>
                 </li>--%>
            </ul>
        </div>
    </div>

    <!--tab标签-->
    <div class="layui-tab" lay-filter="demo" lay-allowclose="true" style="margin-left: 200px;">
        <ul class="layui-tab-title"></ul>
        <div class="layui-tab-content"></div>
    </div>

    <div class="layui-footer" style="text-align:center;">
        <!-- 底部固定区域 -->
        © sunway.tk 浙江科技业务管理平台
    </div>
</div>



<div class="div"><center><table border="1" class="table-hover" bgcolor="white" width="100%">

    <tr style="background-color:gray">
        <th  width="100">ID</th>
        <th width="100">名称</th>
        <th width="120">种类</th>
        <th width="120">商户</th>
        <th width="120">价格</th>
        <th width="120">数量</th>
        <th width="200">上架时间</th>
        <th width="200">下架时间</th>
        <th width="200">创建时间</th>
        <th width="150">状态</th>
    </tr>
    <%
        List<Goods> goods= (List<Goods>) request.getSession().getAttribute("goods");
        for (int i=0;i<goods.size();i++) {
            out.println("<tr>");
            out.println("<td align=center>" + goods.get(i).getId() + "</td>");
            out.println("<td align=center>" + goods.get(i).getName() + "</td>");
            out.println("<td align=center>" + goods.get(i).getCategory() + "</td>");
            out.println("<td align=center>" + goods.get(i).getSell_id() + "</td>");
            out.println("<td align=center>" + goods.get(i).getPrice() + "</td>");
            out.println("<td align=center>" + goods.get(i).getNum() + "</td>");
            out.println("<td align=center>" + goods.get(i).getUp_time() + "</td>");
            out.println("<td align=center>" + goods.get(i).getDown_time() + "</td>");
            out.println("<td align=center>" + goods.get(i).getCreate_time() + "</td>");
            out.println("<td align=center>" + goods.get(i).getStatus() + "</td>");
            out.println("</tr>");
        }
    %>
</table></center>
    <div id="location">
<%
   // out.println("<td align=center>"+"<button onclick=\"add()\" class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/seller/butup\">上架</a>"+"</td");
    out.println("<td align=center>"+"<button onclick=\"add1()\" class=\"layui-btn layui-btn-sm layui-btn-danger\">上架</a>"+"</td");
%>
    </div></div>

            <!-- 堆叠表单 -->

            <form class="col-md-3" id="create_table_from" action="/seller/up_sho" method="post" lay-filter="create_table_from" style="display: none;">
                <!-- 输入框 -->
                <div class="form-group">
                    <label for="id">ID：</label>
                    <input type="text" class="form-control1" name="id" id="id">
                </div>
                <div class="form-group">
                    <label >商品名称：</label>
                    <input type="text" class="form-control1" id="name" name="name" autofocus>
                </div>
                <div class="form-group">
                    <label for="category">种类：</label>
                    <input type="text" class="form-control1" id="category" name="category">
                </div>
                <div class="form-group">
                    <label for="price">价格：</label>
                    <input type="text" class="form-control1" id="price" name="price">
                </div>
                <div class="form-group">
                    <label for="num">数量：</label>
                    <input type="text" class="form-control1" id="num" name="num">
                </div>
                <div class="form-group">
                    <label for="status">状态(1为正常出售)：</label>
                    <input type="text" class="form-control1" id="status" name="status">
                </div>
                <input type="submit" name="submit" class="btn btn-info" value="点击上架" onclick="success1()">
            </form>


</body>
</html>
