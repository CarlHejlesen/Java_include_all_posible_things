package mySQL_handle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// This class provides methods to establish a connection to a server.
public class return_connection_to_server {
    
    // Database connection constants
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD = "password";

    /**
     * Establishes a connection to a specified database.
     * If no database name is provided, it connects to the default MySQL server.
     * 
     * @param database Name of the database to connect to.
     * @return A Connection object if successful, null otherwise.
     */
    public static Connection getConnection(String database) {
        Connection connection = null;
        
        // If no database is specified, use an empty string.
        if(database == null) {
            database = "";
        }

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the specified database
            connection = DriverManager.getConnection(DATABASE_URL + database, DATABASE_USER, DATABASE_PASSWORD);
            
            if (connection != null) {
                System.out.println("Connection established!");
                return connection;
            } else {
                System.out.println("Could not establish connection to the database.");
                return null;
            }
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC driver not found: " + e.getMessage());
            return null;
        } catch (SQLException e) {
            System.err.println("Error establishing connection to the database: " + e.getMessage());
            return null;
        }
    }
}

