package com.example.phase2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class InterfaceTest implements Servlet {

    ServletConfig config = null;

    @Override
    public void destroy() {
        System.out.println("servlet is destroyed");
    }

    @Override
    public ServletConfig getServletConfig() {

        return this.config;
    }

    @Override
    public String getServletInfo() {
        return "hello";
    }

    @Override
    public void init(ServletConfig config) throws ServletException {

        this.config = config;

        System.out.println("servlet is initialized:::"
                + config);
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        out.print("<html><body<h1><b>Servlet Interface</b></h1>");
        out.print("<h2><b> Example of Servlet Interface <b></h2>");
        out.print("</body></html>");

    }

}
