import java.sql.Connection;
import java.sql.SQLException;

import mySQL_handle.return_connection_to_server;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Connection connection = null;
        try {
            return_connection_to_server connection_to_server_instance = new return_connection_to_server();
             connection = connection_to_server_instance.getConnection();
            if (connection != null) {
                System.out.println("Forbindelse oprettet!");
            } else {
                System.out.println("Kunne ikke oprette forbindelse til databasen.");
            }
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Forbindelse lukket!");
                } catch (SQLException e) {
                    System.err.println("Fejl ved lukning af forbindelse: " + e.getMessage());
                }
            }
        }
    }
}