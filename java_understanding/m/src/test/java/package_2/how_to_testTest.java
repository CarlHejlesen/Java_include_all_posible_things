package package_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class how_to_testTest {

    @Test
    public void testHow_to_return_a_array() {

    }

    /*
     * Jeg ønsker at denne test skal skal kunne validere 5 forskellige strings
     * Den skal teste for om dit input er en string.
     * Den skal teste for om dit string er over 2 bogstaver
     * Den skal teste for at dit string ikke er over 50 bogstaver
     * Den skal teste for at det første bogstav er stort
     * 
     * 
     * Den skal retunere lige så mange bools som den modtager.
     * Vi skal sammenligne vores input med det output bools. Vi ved hvad den burde
     * returnere
     * 
     */

    @Test
    public void testHow_to_return_a_bool() {
        //Jeg skal lave en instans af den klasse for at jeg kan kalde min method som jeg ønsker at teste
        how_to_test objekt = new how_to_test();


        // Definer testdata og forventede resultater
        String[] testStrings = { "GoodString", "bd", "A",
                "ThisIsAVeryLongStringThatShouldFailBecauseItIsOverFiftyCharacters", "lowercase" };
        boolean[] expectedResults = { true, false, false, false, false };
        
        for (int i = 0; i < testStrings.length; i++) {
            assertEquals(expectedResults[i], objekt.how_to_return_a_bool(testStrings[i]));
        }
    }

    @Test
    public void testHow_to_return_a_int() {

    }

    @Test
    public void testHow_to_return_a_string() {

    }

    @Test
    public void testHow_to_return_a_string_array() {

    }

    @Test
    public void testVoid_method() {

    }
}
