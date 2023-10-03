package package_2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


import package_2.test_inputs_classes.email_validation.TestString;

public class Validation_classTest {

    @Test
    public void validates_email_test() {

        // Method to test
        // * Must contain "@" and "." Be at least 2 letters long, and max 50 letters
        // long*/

        // Makes instance of class
        TestString[] testStringArray = {
                new TestString("ca", false),
                new TestString("c", false),
                new TestString("", false),
                new TestString("carl@", false),
                new TestString("carl@sd.com", true),
                new TestString("carldads.com", false),
                new TestString("carl2312d@!!-com", false),
                new TestString("carl2312d@!!-.com", true),
                new TestString(
                        "carl2312adajhdawoidjawodpoawdjawdojawdhawpodjawoidjapodjwaiodjasådqwadjawidjawoildjmd@!!-com",
                        false)
        };
        Validation_class Test_instance = new Validation_class();

        for (int i = 0; i < testStringArray.length; i++) {

            boolean resoult_of_validation = Test_instance.validates_email(testStringArray[i].getTestString());
            assertEquals(testStringArray[i].isShouldBe(), resoult_of_validation);

        }

        // How assert Equals work assertEquals(comparing this value, to this value);

    }

}
