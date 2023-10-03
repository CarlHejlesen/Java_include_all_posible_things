package package_2.test_inputs_classes.email_validation;

public class TestString implements ITestString {
    private String testString;
    private boolean shouldBe;

    public TestString(String testString, boolean shouldBe) {
        this.testString = testString;
        this.shouldBe = shouldBe;
    }

    @Override
    public String getTestString() {
        return testString;
    }

    @Override
    public void setTestString(String testString) {
        this.testString = testString;
    }

    @Override
    public boolean isShouldBe() {
        return shouldBe;
    }

    @Override
    public void setShouldBe(boolean shouldBe) {
        this.shouldBe = shouldBe;
    }
}

