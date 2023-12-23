package Pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Slf4j
public class BasePage {

    private WebDriver driver;

    public void initializeBrowser() {
        log.info("Initializing Chrome browser");
        driver = new ChromeDriver();

        log.info("Maximizing browser window");
        driver.manage().window().maximize();
    }

    public WebDriver getDriverInstance() {
        return driver;
    }

    public void clickOnLinkText(String linkTxt) {
        driver.findElement(By.xpath("//a[contains(text(), '" + linkTxt + "')]")).click();
        log.info("Clicked on " + linkTxt + " link");
    }

    public void moveForward() {
        driver.navigate().forward();
        log.info("Clicked on forward button of browser");
    }

    public void moveBack() {
        driver.navigate().back();
        log.info("Clicked on back button of browser");
    }

    public void refreshPage() {
        driver.navigate().refresh();
        log.info("Refreshed current browser window");
    }

    public String fetchApplicationURL() {
        return driver.getCurrentUrl();
    }

    public void terminateBrowser() {
        driver.quit();
        log.info("Closed browser window");
    }
}
