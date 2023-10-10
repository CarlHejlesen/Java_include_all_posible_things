package basic_functionalities;

public class if_comparisons {
    public void if_comparisons() {
        int a = 5;
        int b = 10;

        // Operatorer
        if (a == b) { // Dette er også måden du kan sammenligne objector
            System.out.println("a er lig med b");
        } else if (a != b) {
            System.out.println("a er ikke lig med b");
        }

        if (a < b) {
            System.out.println("a er mindre end b");
        }

        if (a > b) {
            System.out.println("a er større end b");
        }

        if (a <= b) {
            System.out.println("a er mindre end eller lig med b");
        }

        if (a >= b) {
            System.out.println("a er større end eller lig med b");
        }

        // Nyttige metoder til sammenligning
        String str1 = "Hej";
        String str2 = "hej";

        if (str1.equals(str2)) {
            System.out.println("str1 er lig med str2");
        } else {
            System.out.println("str1 er ikke lig med str2");
        }

        if (str1.equalsIgnoreCase(str2)) { // ignore om ting er store eller små
            System.out.println("str1 er lig med str2 (uden at tage hensyn til store/små bogstaver)");
        }

        // Eksempler med compareTo
        if (str1.compareTo(str2) == 0) {
            System.out.println("str1 og str2 er ens");
        } else if (str1.compareTo(str2) < 0) {
            System.out.println("str1 kommer før str2");
        } else {
            System.out.println("str1 kommer efter str2");
        }

    }
}
