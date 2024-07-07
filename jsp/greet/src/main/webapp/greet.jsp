<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Greeting Page</title>
</head>
<body>
    <%
        String name = request.getParameter("name");
        if (name != null && !name.trim().isEmpty()) {
            out.println("<h1>Hello, " + name + "!</h1>");
        } else {
            out.println("<h1>Hello, Guest!</h1>");
        }
    %>
</body>
</html>
