<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>商品列表页</title>
</head>
<body>
<table border="1" style="width: 100%">
    <tr>
        <td>序号</td>
        <td>商品名称</td>
        <td>商品价格</td>
        <td>商品详情</td>
    </tr>

    <c:forEach items="${itemList}" var="item" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${item.name}</td>
            <td>${item.price}</td>
            <td>${item.detail}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
