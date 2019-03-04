<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Корзина</title>
</head>
<body>
    <header>
        <h1>Корзина </h1>
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
        <h3>Содержимое конзины</h3>
        <ul>
            <li>Товар 1</li>
            <li>Товар 2</li>
            <li>Товар 3</li>
            <li>Товар 4</li>
            <li>Товар 5</li>
        </ul>
    </main>
</body>
</html>
