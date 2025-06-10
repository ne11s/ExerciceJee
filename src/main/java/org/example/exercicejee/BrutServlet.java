package org.example.exercicejee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "brutServlet", value = "/brutservlet")
public class BrutServlet extends HttpServlet {
    public void init() {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("request send to /brutservlet");
        response.setContentType("text/plain");
        PrintWriter writer = response.getWriter();
        writer.println("this is a plain text page");
    }
}
