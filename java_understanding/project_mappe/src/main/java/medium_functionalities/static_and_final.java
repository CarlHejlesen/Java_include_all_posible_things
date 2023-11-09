package medium_functionalities;

public class static_and_final {
    // Static bruges når vi ønsker en variable som er tilknyttet vores klasse og ikke vores inviduelle object.  
    // Her er et eksempel på hvordan det kan bruges

    // En static variabel, som vil tælle antallet af instanser af denne klasse.
    private static int instanceCount = 0;

    // En static final variabel, hvilket er en konstant og kan ikke ændres.
    public static final String CONSTANT_EXAMPLE = "Konstant værdi";

    // Constructor der øger instanceCount hver gang en ny instans skabes.
    public static_and_final() {
        instanceCount++;
    }

    // En static metode, der returnerer antallet af skabte instanser.
    public static int getInstanceCount() {
        return instanceCount;
    }

    // En static blok, der kan bruges til at initialisere komplekse static variabler eller udføre setup før klassen anvendes.
    static {
        System.out.println("Klassen static_and_final er blevet indlæst, og static blokken er udført.");
    }
    
    
    // final bruges når vi ønsker at gøre en instansvariabel uforanderlig efter tildeling.
    // Den skal initialiseres i constructoren, hvis den ikke allerede er det ved deklaration.
    
    // En final instansvariabel
    private final String instanceID;

    // Constructor modtager nu en String som initialiserer den final instansvariabel.
    public static_and_final(String id) {
        this.instanceID = id; // Tildeler den final variabel en værdi ved objektets oprettelse.
        instanceCount++;
    }
    
    // En metode der returnerer den uforanderlige instansvariabel.
    public String getInstanceID() {
        return instanceID;
    }
}
