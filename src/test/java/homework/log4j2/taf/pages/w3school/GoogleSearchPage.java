package homework.log4j2.taf.pages.w3school;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import homework.log4j2.taf.driver.Driver;

import java.util.List;

public class GoogleSearchPage {
    private static final Logger LOGGER = LogManager.getLogger(GoogleSearchPage.class);
    WebDriver driver = Driver.getDriver();

    private static String ACCEPT_COOKIES_XPATH = "//div[text()='Принять все']/..";
    private static String SEARCH_NAME = "q";

    public GoogleSearchPage() {
    }

    public void openGoogleSearch() {

        driver.get("https://google.com");
        LOGGER.trace("Google is opened.");
    }

    public void acceptCookies() {
        driver.findElement(By.xpath(ACCEPT_COOKIES_XPATH)).click();
    }

    public void search() {
        WebElement search = driver.findElement(By.name(SEARCH_NAME));
        Actions make2 = new Actions(driver);
        make2
                .click(search)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("v")
                .keyDown(Keys.ENTER)
                .perform();
        LOGGER.trace("Search performed");
    }

    public List<WebElement> takeAllTitles() {
        List<WebElement> resultTitles = driver.findElements(By.xpath("//h3"));
        LOGGER.trace("Save title list.");
        return resultTitles;
    }

}

