import java.sql.Connection;

import mySQL_handle.connect_to_server;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        connect_to_server connect_to_server_instance = new connect_to_server();
        Connection connection = connect_to_server_instance.getConnection();
        if (connection != null) {
            System.out.println("Forbindelse oprettet!");
        } else {
            System.out.println("Kunne ikke oprette forbindelse til databasen.");
        }

    }
}