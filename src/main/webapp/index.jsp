<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <%@include file="WEB-INF/allCss.jsp"%>
    <style>
        body {
            display: flex;
            flex-direction: column;
        }
    </style>
</head>
<body>
<%@include file="WEB-INF/header.jsp"%>
<h2>
    <%= "Hello World!" %>
</h2>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<a href="brutservlet">text brut Servlet</a>
<a href="htmlTextServlet">html text Servlet</a>
<a href="pageHtmlServlet">page html Servlet</a>
<a href="pageHtmlServlet3">page html Servlet 2</a>
<a href="pageHtmlServlet3">page html Servlet 3</a>
<a href="tabsHtmlServlet">page du tableau</a>

</body>
</html>