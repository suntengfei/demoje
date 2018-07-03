<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Insert title here</title>
</head>
<body>

<form action="/productservlet" method="get">
    <!--  ctrl + atl + 下方向键 -->
    关键字:<input type="text" name="name" /><br /> <input type="submit"
                                                          value="给我搜" />
</form>

es:
<%=session.getAttribute("proList")%><br />
<table border="1" width="500px">
    <tr>
        <th>编号</th>
        <th>名称</th>
        <th>价格</th>
        <th>备注</th>
        <th>日期</th>
    </tr>
    <!-- 应该循环显示查询的结果,采用JSTL标签可以与HTML标签整合-->
    <!-- item:就是要循环的数组或者集合   \${} request>session>application
      var:代表每次循环的Product对象
   -->
    <c:forEach items="${sessionScope.proList}" var="product">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.remark}</td>
            <td>${product.date}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>