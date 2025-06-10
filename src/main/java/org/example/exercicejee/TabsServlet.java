package org.example.exercicejee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "tabsHtmlServlet", value = "/tabsHtmlServlet")
public class TabsServlet extends HttpServlet {
    public void init() {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("request send to /tabsHtmlServlet");
        List<Personne> personnes = new ArrayList<>();
        personnes.add(new Personne("Dkajou","Noa",22));
        personnes.add(new Personne("Ant","Salim",24));
        personnes.add(new Personne("Toh","Thomas",33));
        personnes.add(new Personne("Sion","Remy",32));
        request.setAttribute("personnes",personnes);

        getServletContext().getRequestDispatcher("/tabsHtmlServlet.jsp").forward(request, response);
    }
}
