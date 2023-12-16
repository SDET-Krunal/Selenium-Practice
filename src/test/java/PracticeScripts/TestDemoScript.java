package PracticeScripts;

import PageObjects.BasePage;
import org.testng.annotations.Test;

public class TestDemoScript extends BasePage {

    @Test
    public void testDemo() {
        System.out.println("Driver instance :: " + getDriverInstance());
    }
}
