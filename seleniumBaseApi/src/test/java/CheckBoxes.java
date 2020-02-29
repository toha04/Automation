import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class CheckBoxes {
        private static WebDriver chromeDriver;
        private static final int DELAY = 0;


        @BeforeClass
        public static void navigateChromeDriverToUrl() {
            String exePath = "/Users/anthony/Docs/Java Libraries/Drivers/chromedriver";
            System.setProperty("webdriver.chrome.driver", exePath);
            chromeDriver = new ChromeDriver();
            chromeDriver.navigate().to("https://formy-project.herokuapp.com/checkbox");
            chromeDriver.manage().timeouts().implicitlyWait(DELAY, TimeUnit.SECONDS);
        }

        @Test(dataProvider = "getXpathSelector", dataProviderClass = CheckByCSS.class)
        public void clickOnCheckBoxesByXPath(String path) {
            chromeDriver.findElement(By.xpath(path)).click();

        }

        @Test(dataProvider = "getCssSelector", dataProviderClass = CheckByXPath.class)
        public void clickOnCheckBoxesByCss(String path) {
            chromeDriver.findElement(By.cssSelector(path)).click();
        }

    @AfterClass
    public void close() {
            chromeDriver.quit();
    }
}

