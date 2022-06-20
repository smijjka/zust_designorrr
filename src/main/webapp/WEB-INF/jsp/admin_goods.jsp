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
  <link type="text/css" rel="stylesheet" href="/css/design.css">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta charset="UTF-8">
    <title>商品管理页面</title>
</head>
<body>
下架商品
<form action="/admin/delete1" method="post">
  id <input type="text" name="id"><br>
  name <input type="text" name="name"><br>
  <input type="submit" name="submit" value="点击下架该商品"><br>
</form>
修改商品信息
<form action="/admin/update1" method="post">
  id <input type="text" name="id"><br>
  name <input type="text" name="name"><br>
  price <input type="text" name="price"><br>
  num <input type="text" name="num"><br>
  status(1为正常出售) <input type="text" name="status"><br>
  <input type="submit" name="submit" value="点击修改商品信息"><br>
</form>
</body>
</html>
