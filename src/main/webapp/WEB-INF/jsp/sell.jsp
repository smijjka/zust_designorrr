<%--
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
    <title>商品管理页面</title>
</head>
<body>
<h1>以下为上架清单</h1>
<center><form action="/seller/up_sho" method="post">
    id <input type="text" name="id"><br>
    name <input type="text" name="name"><br>
    category <input type="text" name="category"><br>
    price <input type="text" name="price"><br>
    num <input type="text" name="num"><br>
    status(1为正常出售) <input type="text" name="status"><br>
    <input type="submit" name="submit" value="点击上架"><br>
</form></center>
<h1>以下为下架清单</h1>
<center><form action="/seller/down_sho" method="post">
    id <input type="text" name="id"><br>
    name <input type="text" name="name"><br>
    <input type="submit" name="submit" value="点击下架"><br>
</form></center>
<h1>以下为修改商品清单</h1>
<center><form action="/seller/update_sho" method="post">
    id <input type="text" name="id"><br>
    请输入要修改的内容：
    name <input type="text" name="name"><br>
    category <input type="text" name="category"><br>
    price <input type="text" name="price"><br>
    num <input type="text" name="num"><br>
    status(1为正常出售) <input type="text" name="status"><br>
    <input type="submit" name="submit" value="点击修改"><br>
</form></center>
</body>
</html>
