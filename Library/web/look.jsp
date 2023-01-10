<%--
  Created by IntelliJ IDEA.
  User: Danila
  Date: 09.01.2023
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Ассортимент библиотеки</title>
</head>
<body>
<table>
    <tr><th>Название</th><th>Автор</th><th></th></tr>
    <c:forEach var="book" items="${books}">
        <tr><td>${book.title}</td>
            <td>${book.author}</td></tr>
    </c:forEach>
</table>
</body>
</html>
