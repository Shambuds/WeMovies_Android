package TestCase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseTest.Base;
import io.appium.java_client.AppiumBy;

public class VerifyWeMoviesLogo extends Base {

    private WebElement driver;

	@Test(priority = 1)
    public void verifyWeMoviesLogo() {
        WebElement logo = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc='WeMovies Logo']"));
        assertElementIsDisplayed(logo, "WeMovies logo is not displayed.");
    }
}
