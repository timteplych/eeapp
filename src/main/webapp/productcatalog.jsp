<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Каталог товаров</title>
</head>
<body>
    <header>
        <h1>Каталог товаров</h1>
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
        <div>Список продуктов</div>
        <ul>
            <c:forEach items="${products}" var="product">
                <li>${product.id}
                ${product.name}
                ${product.price}
                ${product.description}
                </li>
            </c:forEach>
        </ul>
    </main>
</body>
</html>
