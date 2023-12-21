package tek.tdd.base;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import tek.tdd.pages.HomePage;
import tek.tdd.pages.LoginPage;
import tek.tdd.utility.SeleniumUtilities;

@Listeners(ExtentITestListenerClassAdapter.class)
public class UITestsBase extends SeleniumUtilities {
    protected HomePage homePage;
    protected LoginPage loginPage;

    @BeforeMethod
    public void initializeTest() {
        openBrowser();
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @AfterMethod
    public void testClosure() {
        closeBrowser();
    }
}
