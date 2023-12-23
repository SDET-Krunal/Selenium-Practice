package PracticeScripts;

import Config.Constant;
import Pages.AbTestPage;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Slf4j
public class TestNavigationCommands extends BaseTest {

    WebDriver driver;
    AbTestPage abTestPage;

    @Test
    public void testBackNavigation() {
        driver = getDriverInstance();
        clickOnLinkText(Constant.ABTESTING);

        abTestPage = new AbTestPage(driver);
        assert abTestPage.getPageHeading().equals(Constant.ABTESTPAGEHEADING);

        String urlBeforeMovingBack = fetchApplicationURL();
        log.info("Application URL before moving back :: " + urlBeforeMovingBack);

        moveBack();

        String urlAfterMovingBack = fetchApplicationURL();
        log.info("Application URL after moving back :: " + urlBeforeMovingBack);

        assert !urlBeforeMovingBack.equals(urlAfterMovingBack);
    }

    @Test
    public void testForwardNavigation() {
        driver = getDriverInstance();
        clickOnLinkText(Constant.ABTESTING);

        abTestPage = new AbTestPage(driver);
        assert abTestPage.getPageHeading().equals(Constant.ABTESTPAGEHEADING);

        moveBack();
        String urlBeforeMovingForward = fetchApplicationURL();
        log.info("Application URL before moving forward :: " + urlBeforeMovingForward);

        moveForward();

        String urlAfterMovingForward = fetchApplicationURL();
        log.info("Application URL before moving forward :: " + urlAfterMovingForward);

        assert !urlBeforeMovingForward.equals(urlAfterMovingForward);
    }
}
