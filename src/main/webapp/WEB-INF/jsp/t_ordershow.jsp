<%@ page import="cn.edu.zust.se.order.vo.T_order" %>
<%@ page import="java.util.List" %>
<%@ page import="cn.edu.zust.se.order.vo.UserVo" %><%--
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
  <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
  <script src="/layui/layui.js"></script>
  <link rel="stylesheet" href="/layui/css/layui.css">
  <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap-theme.css">
  <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap.min.css">
  <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap.css">
  <script src="/bootstrap-3.4.1-dist/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="/css/prc.css">
  <script src="/js/prc.js"></script>

  <title>购物车页面</title>



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
        欢迎光临，用户<%=user.getLoginName()%>
      </li>
      <li class="layui-nav-item"><a href="/users/login">安全退出</a></li>
    </ul>
  </div>

  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧垂直导航区域-->
      <ul class="layui-nav layui-nav-tree" lay-filter="test">
        <li class="layui-nav-item">
          <p>购物管理</p>
          <dd>
            <a href="/buyer/shoppingjsp" data-id="1" data-title="添加商品" data-url="index.php?&a=adminLogList"
               class="site-demo-active" data-type="tabAdd"  >添加商品</a></dd>
          </dd>
          <dd>
            <a href="/buyer/show" data-id="2" data-title="查看购物车" data-url="index.php?&a=adminLogList"
               class="site-demo-active" data-type="tabAdd">查看购物车</a></dd>
          </dd>
          <dd><a href="/buyer/buy3" data-id="2" data-title="更新购物车" data-url="index.php?&a=adminLogList"
                 class="site-demo-active" data-type="tabAdd">更新商品</a></dd>
          <dd><a href="/buyer/showjsp" data-id="2" data-title="查看已上架商品" data-url="index.php?&a=adminLogList"
                 class="site-demo-active" data-type="tabAdd">查看已上架商品</a></dd>
          <dd><a href="/buyer/buy4" data-id="2" data-title="购买" data-url="index.php?&a=adminLogList"
                 class="site-demo-active" data-type="tabAdd">购买</a></dd>
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
<div class="div">
  <center><table border="1" class="table-hover" bgcolor="white" width="100%">
  <tr style="background-color:gray">
    <th width="130">ID</th>
    <th width="130">商品ID</th>
    <th width="130">买家ID</th>
    <th width="130">商户ID</th>
    <th width="130">价格</th>
    <th width="220">下单时间</th>
    <th width="220">提交时间</th>
    <th width="130">数量</th>
    <th width="130">状态</th>
    <th width="40">操作</th>
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
          out.println("<td align=center>"+"<a onclick=\"success12()\" href=\"/buyer/buttonupdate\" class=\"layui-btn layui-btn-sm layui-btn-danger\">删除</a>"+"</td");
          break;
        case 1:
          out.println("<td align=center>"+"<a onclick=\"success12()\" href=\"/buyer/buttonupdate1\" class=\"layui-btn layui-btn-sm layui-btn-danger\">删除</a>"+"</td");
          break;
        case 2:
          out.println("<td align=center>"+"<a onclick=\"success12()\" href=\"/buyer/buttonupdate2\" class=\"layui-btn layui-btn-sm layui-btn-danger\">删除</a>"+"</td");
          break;
        case 3:
          out.println("<td align=center>"+"<a onclick=\"success12()\" href=\"/buyer/buttonupdate3\" class=\"layui-btn layui-btn-sm layui-btn-danger\">删除</a>"+"</td");
          break;
        case 4:
          out.println("<td align=center>"+"<a onclick=\"success12()\" href=\"/buyer/buttonupdate4\" class=\"layui-btn layui-btn-sm layui-btn-danger\">删除</a>"+"</td");
          break;
        case 5:
          out.println("<td align=center>"+"<a onclick=\"success12()\" href=\"/buyer/buttonupdate5\" class=\"layui-btn layui-btn-sm layui-btn-danger\">删除</a>"+"</td");
          break;
        case 6:
          out.println("<td align=center>"+"<a onclick=\"success12()\" href=\"/buyer/buttonupdate6\" class=\"layui-btn layui-btn-sm layui-btn-danger\">删除</a>"+"</td");
          break;
        case 7:
          out.println("<td align=center>"+"<a onclick=\"success12()\" href=\"/buyer/buttonupdate7\" class=\"layui-btn layui-btn-sm layui-btn-danger\">删除</a>"+"</td");
          break;
        case 8:
          out.println("<td align=center>"+"<a onclick=\"success12()\" href=\"/buyer/buttonupdate8\" class=\"layui-btn layui-btn-sm layui-btn-danger\">删除</a>"+"</td");
          break;
        case 9:
          out.println("<td align=center>"+"<a onclick=\"success12()\" href=\"/buyer/buttonupdate9\" class=\"layui-btn layui-btn-sm layui-btn-danger\">删除</a>"+"</td");
          break;
      }

      out.println("</tr>");
    }
  %>
</table></center>
</div>
</body>
</html>
