package medium_functionalities;

public class try_and_catch_throw {

    public void try_and_catch_exceptions() {
    /*
     * I java er det sådan at når man skal fange en fejl, så programmet ikke crasher skal man
     * specificere vilken fejl man ønsker at fange, her er et par eksempler.
     * Fejlene bliver automatisk smidt, når man prøver at gøre noget ulovligt. Som fx at tjekke længden af Null
     */

    // Du kan bruge den gennerelle "Exception" den indeholder alle Exceptions men gør det sværere at se hvad der går galt 
        try {
            // 1. ArithmeticException
            int result = 10 / 0;
            System.out.println(result);

            // 2. NullPointerException
            String str = null;
            int length = str.length();

            // 3. NumberFormatException
            int num = Integer.parseInt("ABC");

            // 4. ArrayIndexOutOfBoundsException
            int[] arr = new int[5];
            System.out.println(arr[10]);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            // Dette vil fange alle andre exceptions
            System.out.println("Generel fejl: " + e.getMessage());
        }

    }

}
