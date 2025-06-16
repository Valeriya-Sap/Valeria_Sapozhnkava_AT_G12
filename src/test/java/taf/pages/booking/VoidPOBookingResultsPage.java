package taf.pages.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import taf.driver.Driver;

import java.time.Duration;

public class VoidPOBookingResultsPage {
    WebDriver driver = Driver.getDriver();

    private static String HIDE_BUTTON_XPATH = "//button[@aria-label = 'Скрыть меню входа в аккаунт.']";
    private static String SORT_BUTTON_XPATH = "//button[@data-testid='sorters-dropdown-trigger']";
    private static String RATING_ASC_XPATH = "//span[text()='Оценка объекта (по возрастанию)']";
    private static String RATING_FIVE_XPATH = "//input[@name='class=5']";
    private static String RATING_NINE_PLUS_XPATH = "//div[text()='Превосходно: 9+']";
    private static String FIRST_HOTEL_RATING_XPATH = "//div[@role='listitem'][1]//*[@data-testid='rating-stars']/..";
    private static String FIRST_HOTEL_TITLE = "//div[@role='listitem'][1]//div[@data-testid='title']";

    public VoidPOBookingResultsPage() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void refuseLogIn() {
        driver.findElement(By.xpath(HIDE_BUTTON_XPATH)).click();
    }

    public void sortByRatingAsc() {
        driver.findElement(By.xpath(SORT_BUTTON_XPATH)).click();
        driver.findElement(By.xpath(RATING_ASC_XPATH)).click();
    }

    public void filterByRatingFive() {
        driver.findElement(By.xpath(RATING_FIVE_XPATH)).click();
    }

    public void filterByNinePlus() {
        driver.findElement(By.xpath(RATING_NINE_PLUS_XPATH)).click();
    }

    public String getFirstHotelRating () {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        String firstHotelRating = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FIRST_HOTEL_RATING_XPATH)))
                .getAttribute("aria-label");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return firstHotelRating;
    }

    public void openFirstHotel () {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FIRST_HOTEL_TITLE)))
                .click();
        Object[] windowHandles = driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

}
