<%@ page import="cn.edu.zust.se.order.vo.UserVo" %>
<%@ page import="static java.lang.System.out" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/5/30
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8">
    <script src="/layui/layui.js"></script>
    <link rel="stylesheet" href="/layui/css/layui.css">
    <link type="text/css" rel="stylesheet" href="/css/others.css">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap-theme.css">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap.css">
    <script src="/bootstrap-3.4.1-dist/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/css/prc.css">
    <script src="/js/prc.js"></script>

    <meta charset="UTF-8">
    <title>商户首页</title>

</head>

    <body class="layui-layout-body" background="/img/图片1.jpeg">
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
    <h1 style="position: absolute;top: 150px;left: 700px"  >欢迎来到个人主页</h1>
    <div style="position: absolute;top: 200px;left: 230px">
        <table  width="80%" border="1" align="center" class="table-condensed">
            <caption><%=user.getLoginName()%>管理员信息</caption>
            <tr>
                <th rowspan="2" align="center"><img src="/img/头像1.png" width="300" height="300"></img></th>
                <center> <th width="80px">姓名</th></center>
                <td align="center" width="400px"><%=user.getLoginName()%></td>
                <th width="80px">id</th>
                <td align="center" width="400px"><%=user.getId()%></td>
            </tr>
            <tr>
                <th width="80px">mobile</th>
                <td align="center" width="400px"><%=user.getMobile()%></td>
                <th width="80px">email</th>
                <td align="center" width="400px"><%=user.getEmail()%>></td>
            </tr>
        </table>
    </div>
    </div>
    </div>
</body>
</html>
