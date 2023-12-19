package tek.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumExample {
    private static WebDriver driver;

    @BeforeMethod
    public void setupTests() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://retail.tekschool-students.com/");
    }

    @Test
    public void testPageTitle() {
        By pageTitle = By.className("top-nav__logo");
        String actualTitleText = driver.findElement(pageTitle).getText();
        Assert.assertEquals(actualTitleText, "TEKSCHOOL");
    }

    @AfterMethod
    public void closeTest() {
        driver.quit();
    }
}
