<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/7/2
  Time: 14:44
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
</head>
<body>
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
                <input type="submit" name="submit" class="btn btn-info" value="点击上架" >
            </form>
        </div>
    </div>
</div>
</body>
</html>
