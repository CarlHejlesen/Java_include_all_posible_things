package medium_functionalities;

import java.util.HashMap;

public class hashmap {
    /*
     * HashMap er en datastruktur, der lagrer par af nøgler og værdier. Hver nøgle
     * er unik, og den er knyttet (eller "mappet") til en specifik værdi. Tænk på
     * det som en ordbog: Hvert ord (nøgle) har en definition (værdi), og du kan
     * ikke have det samme ord med to forskellige definitioner.
     */
    public void hashmap() {
        // Opretter en ny HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Tilføjer nøgle-værdi-par til mappen
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Henter en værdi ved hjælp af en nøgle
        int alice_age = map.get("Alice");
        System.out.println("Alice's age: " + alice_age);

        // Tjekker om en nøgle findes i mappen
        boolean hasBob = map.containsKey("Bob");
        System.out.println("Has Bob? " + hasBob);

        // Fjerner et nøgle-værdi-par
        map.remove("Charlie");

        // Itererer over nøgler
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        HashMap<String, String> stringMap = new HashMap<>();
        stringMap.put("key1", "value1");
        stringMap.put("key2", "value2");
        System.out.println(stringMap.get("key1")); // Output: value1

        HashMap<Integer, Integer> intMap = new HashMap<>();
        intMap.put(1, 100);
        intMap.put(2, 200);
        System.out.println(intMap.get(1)); // Output: 100

    }

    public class person3 { // Laver local classe
        private String name;

        public person3(String name) { // Setter metode
            this.name = name;

        }

        // Getter metoder
        public String getName() {
            return name;
        }

    }

    public void hasmap_with_object() { // hvordan vi kan opbevare objector i hasmap
        person3 carl = new person3("Carl");
        HashMap<person3, Integer> personAgeMap = new HashMap<>();
        personAgeMap.put(carl, 23);
        System.out.println(personAgeMap.get(carl));// Printer værdien 23
    }
}
