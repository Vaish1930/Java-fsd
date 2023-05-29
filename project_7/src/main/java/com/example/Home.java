package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Home extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            PrintWriter printWriter = resp.getWriter();
            printWriter.println("Hibernate Open");

            printWriter.println("</br>");
            new Main();

            printWriter.println("Hibernate Close");
            printWriter.println("</br>");
            printWriter.close();
        } catch (Exception e) {
        }
    }

}
