package validation_classes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;




public class email_validationTest {

    public class Teststring {
        private String teststring;
        private boolean shouldBe;

        public Teststring(String teststring, boolean shouldBe) { // Setter metode
            this.teststring = teststring;
            this.shouldBe = shouldBe;
        }

        // Getter metoder
        public String get_test_string() {
            return teststring;
        }

        public boolean get_shouldBe() {
            return shouldBe;
        }

    }

    @Test
    public void testValidates_email() {
 // Method to test
        // * Must contain "@" and "." Be at least 2 letters long, and max 50 letters
        // long*/

        // Makes instance of class
        Teststring[] testStringArray = {
                new Teststring("ca", false),
                new Teststring("c", false),
                new Teststring("", false),
                new Teststring("carl@", false),
                new Teststring("carl@sd.com", true),
                new Teststring("carldads.com", false),
                new Teststring("carl2312d@!!-com", false),
                new Teststring("carl2312d@!!-.com", true),
                new Teststring(
                        "carl2312adajhdawoidjawodpoawdjawdojawdhawpodjawoidjapodjwaiodjasådqwadjawidjawoildjmd@!!-com",
                        false)
        };
        email_validation instance_of_email_validation_class = new email_validation();

        for (int i = 0; i < testStringArray.length; i++) {

            boolean resoult_of_validation = instance_of_email_validation_class.validates_email(testStringArray[i].get_test_string());
            assertEquals(testStringArray[i].get_shouldBe(), resoult_of_validation);

        }

        // How assert Equals work assertEquals(comparing this value, to this value);

    }
}
