package sk.it.jdbc;

import java.sql.DriverManager;

public class TestJDBC {
    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String pass = "root";

        try {
            System.out.println("Connecting to database: " + jdbcUrl);
            DriverManager.getConnection(jdbcUrl, user, pass);
            System.out.println("Connection successful!");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
