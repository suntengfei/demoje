<%--
  Created by IntelliJ IDEA.
  User: suntf-pc
  Date: 2018/7/1
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <form action="/productservlet" method="post">
        商品名：<input type="text" name="name"/><br/>
        价格：<input type="text" name="price"/><br/>
        备注：<input type="text" name="remark"/><br/>
        <input type="submit" value="提交"/>
    </form>
</head>
<body>
<p>ok</p>
</body>
</html>
