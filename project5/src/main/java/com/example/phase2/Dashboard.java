package com.example.phase2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Dashboard extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        boolean isLoggedIn = false;
        PrintWriter out = resp.getWriter();

        Cookie ck[] = req.getCookies();
        for (Cookie cookie : ck) {

            if (!isLoggedIn && cookie.getName().contentEquals("username") && cookie.getValue() != null) {
                out.print("<br/>" + cookie.getName() + " " + cookie.getValue());
                isLoggedIn = true;
            }
        }
        if (isLoggedIn) {

            out.print("<br><a href=\"/project5/logout\"><button type=\"button\">LogOut</button></a>");
        } else {
            out.print("<br/> <center> Try Logging In </center>");
        }

        out.close();
    }
}
