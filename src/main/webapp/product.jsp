<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Товар</title>
</head>
<body>
    <header>
        <h1>Товар</h1>
    </header>
    <main>
        <c:if test="${login != null}">
            <h4>${login}</h4>
        </c:if>
        <ul>
            <li><a href='${pageContext.request.contextPath}/main'>Главная</a></li>
            <li><a href='${pageContext.request.contextPath}/catalog'>Каталог</a></li>
            <li><a href='${pageContext.request.contextPath}/product'>Товар</a></li>
            <li><a href='${pageContext.request.contextPath}/cart'>Корзина</a></li>
            <li><a href='${pageContext.request.contextPath}/order'>Заказ</a></li>
        </ul>
        <p>Описание товара</p>
        <p>Характеристики</p>
    </main>
</body>
</html>
