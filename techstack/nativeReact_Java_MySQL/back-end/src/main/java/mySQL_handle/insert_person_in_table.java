package mySQL_handle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class insert_person_in_table {
    private Connection connection;

    public insert_person_in_table(Connection connection) {
        this.connection = connection;
    }

    public void insertUser(String name, int age, String tableName) {
        String insertSQL = "INSERT INTO "+tableName +" (name, age) VALUES (?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(insertSQL)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Indsættelse var vellykket!");
            }
        } catch (SQLException e) {
            System.err.println("Fejl ved indsættelse af data: " + e.getMessage());
        }
    }
}
