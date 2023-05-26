package com.example.project_jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Statement;
import java.util.Properties;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Operations extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {

            PrintWriter printWriter = resp.getWriter();
            printWriter.println("<html><body>");
            printWriter.println("</br>");
            InputStream in = getServletContext()
                    .getResourceAsStream("/Database.properties");

            Properties props = new Properties();
            props.load(in);

            DbConnection conn = new DbConnection(props.getProperty("DB_URL"), props.getProperty("DB_USERNAME"),
                    props.getProperty("DB_PASSWORD"));

            Statement statement = conn.getConnection().createStatement();

            statement.executeUpdate("Create Database data");
            printWriter.println("Created Database : data");
            printWriter.println("</br>");

            statement.executeUpdate("use data");
            printWriter.println("Selected Database : data");
            printWriter.println("</br>");

            statement.executeUpdate("drop database data");
            printWriter.println("Drop Database : data");
            printWriter.println("</br>");

            statement.close();
            printWriter.println("Dropped Database : data");
            printWriter.println("</br>");

            printWriter.println("</html></body>");
            conn.closeConnection();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
