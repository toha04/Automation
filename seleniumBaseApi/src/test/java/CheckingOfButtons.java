
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class CheckingOfButtons {
    public  WebDriver chromeDriver;
    private  final int DELAY = 0;
    @BeforeClass
    public void transferChromeDriverToLink() {
        String exePath = "/Users/anthony/Docs/Java Libraries/Drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", exePath);
        chromeDriver = new ChromeDriver();
        chromeDriver.navigate().to("https://formy-project.herokuapp.com/buttons");
    }

    @Test ()
    public void clickOnPrimaryButton() {
        chromeDriver.findElement(By.xpath("//button[contains(text(), \"Primary\")]")).click();
    }
    @Test(priority = 1)
    public void clickOnButtonSuccess() {
        chromeDriver.findElement(By.className("btn-success")).click();
    }

    @Test(priority = 2)
    public void clickOnButtonInfo() {
        chromeDriver.findElement(By.className("btn-info")).click();
    }

    @Test(priority = 3)
    public void clickOnButtonWarning() {
        chromeDriver.findElement(By.className("btn-warning")).click();
    }

    @Test(priority = 4)
    public void clickOnButtonDanger() {
        chromeDriver.findElement(By.className("btn-danger")).click();
    }

    @Test(priority = 5)
    public void clickOnButtonLink() {
        chromeDriver.findElement(By.className("btn-link")).click();
    }

    @Test(priority = 6)
    public void clickOnButtonLeft() {
        chromeDriver.findElement(By.xpath("//button[contains(text(), \"Left\")]")).click();
    }

    @Test(priority = 7)
    public void clickOnButtonMiddle() {
        chromeDriver.findElement(By.xpath("//button[contains(text(), \"Middle\")]")).click();
    }

    @Test(priority = 8)
    public void clickOnButtonRight() {
        chromeDriver.findElement(By.xpath("//button[contains(text(), \"Right\")]")).click();
    }

    @Test(priority = 9)
    public void clickOnButtonOne() {
        chromeDriver.findElement(By.xpath("//button[contains(text(), \"1\")]")).click();
    }

    @Test(priority = 10)
    public void clickOnButtonTwo() {
        chromeDriver.findElement(By.xpath("//button[contains(text(), \"2\")]")).click();
    }

    @Test(priority = 11)
    public void clickOnLinkOneInDropdown() {
        chromeDriver.findElement(By.id("btnGroupDrop1")).click();
        chromeDriver.findElement(By.xpath("//a[contains(text(), \"Dropdown link 1\")]")).click();
    }

    @Test(priority = 12)
    public void clickOnLinkTwoInDropdown() {
        chromeDriver.findElement(By.id("btnGroupDrop1")).click();
        chromeDriver.findElement(By.xpath("//a[contains(text(), \"Dropdown link 2\")]")).click();
    }

    @AfterClass
    public void close() {
            chromeDriver.quit();

    }
}

