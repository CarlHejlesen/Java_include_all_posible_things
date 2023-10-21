package basic_functionalities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class input_output_scanner {

    // * Hver opmærksom på at hvis personen ikke indtaster det korrekte input vil
    // programmet smide en fejl InputMismatchException
    // her er et eksempel på hvordan man skal håndtere input

    public void how_to_handle_false_input() {
        Scanner scanner = new Scanner(System.in);
        int number = 0; // Initialiserer variablen udenfor loopet
        boolean isValid = false; // Flag for at kontrollere, om inputtet er gyldigt

        while (!isValid) {
            System.out.print("Indtast et heltal: ");
            try {
                number = scanner.nextInt();
                isValid = true; // Hvis vi når hertil, er inputtet gyldigt
                System.out.println("Du indtastede tallet: " + number);
            } catch (InputMismatchException e) {
                System.out.println("Det indtastede er ikke et gyldigt heltal. Prøv igen.");
                scanner.nextLine(); // For at rydde bufferen
            }
        }
        scanner.close(); // Lukker scanneren, når vi er færdige
    }

    public void how_to_print_and_get_input() {

        Scanner scanner = new Scanner(System.in);

        // 1. next(): Returnerer det næste token (typisk op til whitespace).
        System.out.print("Indtast et ord: ");
        String word = scanner.next();
        System.out.println("Du indtastede ordet: " + word);

        // 2. nextLine(): Returnerer resten af den aktuelle linje.
        scanner.nextLine(); // Forbruger det overskydende linjeskift fra forrige input
        System.out.print("Indtast en sætning: ");
        String sentence = scanner.nextLine();
        System.out.println("Du indtastede sætningen: " + sentence);

        // 3. nextInt(): Scanser det næste token som et int.
        System.out.print("Indtast et heltal: ");
        int number = scanner.nextInt();
        System.out.println("Du indtastede tallet: " + number);

        // 4. nextDouble(): Scanser det næste token som et double.
        System.out.print("Indtast et decimaltal: ");
        double decimal = scanner.nextDouble();
        System.out.println("Du indtastede tallet: " + decimal);

        // 5. nextFloat(): Scanser det næste token som et float.
        System.out.print("Indtast et float tal: ");
        float floatNumber = scanner.nextFloat();
        System.out.println("Du indtastede tallet: " + floatNumber);

        // 6. nextBoolean(): Scanser det næste token som en boolean.
        System.out.print("Indtast enten 'true' eller 'false': ");
        boolean boolValue = scanner.nextBoolean();
        System.out.println("Du indtastede: " + boolValue);

        // 7. nextByte(): Scanser det næste token som et byte.
        System.out.print("Indtast et byte tal (mellem -128 og 127): ");
        byte byteValue = scanner.nextByte();
        System.out.println("Du indtastede: " + byteValue);

        // 8. nextLong(): Scanser det næste token som et long.
        System.out.print("Indtast et long tal: ");
        long longValue = scanner.nextLong();
        System.out.println("Du indtastede: " + longValue);

        // 9. nextShort(): Scanser det næste token som et short.
        System.out.print("Indtast et short tal: ");
        short shortValue = scanner.nextShort();
        System.out.println("Du indtastede: " + shortValue);

        // 10. useDelimiter(): Ændrer delimiteren, som Scanner bruger til at adskille
        // tokens.
        scanner.useDelimiter(","); // Ændrer delimiteren til et komma
        System.out.print("Indtast to ord adskilt med et komma (f.eks. 'ord1,ord2'): ");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        System.out.println("Du indtastede: " + firstWord + " og " + secondWord);

        scanner.close();
    }
}
