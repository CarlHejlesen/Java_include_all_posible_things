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

    // Metode til at hente alle personer fra databasen
    public List<Person> getAllPersons(String table) {
        List<Person> persons = new ArrayList<>();

        String sql = "SELECT * FROM "+table; // Brug det rigtige tabelnavn hvis det ikke er "person"

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                
                persons.add(new Person(id, name, age));
            }
        } catch (Exception e) {
            System.err.println("Error fetching data: " + e.getMessage());
        }

        return persons;
    }


}
