package com.example.project_jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.util.Properties;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProductDetails extends HttpServlet {
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

            CallableStatement statement = conn.getConnection().prepareCall("{call add_product(?,?)}");
            // CallableStatement cs = con.prepareCall("{call updateEmpSalary(?,?)}");

            statement.setString(1, "new product");
            statement.setBigDecimal(2, new BigDecimal(1900.50));

            statement.executeUpdate();

            printWriter.println("Stored procedure has been executed");
            statement.close();

            printWriter.println("</body></html>");
            conn.closeConnection();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
