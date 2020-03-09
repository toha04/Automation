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

public class Dropdown {
        private static WebDriver chromeDriver;
        private static final int DELAY = 0;
        private static final String URL_TO_SITE= "https://formy-project.herokuapp.com/dropdown";
        private static final String PATH_TO_ITEMS_OF_DROPDOWN_MENU_BY_XPATH = "//div[@id=\"navbarNavDropdown\"]//div[@class=\"dropdown-menu\"]/a";
        private static final String ATTRIBUTE_OF_ITEM_IN_DROPDOWN = "href";
        List<WebElement> webElements;

        @BeforeClass
        public static void transferChromeDriverToLink() {
            String exePath = "/Users/anthony/Docs/Java Libraries/Drivers/chromedriver";
            System.setProperty("webdriver.chrome.driver", exePath);
            chromeDriver = new ChromeDriver();
            chromeDriver.navigate().to(URL_TO_SITE);
        }

        @Test
        public void checkLinkOfAllElementsFromDropdownMenu() {
            webElements = chromeDriver.findElements(By.xpath(PATH_TO_ITEMS_OF_DROPDOWN_MENU_BY_XPATH));

            ArrayList<String> expectedLink = new ArrayList<String>();
            for (WebElement element : webElements) {
                expectedLink.add(element.getAttribute(ATTRIBUTE_OF_ITEM_IN_DROPDOWN));
            }

            ArrayList<String> actualLink = new ArrayList<String>();
            for (int j = 0; j < webElements.size(); j++) {
                chromeDriver.navigate().to(expectedLink.get(j));
                actualLink.add(chromeDriver.getCurrentUrl());
            }
            Assert.assertEquals(actualLink, expectedLink, "These links are not equals.");
        }

        @AfterClass
        public void close() {
                chromeDriver.quit();
        }
    }

