package homework.taf.pages.w3school;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import homework.taf.driver.Driver;

import java.time.Duration;

public class W3SchoolPage {
    WebDriver driver = Driver.getDriver();

    private static String ACCEPT_COOKIES_XPATH = "//div[@id='accept-choices']";
    private static String TUTORIAL_TITLE_XPATH = "//h1/span[text()='Tutorial']";

    public W3SchoolPage() {
    }

    public void openW3SchoolPage() {
        driver.get("https://www.w3schools.com/java/");
    }

    public void acceptCookies() {
        driver.findElement(By.xpath(ACCEPT_COOKIES_XPATH)).click();
    }

    public void copyTitle() {
        WebElement tutorial = driver.findElement(By.xpath(TUTORIAL_TITLE_XPATH));
        Actions make = new Actions(driver);
        make
                .doubleClick(tutorial)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("c")
                .perform();
    }

}