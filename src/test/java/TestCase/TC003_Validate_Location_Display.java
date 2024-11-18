package TestCase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseTest.Base;
import io.appium.java_client.AppiumBy;

public class TC003_Validate_Location_Display extends Base {

    private WebElement driver;

	@Test(priority = 3)
    public void validateLocationDisplay() {
        WebElement location = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='Location']"));
        assertElementIsDisplayed(location, "Location is not displayed.");
    }
}
