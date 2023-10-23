package mySQL_handle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class get_all_people {

    private Connection connection;

    public get_all_people(Connection connection) {
        this.connection = connection;
    }

    // En indre klasse til at repræsentere en person
    public static class Person {
        private int id;
        private String name;
        private int age;

        public Person(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Age: " + age;
        }
    }

    /**
     * Fetches all persons from a given table in the database.
     *
     * @param table Name of the table to fetch persons from.
     * @return List of persons fetched from the database.
     */
    public List<Person> getAllPersons(String table) {
        // Initialize an empty list to store persons fetched from the database.
        List<Person> persons = new ArrayList<>();

        // Construct SQL query to select all records from the specified table.
        String sql = "SELECT * FROM " + table;

        try (
                // Create a statement object for executing the SQL query.
                Statement statement = connection.createStatement();

                // Execute the SQL query and store the results in a ResultSet.
                ResultSet resultSet = statement.executeQuery(sql)) {
            // Iterate over each record in the ResultSet.
            while (resultSet.next()) {
                // Extract data for each person from the current record.
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                // Create a new Person object with the extracted data and add it to the list.
                persons.add(new Person(id, name, age));
            }
        } catch (Exception e) {
            // Print an error message if there's any exception during database operations.
            System.err.println("Error fetching data: " + e.getMessage());
        }

        // Return the list of persons fetched from the database.
        return persons;
    }

}
