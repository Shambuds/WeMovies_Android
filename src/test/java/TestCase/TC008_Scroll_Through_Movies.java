package TestCase;

import org.testng.annotations.Test;

import BaseTest.Base;

public class TC008_Scroll_Through_Movies extends Base {

    private Object driver;

	@Test(priority = 9)
    public void scrollThroughMovies() {
        driver.notify();
    }
}
