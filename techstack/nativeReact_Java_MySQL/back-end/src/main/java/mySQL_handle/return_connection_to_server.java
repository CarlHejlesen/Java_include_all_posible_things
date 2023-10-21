package mySQL_handle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class return_connection_to_server {
    

private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD = "password";

    public static Connection getConnection() {
        try {
            // Indlæs MySQL JDBC driveren
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Opret forbindelse
            return DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC driver ikke fundet: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Fejl ved oprettelse af forbindelse til databasen: " + e.getMessage());
        }
        return null;
    }

}
