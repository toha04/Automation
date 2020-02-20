
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiTestCases {
    @Test
    public void verifyString() {
        String exePath = "/Users/anthony/Docs/Java Libraries/Drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.youtube.com/");
    }
}
