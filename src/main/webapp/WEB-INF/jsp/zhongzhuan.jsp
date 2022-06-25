<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/6/19
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap-theme.css">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/bootstrap-3.4.1-dist/css/bootstrap.css">
    <script src="/bootstrap-3.4.1-dist/js/bootstrap.min.js"></script>
    <link type="text/css" rel="stylesheet" href="/css/zhongzhuan.css">
    <meta charset="UTF-8">
    <title>中转页面</title>
    <%@include file="header.jsp"%>
    <%@include file="footer.jsp"%>
    <a  class="text2" href="/seller/zhongzhuan">《--返回</a><br>
    <%--<a  class="text2" href="/seller/back">《--返回商户主页</a>--%>
</head>
<body>

<div class="tip">
    <center><span>您的操作结果为：</span></center>
    <center><p><%=request.getSession().getAttribute("str")%></p></center>
</div>
<div class="box">
    <p>1、人间没有永恒的夜晚，世界没有永恒的冬天---艾青</p>
    <p>2、发光不是太阳的专利，玻璃也可以发光。我们也可以发出耀眼的光芒。</p>
    <p>3、成功的人总是愿意做没成功的人不愿意做的事。</p>
    <p>4、人生天地之间，若白驹之过隙，忽然而已---庄周</p>
    <p>5、人生不售来回票，一旦动身，绝不能复返。</p>
    <p>6、过去属于死神，未来属于你自己---雪莱</p>
    <p>7、富贵不淫贫贱乐,男儿到此是豪雄---程颢</p>
    <p>...</p>
</div>
</body>
</html>
