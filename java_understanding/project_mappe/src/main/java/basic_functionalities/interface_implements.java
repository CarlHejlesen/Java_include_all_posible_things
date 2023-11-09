package basic_functionalities;

public class interface_implements {
    // Et interface i Java er en abstrakt "kontrakt" der definerer en gruppe af abstrakte metoder, som implementerende klasser skal implementere.
  
    public interface Greetable {
        // En abstrakt metode uden kropsdel; den har ingen implementering.
        // Enhver klasse, der implementerer dette interface, skal levere en konkret implementering af denne metode.
        void greet();
    }
    
    // Klassen 'Person' implementerer 'Greetable' interfacet ved brug af 'implements' nøgleordet.
    // Dette tvinger 'Person' klassen til at levere implementeringer af alle abstrakte metoder defineret i 'Greetable'.
    public static class Person implements Greetable {
        private String name;
    
        // Constructor til at sætte navnet for personen.
        // Constructors er ikke en del af interfacet; de er specifikke for klassen.
        public  Person(String name) {
            this.name = name;
        }
    
        // Konkret implementering af 'greet' metoden specificeret af 'Greetable' interfacet.
        // '@Override' annotationen indikerer, at denne metode overskriver en metode fra en superklasse eller interfacet.
        @Override
        public void greet() {
            System.out.println("Hej, mit navn er " + name + ".");
        }
    }
    
    // En anden klasse 'Robot', som også implementerer 'Greetable' interfacet.
    // Dette demonstrerer, at flere klasser kan implementere samme interface, men med forskellige implementeringer.
    public static class Robot implements Greetable {
    
        // Robot klassens version af 'greet' metoden.
        // Denne implementering er forskellig fra 'Person' klassens implementering, hvilket er essensen af polymorfisme.
        @Override
        public void greet() {
            System.out.println("Beep boop - en hilsen fra en robot.");
        }
    }
    

}
