import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Dropdown {
        private static WebDriver chromeDriver;
        private static final int DELAY = 0;
        private static final String URL_TO_SITE = "https://formy-project.herokuapp.com/dropdown";
        private static final String PATH_TO_ITEMS_OF_DROPDOWN_MENU_BY_XPATH = "//div[@id=\"navbarNavDropdown\"]//div[@class=\"dropdown-menu\"]/a";
        private static final String ATTRIBUTE_OF_ITEM_IN_DROPDOWN = "href";
        List<WebElement> listOfWebElements;

        @BeforeClass
        public static void transferChromeDriverToLink() {
            String exePath = "/Users/anthony/Docs/Java Libraries/Drivers/chromedriver";
            System.setProperty("webdriver.chrome.driver", exePath);
            chromeDriver = new ChromeDriver();
            chromeDriver.navigate().to(URL_TO_SITE);
            chromeDriver.manage().timeouts().implicitlyWait(DELAY, TimeUnit.SECONDS);
        }

        @Test
        public void checkLinkOfAllElementsFromDropdownMenu() {
            listOfWebElements = chromeDriver.findElements(By.xpath(PATH_TO_ITEMS_OF_DROPDOWN_MENU_BY_XPATH));

            ArrayList<String> expectedLink = new ArrayList<String>();
            for (WebElement element : listOfWebElements) {
                expectedLink.add(element.getAttribute(ATTRIBUTE_OF_ITEM_IN_DROPDOWN));
            }

            ArrayList<String> actualUrls = new ArrayList<String>();
            for (int i = 0; i < listOfWebElements.size(); i++) {
                chromeDriver.navigate().to(expectedLink.get(i));
                actualUrls.add(chromeDriver.getCurrentUrl());
            }
            Assert.assertEquals(actualUrls, expectedLink, "These links are not equals.");
        }

        @AfterClass
        public void close() {
                chromeDriver.quit();
        }
    }

