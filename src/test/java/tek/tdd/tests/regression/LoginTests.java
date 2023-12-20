package tek.tdd.tests.regression;

import org.testng.Assert;
import org.testng.annotations.Test;
import tek.tdd.base.UITestsBase;
import tek.tdd.pages.HomePage;
import tek.tdd.pages.LoginPage;

public class LoginTests extends UITestsBase {
    //Navigate to sign in page and sing in with valid username and password.
    //Validate user successfully signed in.

    @Test
    public void validateSuccessLogin() {
        HomePage homePage = new HomePage();
        clickOnElement(homePage.signInButton);

        LoginPage loginPage = new LoginPage();
        sendTextToElement(loginPage.emailInput, "jawid10@gmail.com");
        sendTextToElement(loginPage.passwordInput, "Tek12345$");
        clickOnElement(loginPage.loginButton);

        boolean isAccountLinkDisplayed = isElementDisplayed(homePage.accountLinkButton);
        Assert.assertTrue(isAccountLinkDisplayed,
                "Account Link should display after success login");
    }
}
