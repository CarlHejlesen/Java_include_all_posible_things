package methods_examples;

public class class_extiension {
    // Superklasse
    class Animal {
        String name;

        void eat() {
            System.out.println(name + " is eating.");
        }

        void sleep() {
            System.out.println(name + " is sleeping.");
        }
    }

    // Underklasse
    class Dog extends Animal {
        void bark() {
            System.out.println(name + " is barking.");
        }

        // Overridning af eat metoden fra Animal klassen
        @Override
        void eat() {
            System.out.println(name + " is eating dog food.");
        }
    }

    public void how_to_use_example() {
        Dog myDog = new Dog();
        myDog.name = "Buddy";

        myDog.eat(); // Output: Buddy is eating dog food.
        myDog.sleep(); // Output: Buddy is sleeping.
        myDog.bark(); // Output: Buddy is barking.
    }
}
