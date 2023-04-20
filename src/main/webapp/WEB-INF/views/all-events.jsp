<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All events</title>
</head>
<body>
<h2>All events Таблица</h2>
<br>

<table>
    <tr>
        <th>
            Id
        </th>
        <th>
            Name
        </th>
    </tr>

    <c:forEach var="event" items="${allEvents}">


    <tr>
        <td>
            ${event.id}
        </td>

        <td>
            ${event.name}
        </td>
    </tr>
    </c:forEach>
</table>

</body>
</html>
