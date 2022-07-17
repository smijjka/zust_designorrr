<%@ page import="cn.edu.zust.se.order.vo.Report" %>
<%@ page import="java.util.List" %>
<%@ page import="cn.edu.zust.se.order.vo.UserVo" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/7/13
  Time: 13:59
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
                欢迎光临，管理员<%=user.getLoginName()%>
            </li>
            <li class="layui-nav-item"><a href="/users/login">安全退出</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧垂直导航区域-->
            <ul class="layui-nav layui-nav-tree" lay-filter="test">
                <li class="layui-nav-item">
                    <p>管理员</p>
                    <dd>
                        <a href="/admin/admin_users" data-id="1" data-title="用户管理" data-url="index.php?&a=adminLogList"
                           class="site-demo-active" data-type="tabAdd"  >用户管理</a></dd>
                    </dd>
                    <dd>
                        <a href="/admin/admin_goods" data-id="2" data-title="商品管理" data-url="index.php?&a=adminLogList"
                           class="site-demo-active" data-type="tabAdd">商品管理</a></dd>
                    </dd>
                    <dd><a href="/admin/admin_item" data-id="2" data-title="订单管理" data-url="index.php?&a=adminLogList"
                           class="site-demo-active" data-type="tabAdd">订单管理</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a >查询</a>
                    <dl class="layui-nav-child"> <!-- 二级菜单 -->
                        <dd><a href="/admin/show11">查看用户</a></dd>
                        <dd><a href="/admin/shoshow">查看商品</a></dd>
                        <dd><a href="/admin/itemshow">查看订单</a></dd>
                        <dd><a href="/admin/report">查看举报信息</a></dd>
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
        <th width="130">ID</th>
        <th width="130">er_id</th>
        <th width="130">goods_id</th>
        <th width="230">submit_time</th>
        <th width="400">content</th>
        <th width="187">status</th>
        <th width="182" colspan="2">操作</th>
    </tr>
<%
        List<Report> goods= (List<Report>) request.getSession().getAttribute("report");
        for (int i=0;i<goods.size();i++) {
            out.println("<tr>");
            out.println("<td align=center>" + goods.get(i).getId() + "</td>");
            out.println("<td align=center>" + goods.get(i).getEr_id() + "</td>");
            out.println("<td align=center>" + goods.get(i).getGoods_id() + "</td>");
            out.println("<td align=center>" + goods.get(i).getSubmit_time() + "</td>");
            out.println("<td align=center>" + goods.get(i).getContent() + "</td>");
            out.println("<td align=center>" + goods.get(i).getStatus() + "</td>");
            switch (i){
                      case 0:
                          out.println("<td >"+" <a  onclick=\"success14()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttondeletereport\">删除该举报</a>"+"<td align=center>"+"<a onclick=\"success15()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttondeletegoods\">下架该商品</a>"+"</td");
                    break;
                      case 1:
                          out.println("<td >"+" <a  onclick=\"success14()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttondeletereport1\">删除该举报</a>"+"<td align=center>"+"<a onclick=\"success15()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttondeletegoods1\">下架该商品</a>"+"</td");
                    break;
                      case 2:
                          out.println("<td >"+" <a  onclick=\"success14()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttondeletereport2\">删除该举报</a>"+"<td align=center>"+"<a onclick=\"success15()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttondeletegoods2\">下架该商品</a>"+"</td");
                    break;
                    case 3:
                        out.println("<td >"+" <a  onclick=\"success14()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttondeletereport3\">删除该举报</a>"+"<td align=center>"+"<a onclick=\"success15()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttondeletegoods3\">下架该商品</a>"+"</td");
                    break;
                    case 4:
                        out.println("<td >"+" <a  onclick=\"success14()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttondeletereport4\">删除该举报</a>"+"<td align=center>"+"<a onclick=\"success15()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttondeletegoods4\">下架该商品</a>"+"</td");
                    break;
                      case 5:
                          out.println("<td >"+" <a  onclick=\"success14()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttondeletereport5\">删除该举报</a>"+"<td align=center>"+"<a onclick=\"success15()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttondeletegoods5\">下架该商品</a>"+"</td");
                    break;
                      case 6:
                          out.println("<td >"+" <a  onclick=\"success14()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttondeletereport6\">删除该举报</a>"+"<td align=center>"+"<a onclick=\"success15()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttondeletegoods6\">下架该商品</a>"+"</td");
                    break;
                      case 7:
                          out.println("<td >"+" <a  onclick=\"success14()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttondeletereport7\">删除该举报</a>"+"<td align=center>"+"<a onclick=\"success15()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttondeletegoods7\">下架该商品</a>"+"</td");
                    break;
                      case 8:
                          out.println("<td >"+" <a  onclick=\"success14()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttondeletereport8\">删除该举报</a>"+"<td align=center>"+"<a onclick=\"success15()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttondeletegoods8\">下架该商品</a>"+"</td");
                    break;
                      case 9:
                          out.println("<td >"+" <a  onclick=\"success14()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttondeletereport9\">删除该举报</a>"+"<td align=center>"+"<a onclick=\"success15()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttondeletegoods9\">下架该商品</a>"+"</td");
                    break;
                      case 10:
                          out.println("<td >"+" <a  onclick=\"success14()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttondeletereport10\">删除该举报</a>"+"<td align=center>"+"<a onclick=\"success15()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttondeletegoods10\">下架该商品</a>"+"</td");
                    break;

            }
        }

%>
</body>
</html>
