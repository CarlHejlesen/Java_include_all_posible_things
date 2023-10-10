package medium_functionalities;

public class private_public_explained {

    /*
     * public: Når en klasse, metode eller variabel er erklæret som public,
     * betyder det, at den kan tilgås fra enhver anden klasse i ethvert andet pakke
     * (package).
     * Det er den mest permissive adgangsniveau.
     * 
     * Private: Dette er det mest restriktive adgangsniveau.
     * Elementer, der er erklæret som private, kan ikke tilgås uden for den klasse,
     * de er erklæret i.
     * De er skjult for andre klasser.
     */



     public void kan_bruges_af_andre_class_i_samme_fill(){
        //Denne her kan kaldes i helle medium_funcionalities folderen/packagen
     }

     private void kan_kun_bruges_i_denne_class(){
        //Denne her kan kun bruges i dennne fil, altså private_and_public_explained.java
     }
}
