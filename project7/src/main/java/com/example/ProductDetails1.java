package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ProductDetails1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        SessionFactory factory = HibernateUtil.getSessionfactory();

        Session session = factory.openSession();

        List<Eproduct1> list = session.createQuery("from eproduct", Eproduct1.class).list();

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html><body>");
        printWriter.println("<b>Component Mapping</b></br>");
        for (Eproduct1 p : list) {
            printWriter.println("ID: " + String.valueOf(p.getID()));
            printWriter.println("Name: " + String.valueOf(p.getName()));
            printWriter.println("Price: " + String.valueOf(p.getPrice()));

            ProductParts parts = p.getParts();
            printWriter.println("Parts= " + parts.getCpu() + " " + parts.getHdd() + " " + parts.getRam());
            printWriter.println("<hr>");
        }
        session.close();
        printWriter.println("</body></html>");
    }
}
