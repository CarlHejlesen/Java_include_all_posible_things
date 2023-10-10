package basic_functionalities;

import java.util.Scanner;

public class input_output_scanner {
    
    public void how_to_print_and_get_input() {
        // * for at kunne scanne ting ind skal du import java.util.Scanner;

        System.out.print("Dette er en tekst uden linjeskift.");
        System.out.println("Dette er en tekst med linjeskift.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Indtast dit navn: ");
        String name = scanner.nextLine();

        System.out.println("Hej, " + name + "!");
        scanner.close();

        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Indtast et heltal: ");
        int number = scanner2.nextInt();

        System.out.println("Du indtastede tallet: " + number);
        scanner2.close();
    }
}
