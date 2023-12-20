package tek.tdd.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import tek.tdd.utility.SeleniumUtilities;

public class UITestsBase extends SeleniumUtilities {

    @BeforeMethod
    public void initializeTest() {
        openBrowser();
    }

    @AfterMethod
    public void testClosure() {
        closeBrowser();
    }
}
