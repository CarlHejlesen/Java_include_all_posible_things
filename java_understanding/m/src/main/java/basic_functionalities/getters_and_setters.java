package basic_functionalities;

public class getters_and_setters {
    /*
     * 
     * Hvorfor bruge getters og setters?
     * Kontrol: Ved at gøre variabler private og kun give adgang til dem via getters
     * og setters, kan du kontrollere, hvordan de læses og ændres. For eksempel kan
     * du forhindre, at en variabel sættes til en ugyldig værdi.
     * 
     * Fleksibilitet: Hvis du senere beslutter at ændre, hvordan en variabel
     * fungerer (f.eks. tilføje validering eller logning), kan du gøre det uden at
     * ændre den kode, der bruger klassen.
     * 
     * Indkapsling: Det skjuler den interne repræsentation af objektet fra eksterne
     * klasser, hvilket hjælper med at adskille, hvad der er vigtigt for eksterne
     * klasser fra de interne detaljer.
     * 
     */
    public class Person {
        private String name;
        private int age;

        // Konstruktør
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Setter for name
        public void setName(String name) {
            this.name = name;
        }

        // Getter for age
        public int getAge() {
            return age;
        }

        // Setter for age med validering
        public void setAge(int age) {
            if (age > 0) {
                this.age = age;
            } else {
                System.out.println("Invalid age!");
            }
        }
    }

    public void example() {
        Person person = new Person("Alice", 25);
        System.out.println(person.getName()); // Output: Alice
        System.out.println(person.getAge()); // Output: 25

        person.setName("Bob");
        person.setAge(-5); // Output: Invalid age!

        System.out.println(person.getName()); // Output: Bob
        System.out.println(person.getAge()); // Output: 25 (age hasn't changed because -5 is invalid)
    }
}
