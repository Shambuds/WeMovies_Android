package TestCase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseTest.Base;
import io.appium.java_client.AppiumBy;

public class TC002_Verify_App_Title extends Base {

    private WebElement driver;

	@Test(priority = 2)
    public void verifyAppTitle() {
        WebElement title = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='App Title']"));
        assertElementIsDisplayed(title, "App title is not displayed.");
    }
}
