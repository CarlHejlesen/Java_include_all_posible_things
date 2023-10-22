package mySQL_handle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
// Class to insert a person's details into a specified table in a database
public class insert_person_in_table {

    // Database connection object
    private Connection connection;

    // Constructor for the class, takes a database connection as a parameter
    public insert_person_in_table(Connection connection) {
        this.connection = connection;
    }

    /**
     * Inserts a user's name and age into a specified table in the database.
     *
     * @param name       The name of the person to be inserted
     * @param age        The age of the person to be inserted
     * @param tableName  The name of the table where the data should be inserted
     */
    public void insertUser(String name, int age, String tableName) {
        // SQL query to insert data into the specified table
        String insertSQL = "INSERT INTO " + tableName + " (name, age) VALUES (?, ?)";
        
        try (
            // Prepare the SQL statement using the provided connection
            PreparedStatement pstmt = connection.prepareStatement(insertSQL)
        ) {
            // Set the parameters for the SQL query
            pstmt.setString(1, name);
            pstmt.setInt(2, age);

            // Execute the SQL update query and get the number of affected rows
            int affectedRows = pstmt.executeUpdate();

            // If the insertion was successful (i.e., affectedRows > 0), print a success message
            if (affectedRows > 0) {
                System.out.println("Insertion was successful!");
            }
        } catch (SQLException e) {
            // Handle potential SQL exceptions by printing an error message
            System.err.println("Error inserting data: " + e.getMessage());
        }
    }
}

