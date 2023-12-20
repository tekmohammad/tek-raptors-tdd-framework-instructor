package tek.tdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.tdd.tests.smoke.HomePageTests;
import tek.tdd.utility.SeleniumUtilities;

public class HomePage extends SeleniumUtilities {
    //Constructor to Initialize instance of driver
    //to instance elements of that Java Class.
    public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(className = "top-nav__logo")
    public WebElement homePageTitle;

    @FindBy(linkText = "Sign in")
    public WebElement signInButton;
}
