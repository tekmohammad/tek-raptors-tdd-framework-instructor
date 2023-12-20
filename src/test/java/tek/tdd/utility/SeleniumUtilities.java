package tek.tdd.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.tdd.base.BaseSetup;

import java.time.Duration;

public class SeleniumUtilities extends BaseSetup {

    public WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    }

    public String getElementText(WebElement element) {
      return  getWait().until(ExpectedConditions.visibilityOf(element)).getText();
    }
}
