package tek.tdd.tests.smoke;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import tek.tdd.base.UITestsBase;
import tek.tdd.pages.HomePage;

public class HomePageTests extends UITestsBase {

    //TestCase Navigate to retail app and validate
    // top-left corner Text is TEKSCHOOL
    @Test
    public void validatePageTitle() {
        String homePageTitle = getElementText(homePage.homePageTitle);
        Assert.assertEquals(homePageTitle, "TEKSCHOOL",
                "validate top left corner title");
    }

    //TestCase Navigate to retail app and make sure Sign in button is enabled.
    @Test
    public void validateSingInButtonEnabled() {
        boolean isSignInButtonEnabled = isElementEnabled(homePage.signInButton);
        Assert.assertTrue(isSignInButtonEnabled,
                "Sign in Button should be enabled");
    }
}
