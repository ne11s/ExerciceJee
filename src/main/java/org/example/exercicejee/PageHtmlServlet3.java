package org.example.exercicejee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "pageHtmlServlet3", value = "/pageHtmlServlet3")
public class PageHtmlServlet3 extends HttpServlet {
    public void init() {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("request send to /pageHtmlServlet3");
        getServletContext().getRequestDispatcher("/pageHtmlServlet3.jsp").forward(request, response);
    }
}
