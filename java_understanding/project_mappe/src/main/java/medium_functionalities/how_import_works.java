package medium_functionalities;

import mock_import_package.methods_to_import;
import mock_import_package.varibles_to_import;

public class how_import_works {
    // Jeg har lavet en Mock mappe med statiske variable og en med methods
    // Oppe i toppen kan man se at jeg har importere 2 klasser, fra packagen mock
    // import package

    // Husk på at når du importere, impotere du en klasse og ikke en object/instans
    // Derfor skal du oprette en instans a klassen før du kan tilgå nogen af
    // funktionerne
    public void how_to_acces_methods_you_imported() {
        // Her opretter vi en instans som vi så kan tilgå senere.
        // Den er af typen classe, med den specifikke klasse methods_to_import klassen.
        methods_to_import method_instans = new methods_to_import();
        
        method_instans.void_method(); // Sådan kalder vi en methods fra instansen
        // Du kan se hvad void_method gør i methods_to_import.java
        // Den printer "hello world" i consollen

    }

    public void how_to_acces_variables_you_imported() {
        varibles_to_import varibles = new varibles_to_import();
        System.out.println(varibles.text);
        // Printer vi String variable som hedder text "Hej verden" fra variables_to_import.java
    }
}
