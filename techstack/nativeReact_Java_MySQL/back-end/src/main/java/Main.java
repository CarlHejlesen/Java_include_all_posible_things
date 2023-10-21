import java.sql.Connection;
import java.sql.SQLException;

import mySQL_handle.create_db;
import mySQL_handle.create_table;
import mySQL_handle.return_connection_to_server;
public class Main {
    public static void main(String[] args) {

        String db_name = "my_first_db";
        String my_table = "my_first_table";
        String connection_string = "";
        System.out.println("Hello world!");

        Connection connection_to_server = null;
        Connection connection_to_db = null;

        try {
            connection_to_server = return_connection_to_server.getConnection(connection_string);

            create_db create_db_instance = new create_db();
            create_table create_table_instance = new create_table();

            create_db_instance.createDatabase(db_name, connection_to_server);

            connection_string = db_name; // Efter du har oprettet databasen, opdaterer du connection stringen
            connection_to_db = return_connection_to_server.getConnection(connection_string);

            create_table_instance.createTable(my_table, connection_to_db);

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
