package TestCase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseTest.Base;
import io.appium.java_client.AppiumBy;

public class TC007_Check_Now_Playing_Section extends Base {

    private WebElement driver;

	@Test(priority = 8)
    public void checkNowPlayingSection() {
        WebElement nowPlayingSection = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='Now Playing']"));
        assertElementIsDisplayed(nowPlayingSection, "Now Playing section is not displayed.");
    }
}
