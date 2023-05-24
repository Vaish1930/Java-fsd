package com.example.phase2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HiddenTest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        String username = req.getParameter("username");

        Cookie cookie = new Cookie("username", username);
        resp.addCookie(cookie);
        out.print("<br><a href=\"/project5/dashboard\"><button type=\"button\">Login</button></a>");
        out.print("WELCOME " + username);

        out.close();
    }
}
