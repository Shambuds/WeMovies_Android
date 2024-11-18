package TestCase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseTest.Base;
import io.appium.java_client.AppiumBy;

public class TC009_Navigate_to_Explore extends Base {

    private WebElement driver;

	@Test(priority = 10)
    public void navigateToExplore() {
        WebElement exploreTab = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc='Explore']"));
        exploreTab.click();
        
        WebElement explorePage = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Explore Page']"));
        assertElementIsDisplayed(explorePage, "Failed to navigate to Explore page.");
    }
}
