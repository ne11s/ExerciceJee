<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>

        <%@include file="style/style.css"%>
        body {
            display: flex;
            flex-direction: column;
        }
    </style>
</head>
<body>
<h1>
    <%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<a href="brutservlet">text brut Servlet</a>
<a href="htmlTextServlet">html text Servlet</a>
<a href="pageHtmlServlet">page html Servlet</a>
<a href="pageHtmlServlet3">page html Servlet 2</a>
<a href="pageHtmlServlet3">page html Servlet 3</a>

</body>
</html>