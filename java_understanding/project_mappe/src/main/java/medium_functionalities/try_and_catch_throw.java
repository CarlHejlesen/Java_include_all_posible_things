package medium_functionalities;

public class try_and_catch_throw {

    public void try_and_catch_exceptions() {
        /*
         * I java er det sådan at når man skal fange en fejl, så programmet ikke crasher
         * skal man
         * specificere vilken fejl man ønsker at fange, her er et par eksempler.
         * Fejlene bliver automatisk smidt, når man prøver at gøre noget ulovligt. Som
         * fx at tjekke længden af Null
         */

        // Du kan bruge den gennerelle "Exception" den indeholder alle Exceptions men
        // gør det sværere at se hvad der går galt
        try {
            // 1. ArithmeticException
            int result = 10 / 0;
            System.out.println(result);

            // 2. NullPointerException
            String str = null;
            int length = str.length();

            // 3. NumberFormatException
            int num = Integer.parseInt("ABC");

            // 4. ArrayIndexOutOfBoundsException
            int[] arr = new int[5];
            System.out.println(arr[10]);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            // Dette vil fange alle andre exceptions
            System.out.println("Generel fejl: " + e.getMessage());
        }

    }

    public void throw_() {
        // Med throw kan ud lave dine egne fejl hvor at programmet skal crashe, og fx
        // hvilken fejlmelding den burde give.
        // Det kan man gøre med throw,
        // Du kan ligesom med andre fejl "Cathce" disse fejl hvis du ikke ønsker at
        // programmet skal crashe i en try & cach

        try {// Eksempel på hvor fejl fanges
            // Simulerer en situation, hvor en betingelse fører til en fejl
            int age = -5;

            // Hvis alderen er negativ, kaster vi en exception
            if (age < 0) {
                throw new IllegalArgumentException("Alder kan ikke være negativ!");
            }// vi bruger udtrykket new fordi, det er ny klasse fejl

            // Resten af koden her vil kun blive udført, hvis der ikke er kastet nogen
            // exception
            System.out.println("Alder er: " + age);

        } catch (Exception e) {
            // Håndterer den exception, der blev kastet i try blokken
            System.out.println("En fejl opstod: " + e.getMessage());
        }
    }
}
