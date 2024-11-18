package TestCase;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.Base;
import io.appium.java_client.AppiumBy;

public class ValidateDateFormat extends Base {

    private WebElement driver;

	@Test(priority = 7)
    public void validateDateFormat() {
        WebElement dateElement = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='Date']"));
        String dateText = dateElement.getText();
        String datePattern = "\\d{2}/\\d{2}/\\d{4}";
        
        Assert.assertTrue(dateText.matches(datePattern), "Date format is invalid.");
    }
}
