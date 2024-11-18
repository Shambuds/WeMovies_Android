package TestCase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseTest.Base;
import io.appium.java_client.AppiumBy;

public class TC005_Verify_Search_Functionality extends Base {

    private WebElement driver;

	@Test(priority = 5)
    public void verifySearchFunctionality() {
        WebElement searchBar = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@content-desc='Search Bar']"));
        searchBar.sendKeys("Venom");
        
        WebElement firstResult = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Venom']"));
        assertElementIsDisplayed(firstResult, "Search result for 'Venom' is not displayed.");
    }
}
