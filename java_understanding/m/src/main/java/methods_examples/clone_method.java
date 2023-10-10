package methods_examples;

public class clone_method {
    // Klasse Box implementerer Cloneable interfacet, hvilket indikerer,
    // at objekter af denne klasse kan klones.
    class Box implements Cloneable {
        // To instansvariabler: width og height.
        int width;
        int height;

        // Konstruktør for Box klassen, der tager width og height som parametre.
        public Box(int width, int height) {
            this.width = width; // Initialiserer width variablen med den givne værdi.
            this.height = height; // Initialiserer height variablen med den givne værdi.
        }

        // Overskrivning af clone() metoden fra Object klassen.
        @Override
        protected Object clone() throws CloneNotSupportedException {
            // Bruger den standard clone() metode fra Object klassen
            // til at udføre en overfladisk kopi af dette objekt.
            return super.clone();
        }

        // En metode, der returnerer en strengrepræsentation af Box objektet.
        @Override
        public String toString() {
            return "Box [width=" + width + ", height=" + height + "]";
        }
    }

    public void where_stuff_will_execute() {
        try {
            // Opretter en ny instans af Box klassen med width=10 og height=20.
            Box originalBox = new Box(10, 20);

            // Kloner den originale boks for at oprette en ny, separat instans
            // med de samme værdier for width og height.
            Box clonedBox = (Box) originalBox.clone();

            // Udskriver det originale og det klonede Box objekt.
            System.out.println("Original: " + originalBox);
            System.out.println("Cloned: " + clonedBox);

        } catch (CloneNotSupportedException e) {
            // Hvis Box objektet ikke kunne klones (f.eks. hvis det ikke implementerede
            // Cloneable),
            // vil en CloneNotSupportedException blive kastet. Her fanger vi denne
            // undtagelse
            // og udskriver dens stakspor for fejlfinding.
            e.printStackTrace();
        }
    }
}
