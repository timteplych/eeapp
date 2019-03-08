<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authorisation</title>
</head>
<body>
    <header>
        <h2>Авторизация</h2>
    </header>
    <main>
        <c:if test="${login != null}">
            <h4>${login}</h4>
        </c:if>
        <form method="post" action="${pageContext.request.contextPath}/login">
            <label>Пользователь</label>
            <input type="text" name="login">
            <label>Пароль</label>
            <input type="password" name="password">
            <input type="submit" name="Авторизоваться">
        </form>
    </main>
</body>
</html>
