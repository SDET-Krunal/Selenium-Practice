package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AbTestPage extends BasePage {

    WebDriver driver;
    By pageHeading = By.tagName("h3");

    public AbTestPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageHeading() {
        return driver.findElement(pageHeading).getText();
    }
}
