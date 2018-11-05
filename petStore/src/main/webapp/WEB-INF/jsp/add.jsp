<%--
  Created by IntelliJ IDEA.
  User: lhl
  Date: 2018/11/5
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/pet/addpet" method="post">
        宠物编号：<input name="petId" type="text"><br>
        宠物名字：<input name="petName" type="text"><br>
        宠物类型：<input name="categorys" type="text"><br>
        宠物状态：<input name="petStatus" type="text"><br>
        宠物种类：<input name="tags" type="text"><br>
        宠物图片：<input type="text" name="photoUrls">
        <input type="submit">
    </form>
</body>
</html>
