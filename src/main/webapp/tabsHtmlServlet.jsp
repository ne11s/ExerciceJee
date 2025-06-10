<%@ page import="org.example.exercicejee.Personne" %><%--
  Created by IntelliJ IDEA.
  User: nenes
  Date: 10/06/2025
  Time: 23:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="personnes" type="java.util.ArrayList<org.example.exercicejee.Personne>" scope="request"/>
<html>
<head>
    <title>Tableaux</title>
  <%@include file="WEB-INF/allCss.jsp"%>
</head>
<body>
<%@include file="WEB-INF/header.jsp"%>
    <h2>Tableau</h2>

    <table>
        <thead>
            <tr>
                <th scope="col">Nom</th>
                <th scope="col">Prénom</th>
                <th scope="col">Age</th>
            </tr>
        </thead>
        <tbody>
            <% for (Personne p: personnes) {%>
            <tr>
                <td ><%= p.getNom() %></td>
                <td><%= p.getPrenom() %></td>
                <td><%= p.getAge() %></td>
            </tr>
            <% } %>
        </tbody>

    </table>
</body>
</html>
