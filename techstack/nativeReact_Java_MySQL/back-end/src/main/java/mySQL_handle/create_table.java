package mySQL_handle;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class create_table {
    public void createTable(String tableName, Connection connection) {
    String createTableQuery = "CREATE TABLE " + tableName + " "
                            + "(id INT NOT NULL AUTO_INCREMENT, "
                            + " name VARCHAR(255), "
                            + " age INT, "
                            + " PRIMARY KEY ( id ))"; // For simplicity, we're creating a table with 3 columns: id, name, and age.

    try (
         Statement stmt = connection.createStatement()) {

        stmt.executeUpdate(createTableQuery);
        System.out.println("Table " + tableName + " created successfully!");

    } catch (SQLException e) {
        System.err.println("Failed to create table: " + e.getMessage());
    }
}
}
