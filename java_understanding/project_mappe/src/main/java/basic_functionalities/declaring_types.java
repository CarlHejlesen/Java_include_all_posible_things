package basic_functionalities;

public class declaring_types {
    public void deklaring_types() {
        int number = 42;

        // Deklaration af en String
        String text = "Hej verden!"; // Husk på at i java er strings objector
        // Så == sammenlignen gællder for både strings såvel som objektor
        // Deklaration af en char
        char letter = 'A';

        // Deklaration af en int array
        int[] numbers = { 1, 2, 3, 4, 5 };
        /*
         * I Java er arrays af fast størrelse, hvilket betyder, at du ikke direkte kan
         * tilføje et element til et eksisterende array. I stedet skal du oprette et nyt array med en
         * størrelse større med én og kopiere elementerne fra det gamle array over i det nye, og
         * derefter tilføje det nye tal.
         * 
         */
        // Deklaration af en String array
        String[] words = { "æble", "banan", "citron" };

    }
}
