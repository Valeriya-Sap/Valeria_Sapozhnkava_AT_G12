package pages.booking;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VoidPOBookingSearch {
    WebDriver driver = Driver.getWebDriver();

    private String search = "ss";
    private String accept = "//button[text()='Принять']";

    public void enterCity (String city) {
        driver.findElement(By.name(search)).sendKeys(city);

    }

    public void acceptCookies() {
        driver.findElement(By.xpath(accept)).click();
    }
}
