package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ProductDetails extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            PrintWriter printWriter = resp.getWriter();
            printWriter.println("<html><body>");

            SessionFactory factory = HibernateUtil.getSessionfactory();

            Session session = factory.openSession();

            printWriter.println("<b>Product Listing </b><br>");
            List<Eproduct> products = session.createQuery("from Eproduct", Eproduct.class).list();

            for (Eproduct product : products) {
                printWriter.println("Id: " + String.valueOf(product.getId()));
                printWriter.println("Name: " + product.getName());
                printWriter.println("Price: " + String.valueOf(product.getPrice()));
                printWriter.println("Date Added: " + product.getDate_added().toString());

                List<Color> colors = product.getColors();
                printWriter.println("Colors ");
                for (Color c : colors) {
                    printWriter.println(c.getName() + " &nbsp");
                }

                Collection<ScreenSizes> sizes = product.getScreenSizes();
                printWriter.println("ScreenSize ");
                for (ScreenSizes s : sizes) {
                    printWriter.println(s.getSize() + " &nbsp");
                }

                Set<OS> os = product.getOs();
                printWriter.println("OS ");
                for (OS o : os) {
                    printWriter.println(o.getName() + " &nbsp");
                }

                Map finances = product.getFinance();
                printWriter.println("Finance Options ");
                if (finances.get("Creditcard") != null) {
                    Finance f = (Finance) finances.get("creditcard");
                }

            }

            session.close();

            printWriter.println("</body></html>");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
