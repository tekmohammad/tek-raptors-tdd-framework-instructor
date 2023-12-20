package tek.tdd.tests.regression;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
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

    @Test(dataProvider = "negativeData")
    public void negativeLoginTest(String email, String password, String expectedError) {
        HomePage homePage = new HomePage();
        clickOnElement(homePage.signInButton);

        LoginPage loginPage = new LoginPage();
        sendTextToElement(loginPage.emailInput, email);
        sendTextToElement(loginPage.passwordInput, password);
        clickOnElement(loginPage.loginButton);
        String actualErrorMessage = getElementText(loginPage.errorMessageElement);
        Assert.assertEquals(actualErrorMessage, expectedError , "Wrong username test");
    }

    //Data Provider is use for test with parameter and multiple data.
    @DataProvider(name = "negativeData")
    private String[][] negativeTestData() {
        String[][] testData = {
                {"wrong@email.com" , "Tek12345$" , "wrong username or password"},
                {"jawid10@gmail.com" , "wrongPassword" , "wrong username or password"},
                {"jawid10@gmail.com" , "wrongPassword" , "wrong username or password"},
                {"jawid10@gmail.com" , "wrongPassword" , "wrong username or password"},
                {"jawid10@gmail.com" , "wrongPassword" , "wrong username or password"},
                {"jawid10@gmail.com" , "wrongPassword" , "wrong username or password"},
                {"jawid10@gmail.com" , "wrongPassword" , "wrong username or password"}
        };
        return testData;
    }
}
