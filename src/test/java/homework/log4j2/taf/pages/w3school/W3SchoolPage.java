package homework.log4j2.taf.pages.w3school;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import homework.log4j2.taf.driver.Driver;

public class W3SchoolPage {
    private static final Logger LOGGER = LogManager.getLogger(W3SchoolPage.class);
    WebDriver driver = Driver.getDriver();

    private static String ACCEPT_COOKIES_XPATH = "//div[@id='accept-choices']";
    private static String TUTORIAL_TITLE_XPATH = "//h1/span[text()='Tutorial']";

    public W3SchoolPage() {
    }

    public void openW3SchoolPage() {
        driver.get("https://www.w3schools.com/java/");
        LOGGER.trace("W3schools is opened.");
    }

    public void acceptCookies() {
        driver.findElement(By.xpath(ACCEPT_COOKIES_XPATH)).click();
        LOGGER.trace("Accept cookies.");
    }

    public void copyTitle() {
        WebElement tutorial = driver.findElement(By.xpath(TUTORIAL_TITLE_XPATH));
        Actions make = new Actions(driver);
        make
                .doubleClick(tutorial)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("c")
                .perform();
        LOGGER.trace("Title is opened.");
    }

}