package tek.examples;

import org.testng.annotations.*;

public class FirstTestNGTest {

    @BeforeMethod
    public void setupTest() {
        System.out.println("Set up tests Before Method");
    }

    @AfterMethod
    public void runAfterTest() {
        System.out.println("This method run after method");
    }

    @Test
    public void test1(){
        System.out.println("This test is first tests");
    }

    @Test
    public void test2() {
        System.out.println("This is test number 2");
    }

    @BeforeClass
    public void beforeAllTests() {
        System.out.println("Run Before All the test in this class.");
    }

    @AfterClass
    public void afterAllTests() {
        System.out.println("Run After All tests in this class");
    }
}
