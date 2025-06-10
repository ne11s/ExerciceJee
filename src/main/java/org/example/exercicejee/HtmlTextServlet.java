package org.example.exercicejee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "htmlTextServlet", value = "/htmlTextServlet")
public class HtmlTextServlet extends HttpServlet {
    public void init() {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("request send to /htmlTextServlet");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html><body>");
        writer.println("<h1>" + "ma page text html" + "</h1>");
        writer.println("</body></html>");
    }
}
