<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Books</title>
  </head>
  <body>

  <ui>
    <c:forEach items="${bookList}" var="book">
      <li>id: ${book.id}, Name: ${book.name}, Author: ${book.author}</li>
    </c:forEach>

  </ui>

  </body>
</html>
