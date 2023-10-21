package mySQL_handle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class return_connection_to_server {
    

private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD = "password";

    public static Connection getConnection(String database) {
        Connection connection = null;
        if(database==null){
            database="";
        }
        try {
            // Indlæs MySQL JDBC driveren
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Opret forbindelse
            connection = DriverManager.getConnection(DATABASE_URL+database, DATABASE_USER, DATABASE_PASSWORD);
            
            if (connection != null) {
                System.out.println("Forbindelse oprettet!");
                return connection;
            } else {
                System.out.println("Kunne ikke oprette forbindelse til databasen.");
                return null;
            }
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC driver ikke fundet: " + e.getMessage());
            return null;
        } catch (SQLException e) {
            System.err.println("Fejl ved oprettelse af forbindelse til databasen: " + e.getMessage());
            return null;
        }
    }
}
