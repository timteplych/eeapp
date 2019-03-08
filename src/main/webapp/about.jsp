<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>О компании</title>
</head>
<body>
    <header>
        <h3>О компании</h3>
    </header>
    <main>
        <c:if test="${login != null}">
            <h4>${login}</h4>
        </c:if>
        <ul>
            <li><a href='${pageContext.request.contextPath}"/main'>Главная</a></li>
            <li><a href='${pageContext.request.contextPath}/catalog'>Каталог</a></li>
            <li><a href='${pageContext.request.contextPath}/product'>Товар</a></li>
            <li><a href='${pageContext.request.contextPath}"/cart'>Корзина</a></li>
            <li><a href='${pageContext.request.contextPath}/order'>Заказ</a></li>
        </ul>
        <p>Компания Рога и Копыта </p>
        <p>Адрес: Россия</p>
    </main>
</body>
</html>
