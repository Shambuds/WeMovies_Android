package BaseTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Base {
    AppiumDriverLocalService service;
    AndroidDriver driver;

    // Method to start Appium server
    public void startAppiumServer() throws MalformedURLException, URISyntaxException {
        service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\shambdss\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib"))
                .withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start();
    }

    // Method to stop Appium server
    public void stopAppiumServer() {
        if (service != null) {
            service.stop();
        }
    }

    // Method to initialize Android driver
    public AndroidDriver initializeDriver() throws MalformedURLException, URISyntaxException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("WeMoviesAndroid");
        options.setApp("C:\\workspace\\S\\Appium\\src\\test\\resources\\WeWork debug.apk");
        options.setCapability("autoGrantPermissions", true);

        driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
        return driver;
    }

    // Method to find element by XPath
    public WebElement findElement(String locator) {
        return driver.findElement(AppiumBy.xpath(locator));
    }

    // Method to click on an element
    public void clickElement(WebElement element) {
        element.click();
    }

    // Method to send text to an element
    public void sendKeys(WebElement element, String text) {
        element.sendKeys(text);
    }

    // Method to verify if an element is displayed
    public void assertElementIsDisplayed(WebElement element, String errorMessage) {
        Assert.assertTrue(element.isDisplayed(), errorMessage);
    }

    // Method to scroll through the screen
    public void scrollThroughScreen() {
        driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
    }
}
