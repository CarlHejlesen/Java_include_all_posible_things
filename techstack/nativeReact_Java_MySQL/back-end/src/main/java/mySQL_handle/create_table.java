package mySQL_handle;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class create_table {
    public void createTable(String tableName, Connection connection) {

        String createTableQuery = "CREATE TABLE person (" // Starter definitionen for oprettelsen af en ny tabel ved
                                                          // navn 'person'
                + "id INT NOT NULL AUTO_INCREMENT, " // Definerer en kolonne ved navn 'id' som er af typen INT.
                                                     // 'NOT NULL' betyder, at kolonnen ikke kan indeholde NULL-værdier.
                                                     // 'AUTO_INCREMENT' betyder, at for hver ny række, vil værdien
                                                     // automatisk stige.

                + "name VARCHAR(255) NOT NULL, " // Definerer en kolonne ved navn 'name', der kan indeholde tekst op til
                                                 // 255 tegn.
                                                 // 'NOT NULL' betyder, at kolonnen skal have en værdi (den kan ikke
                                                 // være tom).

                + "birthdate DATE DEFAULT CURRENT_DATE, " // Definerer en kolonne ved navn 'birthdate' til datoer.
                                                          // Hvis ingen værdi gives ved indsættelse, vil den automatisk
                                                          // få dagens dato ('CURRENT_DATE').

                + "email VARCHAR(255) UNIQUE NOT NULL, " // Definerer en kolonne ved navn 'email', der kan indeholde
                                                         // tekst op til 255 tegn.
                                                         // 'UNIQUE' sikrer, at alle email-adresser i denne kolonne er
                                                         // unikke.
                                                         // 'NOT NULL' betyder, at denne kolonne ikke kan være tom.

                + "PRIMARY KEY (id))"; // Angiver, at kolonnen 'id' er den primære nøgle for tabellen, hvilket sikrer,
                                       // at værdierne i denne kolonne er unikke.

        // For simplicity, we're creating a table with 3 columns: id, name, and age.
        try (
                Statement stmt = connection.createStatement()) {

            stmt.executeUpdate(createTableQuery);
            System.out.println("Table " + tableName + " created successfully!");

        } catch (SQLException e) {
            System.err.println("Failed to create table: " + e.getMessage());
        }
    }
}
