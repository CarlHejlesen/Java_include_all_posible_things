import java.sql.Connection;
import java.sql.SQLException;

import mySQL_handle.ReturnConnectionToServer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String database_name = "my_first_db";
        String my_table = "my_first_table";
        String connection_string = "";
        System.out.println("Hello world!");
        // Database connection constants
        String DATABASE_URL = "jdbc:mysql://localhost:3306/";
        String DATABASE_USER = "root";
        String DATABASE_PASSWORD = "password";
        Connection connection_to_server = null;
        Connection connection_to_db = null;

        try {
            connection_to_server = ReturnConnectionToServer.GetConnection("", DATABASE_URL, DATABASE_USER,
                    DATABASE_PASSWORD);




        } finally {
            try {
                if (connection_to_server != null) {
                    connection_to_server.close();
                    System.out.println("Forbindelse til serveren lukket!");
                }
                if (connection_to_db != null) {
                    connection_to_db.close();
                    System.out.println("Forbindelse til databasen lukket!");
                }
            } catch (SQLException e) {
                System.err.println("Fejl ved lukning af forbindelse: " + e.getMessage());
            }
        }
    }
}
