package basic_functionalities;

import java.util.Scanner;

public class basic_stuff {

    public void deklaring_types() {
        int number = 42;

        // Deklaration af en String
        String text = "Hej verden!"; // Husk på at i java er strings objector
        // Så == sammenlignen gællder for både strings såvel som objektor
        // Deklaration af en char
        char letter = 'A';

        // Deklaration af en int array
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Deklaration af en String array
        String[] words = { "æble", "banan", "citron" };

    }

    public void if_comparisons() {
        int a = 5;
        int b = 10;

        // Operatorer
        if (a == b) { // Dette er også måden du kan sammenligne objector
            System.out.println("a er lig med b");
        } else if (a != b) {
            System.out.println("a er ikke lig med b");
        }

        if (a < b) {
            System.out.println("a er mindre end b");
        }

        if (a > b) {
            System.out.println("a er større end b");
        }

        if (a <= b) {
            System.out.println("a er mindre end eller lig med b");
        }

        if (a >= b) {
            System.out.println("a er større end eller lig med b");
        }

        // Nyttige metoder til sammenligning
        String str1 = "Hej";
        String str2 = "hej";

        if (str1.equals(str2)) {
            System.out.println("str1 er lig med str2");
        } else {
            System.out.println("str1 er ikke lig med str2");
        }

        if (str1.equalsIgnoreCase(str2)) { // ignore om ting er store eller små
            System.out.println("str1 er lig med str2 (uden at tage hensyn til store/små bogstaver)");
        }

        // Eksempler med compareTo
        if (str1.compareTo(str2) == 0) {
            System.out.println("str1 og str2 er ens");
        } else if (str1.compareTo(str2) < 0) {
            System.out.println("str1 kommer før str2");
        } else {
            System.out.println("str1 kommer efter str2");
        }

    }

    public void switcH() {
        int dayOfWeek = 4; // Lad os sige, at 4 repræsenterer onsdag

        switch (dayOfWeek) {
            case 1:
                System.out.println("Mandag");
                break;
            case 2:
                System.out.println("Tirsdag");
                break;
            case 3:
                System.out.println("Onsdag");
                break;
            case 4:
                System.out.println("Torsdag");
                break;
            case 5:
                System.out.println("Fredag");
                break;
            case 6:
                System.out.println("Lørdag");
                break;
            case 7:
                System.out.println("Søndag");
                break;
            default:
                System.out.println("Ugyldigt nummer for en ugedag");
        }
    }

    public void forloops() {

        int count = 0;
        while (count < 5) {
            System.out.println("Nummer: " + count);
            count++;
        }

        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // basicly javas for each loop
        int[] numbers2 = { 1, 2, 3, 4, 5 };
        for (int num : numbers2) {
            System.out.println(num);
        }
    }

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
