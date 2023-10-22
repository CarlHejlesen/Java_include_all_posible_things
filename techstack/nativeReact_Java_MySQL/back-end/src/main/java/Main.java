import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import mySQL_handle.GetFirstDataInSkema;
import mySQL_handle.create_db;
import mySQL_handle.create_table;
import mySQL_handle.get_all_people;
import mySQL_handle.insert_person_in_table;
import mySQL_handle.return_connection_to_server;
public class Main {
    public static void main(String[] args) {

        String db_name = "my_first_db";
        String my_table = "my_first_table";
        String connection_string = "";
        System.out.println("Hello world!");

        Connection connection_to_server = null;
        Connection connection_to_db = null;

        try {
            connection_to_server = return_connection_to_server.getConnection(connection_string);

            create_db create_db_instance = new create_db();
            create_table create_table_instance = new create_table();

            create_db_instance.createDatabase(db_name, connection_to_server);

            connection_string = db_name; // Efter du har oprettet databasen, opdaterer du connection stringen
            connection_to_db = return_connection_to_server.getConnection(connection_string);

            create_table_instance.createTable(my_table, connection_to_db);

            insert_person_in_table insert_person_in_table_instance = new insert_person_in_table(connection_to_db);
            String user1_name="karl SKovgaard";
            int user1_age=3;
            String table_name_to_insert_in=my_table;
            insert_person_in_table_instance.insertUser(user1_name, user1_age, table_name_to_insert_in);

            get_all_people get_all_people_instance = new get_all_people(connection_to_db);
            List<get_all_people.Person> persons = get_all_people_instance.getAllPersons(my_table);
            for (get_all_people.Person person : persons) {
                System.out.println(person);
            }

            GetFirstDataInSkema getFirstDataInSkema_instance = new GetFirstDataInSkema(connection_to_db);
            String name_to_serch_for = "karl SKovgaard";
            String table_to_search_in= my_table;
            int age = getFirstDataInSkema_instance.getAgeByName(name_to_serch_for, table_to_search_in);
            if (age != -1) {
                System.out.println(name_to_serch_for+"'s age is: " + age);
            } else {
                System.out.println(name_to_serch_for+"'s age not found in the database.");
            }


        } finally {
            try {
                if (connection_to_server != null) {
                    connection_to_server.close();
                    System.out.println("Forbindelse til serveren lukket!");
                }
                if (connection_to_db != null) {
                    connection_to_db.close();
                    System.out.println("Forbindelse til databasen lukket!");
                }
            } catch (SQLException e) {
                System.err.println("Fejl ved lukning af forbindelse: " + e.getMessage());
            }
        }
    }
}
