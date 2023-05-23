package com.example.phase2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class GenericTest extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.println("<html>");
        pw.println("<head><title>My first Servlet</title></head>");
        pw.println("<body>");
        pw.println("<h2>Welcome To Genric Servlet </h2>");
        pw.println("</body>");
        pw.println("</html>");
        pw.close();
    }

}
