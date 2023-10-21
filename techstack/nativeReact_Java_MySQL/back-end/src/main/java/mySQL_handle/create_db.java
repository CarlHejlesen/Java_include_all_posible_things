package mySQL_handle;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class create_db {
    
public void createDatabase(String dbName, Connection connection) {
    String createDbQuery = "CREATE DATABASE " + dbName;
    try (Statement stmt = connection.createStatement()) {

        stmt.executeUpdate(createDbQuery);
        System.out.println("Database " + dbName + " created successfully!");

    } catch (SQLException e) {
        System.err.println("Failed to create database: " + e.getMessage());
    }
}




}
