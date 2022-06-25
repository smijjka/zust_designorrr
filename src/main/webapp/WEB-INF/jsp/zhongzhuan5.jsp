<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/6/21
  Time: 12:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8">
    <link type="text/css" rel="stylesheet" href="/css/zhongzhuan.css">
    <%@include file="header.jsp"%>
    <%@include file="footer.jsp"%>
    <title>中转页面</title>
    <a class="text2" href="/admin/zhongzhuan5">《--返回</a>
</head>
<body>

<div class="tip">
   <center> <span>您的操作结果为：</span></center>
    <center><p><%=request.getSession().getAttribute("str4")%></p></center>
</div>
<div class="box"><p>1、人间没有永恒的夜晚，世界没有永恒的冬天---艾青</p>
    <p>2、发光不是太阳的专利，玻璃也可以发光。我们也可以发出耀眼的光芒。</p>
    <p>3、成功的人总是愿意做没成功的人不愿意做的事。</p>
    <p>4、人生天地之间，若白驹之过隙，忽然而已---庄周</p>
    <p>5、人生不售来回票，一旦动身，绝不能复返。</p>
    <p>6、过去属于死神，未来属于你自己---雪莱</p>
    <p>...</p>
</div>

</body>
</html>
