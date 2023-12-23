package PracticeScripts;

import Pages.BasePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest extends BasePage {

    public static final String appURL = "https://the-internet.herokuapp.com/";

    @BeforeMethod
    public void setupBrowser() {
        initializeBrowser();
        getDriverInstance().get(appURL);
    }

    @AfterMethod
    public void closeBrowser() {
        terminateBrowser();
    }
}
