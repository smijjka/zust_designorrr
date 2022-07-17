<%@ page import="cn.edu.zust.se.order.vo.Goods" %>
<%@ page import="java.util.List" %>
<%@ page import="cn.edu.zust.se.order.vo.T_order" %>
<%@ page import="cn.edu.zust.se.order.vo.UserVo" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/6/4
  Time: 16:33
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
    </div><!--tab标签-->
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
        <th width="130">商品ID</th>
        <th width="130">买家ID</th>
        <th width="130">商户ID</th>
        <th width="130">价格</th>
        <th width="220">下单时间</th>
        <th width="220">提交时间</th>
        <th width="100">数量</th>
        <th width="100">状态</th>
        <th width="100" colspan="2">操作</th>
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
            switch (i){
                case 0:  out.println("<td >"+" <a  onclick=\"success3()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttonupdate\">删除</a>"+"<td align=center>"+"<button onclick=\"add2()\" class=\"layui-btn layui-btn-sm layui-btn-danger\">修改订单</a>"+"</td");
                break;
                case 2:out.println("<td >"+" <a  onclick=\"success3()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttonupdate2\">删除</a>"+"<td align=center>"+"<button onclick=\"add2()\" class=\"layui-btn layui-btn-sm layui-btn-danger\">修改订单</a>"+"</td");
                    break;
                case 3:out.println("<td >"+" <a  onclick=\"success3()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttonupdate3\">删除</a>"+"<td align=center>"+"<button onclick=\"add2()\" class=\"layui-btn layui-btn-sm layui-btn-danger\">修改订单</a>"+"</td");
                    break;
                case 4:out.println("<td >"+" <a  onclick=\"success3()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttonupdate4\">删除</a>"+"<td align=center>"+"<button onclick=\"add2()\" class=\"layui-btn layui-btn-sm layui-btn-danger\">修改订单</a>"+"</td");
                    break;
                case 5:out.println("<td >"+" <a  onclick=\"success3()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttonupdate5\">删除</a>"+"<td align=center>"+"<button onclick=\"add2()\" class=\"layui-btn layui-btn-sm layui-btn-danger\">修改订单</a>"+"</td");
                    break;
                case 6:out.println("<td >"+" <a  onclick=\"success3()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttonupdate6\">删除</a>"+"<td align=center>"+"<button onclick=\"add2()\" class=\"layui-btn layui-btn-sm layui-btn-danger\">修改订单</a>"+"</td");
                    break;
                case 7:out.println("<td >"+" <a  onclick=\"success3()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttonupdate7\">删除</a>"+"<td align=center>"+"<button onclick=\"add2()\" class=\"layui-btn layui-btn-sm layui-btn-danger\">修改订单</a>"+"</td");
                    break;
                case 8:out.println("<td >"+" <a  onclick=\"success3()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttonupdate8\">删除</a>"+"<td align=center>"+"<button onclick=\"add2()\" class=\"layui-btn layui-btn-sm layui-btn-danger\">修改订单</a>"+"</td");
                    break;
                case 9:out.println("<td >"+" <a  onclick=\"success3()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttonupdate9\">删除</a>"+"<td align=center>"+"<button onclick=\"add2()\" class=\"layui-btn layui-btn-sm layui-btn-danger\">修改订单</a>"+"</td");
                    break;
                case 10:out.println("<td >"+" <a  onclick=\"success3()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttonupdate10\">删除</a>"+"<td align=center>"+"<button onclick=\"add2()\" class=\"layui-btn layui-btn-sm layui-btn-danger\">修改订单</a>"+"</td");
                    break;
                case 1:
                    out.println("<td >"+" <a  onclick=\"success3()\"  class=\"layui-btn layui-btn-sm layui-btn-danger\" href=\"/admin/buttonupdate1\">删除</a>"+"<td align=center>"+"<button onclick=\"add2()\" class=\"layui-btn layui-btn-sm layui-btn-danger\">修改订单</a>"+"</td");
                    break;

            }
            out.println("</tr>");
        }

    %>
</table>
    </center>


                <td ><form action="/admin/order_update"  class="col-md-3" id="create_table_from"  method="post" lay-filter="create_table_from" style="display: none;">
                    I&emsp;D&emsp;:<input type="text" name="id"><br>
                    价&emsp;格:<input type="text" name="price"><br>
                    数&emsp;量:<input type="text" name="amount"><br>
                    状&emsp;态:<input type="text" name="status"><br>
                    <center><input type="submit" name="submit" class="btn btn-info" onclick="success4()" value="修改订单"><br></center></form></td>


</div>
</body>
</html>
