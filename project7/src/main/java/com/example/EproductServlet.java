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
import org.hibernate.Transaction;

public class EproductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            PrintWriter printWriter = resp.getWriter();

            SessionFactory factory = HibernateUtil.getSessionfactory();

            Session session = factory.openSession();

            Transaction transaction = session.beginTransaction();

            List<Eproduct> products = session.createQuery("from eproduct", Eproduct.class).list();

            transaction.commit();

            printWriter.println("<html>");
            printWriter.println("<head><title>Hibernate Configured</title></head>");
            printWriter.println("<body>");

            printWriter.println("<b>Product Listing </b><br>");

            for (Eproduct product : products) {
                printWriter.println("Id: " + product.getId());
                printWriter.println("Name: " + product.getName());
                printWriter.println("Price: " + product.getPrice());
                printWriter.println("Date Added: " + product.getDate_added());
            }

            session.close();
            printWriter.println("</body></html>");
            printWriter.close();

        } catch (Exception e) {

            System.out.println("Error------------------------------------------------" + e.getMessage());
        }
    }
}
