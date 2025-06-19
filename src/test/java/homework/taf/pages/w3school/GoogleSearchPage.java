package homework.taf.pages.w3school;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import homework.taf.driver.Driver;

import java.time.Duration;
import java.util.List;

public class GoogleSearchPage {
    WebDriver driver = Driver.getDriver();

    private static String ACCEPT_COOKIES_XPATH = "//div[text()='Принять все']/..";
    private static String SEARCH_NAME = "q";

    public GoogleSearchPage() {
    }

    public void openGoogleSearch() {

        driver.get("https://google.com");
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
    }

    public List<WebElement> takeAllTitles() {
        List<WebElement> resultTitles = driver.findElements(By.xpath("//h3"));
        return resultTitles;
    }

}

