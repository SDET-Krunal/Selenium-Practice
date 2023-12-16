package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BasePage {

    public static final String appURL = "https://the-internet.herokuapp.com/";
    public WebDriver driverInstance;
    private WebDriver driver;

    @BeforeTest
    public void initializeBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(appURL);
        driverInstance = driver;
    }

    public WebDriver getDriverInstance() {
        return driverInstance;
    }

    @AfterTest
    public void terminateBrowser() {
        driver.quit();
    }
}
