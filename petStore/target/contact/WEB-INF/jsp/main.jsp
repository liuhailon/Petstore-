<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lhl
  Date: 2018/11/4
  Time: 19:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="../js/jquery.js"></script>
    <script>
        $(function () {
            $("#queryBtnById").click(function (e) {
                $("#form1").action="/pet/queryPet"+$("#status").value();
            })
        })
    </script>
</head>
<body>
<h1>您好！欢迎来到宠物商店</h1>
<form id="form1" action="/pet/queryByStatus/" method="get">
    <input type="text" name="petStatus">
    <input type="submit" id="queryBtnByStatus" value="按状态查询">
    <input type="submit" id="queryBtnById" value="按编号查询">
</form>
<form action="/pet/add" method="get">
    <input type="submit" value="添加">
</form>
<table>
    <tr>
        <th>宠物编号</th>
        <th>宠物名称</th>
        <th>宠物类型</th>
        <th>宠物状态</th>
        <th>宠物图片</th>
        <th>宠物种类</th>
        <th>操作</th>
    </tr>
<c:forEach items="${petlist}" var="pet">
    <tr>
        <td>${pet.petId}</td>
        <td>${pet.petName}</td>
        <td>${pet.categorys}</td>
        <td>${pet.petStatus}</td>
        <td><img width="50px" height="50px" src="../img/${pet.photoUrls}"></td>
        <td>${pet.tags}</td>
        <td><a href="/pet/del/${pet.petId}">删除</a></td>
    </tr>
</c:forEach>
</table>

</body>
</html>
