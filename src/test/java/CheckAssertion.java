import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAssertion {
    public  ChromeDriver driver;

    @Before
    public void SetUp() {
        String axePath = "/Users/anthony/Docs/Java Libraries/Drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", axePath);
        driver = new ChromeDriver();

    }
    @Test
    public void testCaseVerifyHomePage() {
        driver.navigate().to("http://google.com");
        Assert.assertEquals("String aren't matching", driver.getTitle(), "Google");
    }

    @Test
    public void testCaseVerifyLogIn() {
        driver.navigate().to("https://www.duolingo.com/?isLoggingIn=true");
        boolean isUserLoggedInSuccessfully = true;
        boolean isUserLoggedOut = true;
        Assert.assertFalse("User failed to logIn", isUserLoggedInSuccessfully);
        Assert.assertTrue(isUserLoggedOut);

    }
    @After
    public void close() {
        driver.quit();
    }
}
