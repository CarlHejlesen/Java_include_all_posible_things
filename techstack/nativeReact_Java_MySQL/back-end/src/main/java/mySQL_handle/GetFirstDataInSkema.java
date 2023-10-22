package mySQL_handle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// This class is responsible for fetching specific data from a given database table (skema).
public class GetFirstDataInSkema {

    // A private member variable to hold the database connection.
    private Connection connection;

    // Constructor that initializes the class with a database connection.
    public GetFirstDataInSkema(Connection connection) {
        this.connection = connection;
    }

    /**
     * Fetches the age of a person based on their name from a specified table.
     * 
     * @param name Name of the person to fetch the age for.
     * @param tablename The name of the database table to search within.
     * @return Age of the person. Returns -1 if not found or an error occurs.
     */
    public int getAgeByName(String name, String tablename) {
        // Create the SQL query string to fetch the age of the person based on their name from the specified table.
        String query = "SELECT age FROM " + tablename + " WHERE name = '" + name + "'";
        
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            // Execute the SQL query.
            ResultSet resultSet = statement.executeQuery();
    
            // If a result is found, return the age.
            if (resultSet.next()) {
                return resultSet.getInt("age");
            }
        } catch (SQLException e) {
            // Print an error message if there's an exception during the SQL operation.
            System.err.println("Error fetching age: " + e.getMessage());
        }
        
        // If no result is found or an error occurs, return -1.
        return -1;
    }
}

