package package_1;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
public class class_1Test {
    // En variabel til at holde det output, der bliver udskrevet til konsollen
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    // En variabel til at holde den oprindelige System.out stream
    private final PrintStream originalOut = System.out;

    // Denne metode køres før hver test
    @Before
    public void setUpStreams() {
        // Omdirigerer System.out til outContent
        System.setOut(new PrintStream(outContent));
    }

    // Denne metode køres efter hver test
    @After
    public void restoreStreams() {
        // Gendanner System.out til originalOut
        System.setOut(originalOut);
    }

    // Din testmetode
    @Test
    public void testVoid_method() {
        // Opretter et objekt af class_1
        how_to_methods obj = new how_to_methods();
        
        // Kalder void_method på objektet
        obj.void_method();
        
        // Sammenligner outputtet med det forventede output
        assertEquals("Hello world!" + System.lineSeparator(), outContent.toString());  //Hvis du bruger Windows, bruger det \r\n for linjeskift. Dette kan få din test til at fejle, fordi strengen, der bliver udskrevet, faktisk vil være "Hello world!\r\n". For at undgå dette problem, kan du bruge System.lineSeparator()

    }
}
