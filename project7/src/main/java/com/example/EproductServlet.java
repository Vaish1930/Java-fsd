package com.example;

import java.io.IOException;
import java.io.PrintWriter;
// import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
// import org.hibernate.Transaction;

public class EproductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            resp.setContentType("text/html");
            PrintWriter printWriter = resp.getWriter();

            SessionFactory factory = HibernateUtil.getSessionfactory();

            Session session = factory.openSession();

            // Transaction transaction = session.beginTransaction();

            session.close();
            printWriter.println("</body></html>");
            printWriter.close();

        } catch (Exception e) {

        }
    }
}
