package basic_functionalities;
import mock_import_package.outerclass;
import mock_import_package.outerclass.innerclass;

public class subclasses {
    // i Java kan du lave klasser inde i dinne klasser, som fx kan have methods
    // her er hvordan du tilgår dem.

    public void accesing(){
        // først skal du lave en instance af outer class, for så bagefter at lave en instance af inner class
        outerclass instance_of_outer_class = new outerclass();
        // Bemærk at du bruger din allerede oprettede klasse til at oprette din næste classe.
        innerclass instance_of_inner_class = instance_of_outer_class.new innerclass();

        instance_of_inner_class.this_is_a_method_inside_the_inner_class();
    }
}
// Formål ved at lave inner classes, kan være fx hvis du skal et object i din klasse at arbejde med,
//men at du ikke ønsker at oprette en helt ny fil for dette.
