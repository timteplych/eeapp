<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World! TTV</h2>
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
<a href="${pageContext.request.contextPath}/auth">Авторизоваться</a>
</body>
</html>
