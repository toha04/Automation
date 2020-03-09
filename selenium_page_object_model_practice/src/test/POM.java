package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;



public class POM {
    public WebDriver chromeDriver;


    //    public List<WebElement>
    @BeforeClass
    public void transferWebDriverToWeb() {
        String exePath = "/Users/anthony/Docs/Java Libraries/Drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", exePath);
        chromeDriver = new ChromeDriver();

    List<WebElement> zipCodes = chromeDriver.findElements(By.id("12345"));
    for (WebElement zipCode : zipCodes) {
        if (zipCode.getText().equals("12345")) {
            zipCode.click();
            break;
        }
    }
    WebElement city = chromeDriver.findElement(By.id("city"));
        Assert.assertEquals("MyCityName", city.getText());
    }
}
