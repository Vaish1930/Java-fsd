package com.example.project_jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Product extends HttpServlet {
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

            String query = "INSERT INTO eproduct (name, price,date_added) VALUES (?, ?,?)";
            PreparedStatement statement = conn.getConnection().prepareStatement(query);
            statement.setString(1, "New Product1");
            statement.setDouble(2, 1788.00);
            java.sql.Date date = getCurrentDatetime();
            statement.setDate(3, date);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                printWriter.println("A new product was inserted successfully!\n");
                printWriter.println("</br>");

            }
            // Display the record

            String query1 = "SELECT * FROM eproduct";
            Statement stmt = conn.getConnection().createStatement();
            ResultSet result = stmt.executeQuery(query1);

            while (result.next()) {
                printWriter.println(result.getInt(1) + " " +
                        result.getString(2) + " " +
                        result.getString(3) + " ");

                printWriter.println("</br>");

            }

            // Update the record

            String query2 = "Update eproduct set price = ? where name = ?";
            PreparedStatement preparedStatement = conn.getConnection().prepareStatement(query2);
            preparedStatement.setDouble(1, 2000.00);
            preparedStatement.setString(2, "New Product1");

            int rowUpdate = preparedStatement.executeUpdate();
            if (rowUpdate > 0) {
                printWriter.println("Record updated successfully!!");
                printWriter.println("</br>");

            }

            // Delete the record
            String query3 = "DELETE FROM eproduct WHERE name=?";
            PreparedStatement statement1 = conn.getConnection().prepareStatement(query3);
            statement1.setString(1, "LPTOP");

            int rowsDeleted = statement1.executeUpdate();
            if (rowsDeleted > 0) {
                printWriter.println("A Product was deleted successfully!");
                printWriter.println("</br>");

            }
        }

        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private Date getCurrentDatetime() {
        java.util.Date today = new java.util.Date();
        return new java.sql.Date(today.getTime());
    }
}
