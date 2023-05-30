package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateInit extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            PrintWriter printWriter = resp.getWriter();
            printWriter.println("<html><body>");

            SessionFactory factory = HibernateUtil.getSessionfactory();

            Session session = factory.openSession();
            printWriter.println("Hibernate Session opened");
            session.close();
            printWriter.println("Hibernate Session closed");
            printWriter.println("</body></html>");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
