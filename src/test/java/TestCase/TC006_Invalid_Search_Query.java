package TestCase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseTest.Base;
import io.appium.java_client.AppiumBy;

public class TC006_Invalid_Search_Query extends Base {

    private WebElement driver;

	@Test(priority = 6)
    public void invalidSearchQuery() {
        WebElement searchBar = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@content-desc='Search Bar']"));
        searchBar.sendKeys("InvalidMovie");
        
        WebElement noResultsMessage = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='No Results Found']"));
        assertElementIsDisplayed(noResultsMessage, "No results message is not displayed for invalid search.");
    }
}
