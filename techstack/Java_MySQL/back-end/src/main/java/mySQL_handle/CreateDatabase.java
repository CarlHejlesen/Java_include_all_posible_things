package mySQL_handle;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * This class provides a method to create a database.
 */
public class CreateDatabase {
    
    /**
     * Creates a new database with the given name using the provided connection.
     *
     * @param dbName     The name of the database to be created.
     * @param connection The JDBC connection object to the SQL server.
     */
    public void createDatabase(String dbName, Connection connection) {
        // SQL query to create a new database with the given name.
        String createDbQuery = "CREATE DATABASE " + dbName;

        // Try-with-resources block ensures that resources are closed at the end.
        try (Statement stmt = connection.createStatement()) {
            // Execute the query to create the database.
            stmt.executeUpdate(createDbQuery);

            // Print a success message to the console.
            System.out.println("Database " + dbName + " created successfully!");
        } catch (SQLException e) {
            // If any SQLException occurs, print an error message.
            System.err.println("Failed to create database: " + e.getMessage());
        }
    }
}
