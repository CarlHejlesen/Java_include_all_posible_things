
import java.util.Arrays;



import basic_functionalities.how_to_methods;
import basic_functionalities.interface_implements.Greetable;
import basic_functionalities.interface_implements.Robot;
import medium_functionalities.static_and_final;
import basic_functionalities.interface_implements;

import basic_functionalities.interface_implements.Person;

public class Main {
    public static void main(String[] args) {// Her eksikvere vi vores kode fra. ALtså her starter vores kode.
        // System.out.println("Hello world!");

        how_to_methods class_1 = new how_to_methods();
        class_1.void_method();

        String how_to_recive_string = class_1.how_to_return_a_string();
        System.out.println(how_to_recive_string);

        int how_to_recive_int = class_1.how_to_return_a_int();
        System.out.println(how_to_recive_int);

        int[] how_to_recive_int_array = class_1.how_to_return_a_array();
        System.out.println(Arrays.toString(how_to_recive_int_array));
        // vi skal sige at den skal lave det om til print før vi printer, ellers printer
        // den kun addresen på array´en
        String[] how_to_recive_string_array = class_1.how_to_return_a_string_array();
        System.out.println(Arrays.toString(how_to_recive_string_array));

        // How static virker
        // På dette tidspunkt vil den static blok i static_and_final klassen køre.
        System.out.println(static_and_final.CONSTANT_EXAMPLE); // Output: Konstant værdi

        static_and_final obj1 = new static_and_final();
        static_and_final obj2 = new static_and_final();

        // Kald den static metode for at få antallet af instanser.
        System.out.println(static_and_final.getInstanceCount()); // Output: 2

        static_and_final obj1a = new static_and_final("ID-123");
        System.out.println("Objekt 1's ID: " + obj1.getInstanceID()); // Output: Objekt 1's ID: ID-123

        static_and_final obj2b = new static_and_final("ID-456");
        System.out.println("Objekt 2's ID: " + obj2.getInstanceID()); // Output: Objekt 2's ID: ID-456

        // Forsøg på at ændre obj1's instanceID ville resultere i en kompileringsfejl,
        // for eksempel:
        // obj1.instanceID = "ID-789"; // Dette ville ikke kompilere.

        // Output af instanceCount ved brug af static metode
        System.out.println("Antal instanser skabt: " + static_and_final.getInstanceCount()); // Output: Antal instanser
                                                                                             // skabt: 2

       

        Greetable person = new Person("Anna");
        Greetable robot = new Robot();

        // Begge objekter kan bruge 'greet' metoden, selvom de har forskellige
        // implementeringer.
        person.greet(); // Output: Hej, mit navn er Anna.
        robot.greet(); // Output: Beep boop - en hilsen fra en robot.

    }
}