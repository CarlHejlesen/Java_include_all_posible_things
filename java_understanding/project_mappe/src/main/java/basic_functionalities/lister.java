package basic_functionalities;

import java.util.ArrayList;
import java.util.List;

public class lister {

    // I java er arrays, statiske i størelsen, og det er derfor besværligt at
    // arbejde med
    // da hvis du ønsker at tilføje et element til din array skal du oprette
    // et nyt array med samme elementer og det nye element.

    // Derfor kan de være mere praktisk at bruge lister hvor du kan blive ved med at
    // tilføje
    // nye elementer uden at skulle lave en helt ny liste hver gang.

    // Når du skal til at vælge hvilken type liste.
    // SÅ BRUG ALTID ARRAY LISTE da det er bedre for performence.

    // Linked list fungere sådan
    /*
     * LinkedList bruger ekstra hukommelse for hver node til at gemme
     * to referencer (forrige og næste node)
     */

    public void Arraylist_examples() {
        // Opretter en ny ArrayList
        List<String> myList = new ArrayList<>();

        // Tilføjer elementer til listen
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");

        // Udskriver listen
        System.out.println(myList); // Output: [Apple, Banana, Cherry]

        // Tilføjer et element på en specifik position
        myList.add(1, "Orange");
        System.out.println(myList); // Output: [Apple, Orange, Banana, Cherry]

        // Fjerner et element fra listen
        myList.remove("Banana");
        System.out.println(myList); // Output: [Apple, Orange, Cherry]

        // Henter et element fra en specifik position
        String fruit = myList.get(2);
        System.out.println(fruit); // Output: Cherry

        // Finder indekset af et element
        int index = myList.indexOf("Orange");
        System.out.println(index); // Output: 1

        // Tjekker om listen indeholder et bestemt element
        boolean containsApple = myList.contains("Apple");
        System.out.println(containsApple); // Output: true
    }
}
