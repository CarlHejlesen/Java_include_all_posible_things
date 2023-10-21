package medium_functionalities;
import mock_import_package.person;


public class return_methods {
    public void void_method(int number) {
        if (number == 2) {
            System.out.println("Hello world!");
        }
    }

    public String how_to_return_a_string(boolean bool) {
        if (bool == false) {
            String myString = "string indehold!";
            return myString;
        }
        return "textstring";
    }

    public int how_to_return_a_int(int number) {
        int double_of_number = number + number;
        return double_of_number;
    }

    public int[] how_to_return_a_array() {
        int[] myIntArray = { 1, 2, 3 };
        return myIntArray;
    }

    public String[] how_to_return_a_string_array() {
        String[] myStringArray = { "Yes", "This", "how", "you", "do", "it!" };
        return myStringArray;
    }

    public boolean how_to_return_a_bool() {
        boolean mybool = false;
        return mybool;
    }

    public person how_to_return_object(String name, int age){
        person carl = new person("Carl", 23);
        return carl;
    }

    // Eksempel 2 på hvordan man kan retunere et object

    public class person2 { // Laver local classe
        private String name;
        private int age;

        public person2(String name, int age) { // Setter metode
            this.name = name;
            this.age = age;
        }

        // Getter metoder
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
    public person2 how_to_retunr_object2(String name, int age){
        person2 person = new person2(name, age);  // Opretter et nyt objekt af Person2 klassen
        return person;
    }
}
