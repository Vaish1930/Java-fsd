package com.example.phase2;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/")
public class Test extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // super.doGet(req, resp);
        resp.setContentType("text/html");
        PrintWriter wr = resp.getWriter();
        wr.println("<h1>Hello World using HttpServlet class.</h1>");
        wr.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String name = req.getParameter("fullName");
        PrintWriter wr = resp.getWriter();
        wr.println("<h1>Post Request " + name + "</h1>");
        wr.close();
    }
}
