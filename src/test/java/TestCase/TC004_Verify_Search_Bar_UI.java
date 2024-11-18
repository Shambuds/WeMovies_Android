package TestCase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseTest.Base;
import io.appium.java_client.AppiumBy;

public class TC004_Verify_Search_Bar_UI extends Base {

    private WebElement driver;

	@Test(priority = 4)
    public void verifySearchBarUI() {
        WebElement searchBar = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@content-desc='Search Bar']"));
        assertElementIsDisplayed(searchBar, "Search bar UI is not displayed correctly.");
    }
}
