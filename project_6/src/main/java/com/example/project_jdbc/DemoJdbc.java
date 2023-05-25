package com.example.project_jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DemoJdbc extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {

            PrintWriter printWriter = resp.getWriter();
            printWriter.println("<html><body>");
            InputStream in = getServletContext()
                    .getResourceAsStream("/Database.properties");
            printWriter.println("Db connection initialized ");

            Properties props = new Properties();
            props.load(in);

            DbConnection conn = new DbConnection(props.getProperty("DB_URL"), props.getProperty("DB_USERNAME"),
                    props.getProperty("DB_PASSWORD"));

            printWriter.println("Db connection closed ");
            printWriter.println("</html></body>");
            conn.closeConnection();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
